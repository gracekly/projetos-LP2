package empresa;

import java.util.ArrayList;
import java.util.HashMap;

public class Loja {

	private String nome;
	public ArrayList<Produto> produtos;
	public ArrayList<Vendedor> vendedores;

	// metodo contrutor

	public Loja() {

	}

	public Loja(String nome) {
		this.nome = nome;
		produtos = new ArrayList<>();
		vendedores = new ArrayList<>();
	}

	public void registrarVenda(Vendedor vendedor, Produto produto, int quantidade) {

		int novo_estoque = produto.getEstoque() - quantidade;

		if (vendedores.contains(vendedor) && produtos.contains(produto) && novo_estoque >= 0) {
			HashMap<Produto, Integer> vendas = vendedor.getVendas();
			if (vendas.containsKey(produto)) {
				int quant_anterior = vendas.get(produto);
				vendas.put(produto, quantidade + quant_anterior);
			}
			else {
				vendedor.vendas.put(produto, quantidade);
			}
			vendedor.setTotalVendido(produto.getValor() * quantidade);
			produto.setEstoque(novo_estoque);
			System.out.println("Venda registrada com sucesso");

		} else {
			if (!vendedores.contains(vendedor)) {
				System.err.println("ERRO! Vendedor não encontrado.");
			} else if (!produtos.contains(produto)) {
				System.err.println("ERRO! Produto não encontrado");
			} else if (novo_estoque < 1) {
				System.err.println("ERRO! Estoque insuficiente de " + produto.getNome());
			}
		}

	}

	public void mostrarEstoque() {
		System.out.println("-----Estoque da loja-----");

		for (Produto produto : produtos) {
			System.out.println("Produto: " + produto.getNome() + " - " + "Valor (R$): " + produto.getValor() + " - "
					+ "Quantidade: " + produto.getEstoque());
		}

	}
	
	
	public void mostrarRelatorioCompleto() {
		
		float total_vendido_loja = 0;
		
		for(Vendedor vendedor : vendedores) {
			System.out.println();
			System.out.println();
			System.out.println("Código do vendedor: " + vendedor.getMatricula() + "\t" + "Nome: " + vendedor.getNome());
			System.out.println();
			vendedor.mostrarRelatorio();
			total_vendido_loja += vendedor.getTotalVendido();	
		}
		System.out.println("Total vendido pela loja: " + total_vendido_loja);
	}
	
	
	public void adicionarProduto(Produto produto) {
		
		produtos.add(produto);
		System.out.println("Produto adicionado com sucesso!");
	}
	
	public void adicionarVendedor(Vendedor vendedor) {
		vendedores.add(vendedor);
		System.out.println("Vendedor adicionado com sucesso!");
	}
	
	

}
