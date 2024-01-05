package empresa;

import java.util.ArrayList;
import java.util.HashMap;

public class Loja {

    private String nome;
    public ArrayList<Produto> produtos;
    public ArrayList<Vendedor> vendedores;

    // metodo contrutor

    public Loja(String nome) {
        this.nome = nome;
        produtos = new ArrayList<>();
        vendedores = new ArrayList<>();
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    // Métodos

    // adiciona o parâmetro no ArrayList de produtos
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
        System.out.println("Produto adicionado com sucesso!\n");

    }

    // adciona o parametro no ArrayList de vendedores
    public void adicionarVendedor(Vendedor vendedor) {
        vendedores.add(vendedor);
        System.out.println("Vendedor adicionado com sucesso!\n");

    }

    // registra a venda na loja usando o HashMap da classe vendedor
    public void registrarVenda(Vendedor vendedor, Produto produto, int quantidade) {

        int novo_estoque = produto.getEstoque() - quantidade;

        if (vendedores.contains(vendedor) && produtos.contains(produto) && novo_estoque >= 0) {
            HashMap<Produto, Integer> vendas = vendedor.getVendas();
            if (vendas.containsKey(produto)) {
                int quant_anterior = vendas.get(produto);
                vendas.put(produto, quantidade + quant_anterior);
            } else {
                vendedor.vendas.put(produto, quantidade);
            }
            vendedor.setTotalVendido(produto.getValor() * quantidade);
            produto.setEstoque(novo_estoque);
            System.out.println("Venda registrada com sucesso!\n");

        } else {
            if (!vendedores.contains(vendedor)) {
                System.err.println("ERRO! Vendedor não encontrado :(");
                System.out.println();
            } else if (!produtos.contains(produto)) {
                System.err.println("ERRO! Produto não encontrado :(");
                System.out.println();
            } else if (novo_estoque < 1) {
                System.err.println("ERRO! Estoque insuficiente de " + produto.getNome() + " :(\n");

            }
        }

    }

    // Mostra os produtos que estão cadastrados no ArrayList de produtos da loja
    public void mostrarEstoque() {
        System.out.println("-----Estoque da loja-----\n");

        for (Produto produto : produtos) {
            System.out.println("Produto: " + produto.getNome() + " - " + "Valor (R$): " + produto.getValor() + " - "
                    + "Quantidade: " + produto.getEstoque() + "\n");

        }

    }

    /*
     * Chama o método criado na classe Vendedor para mostrar as informações
     * // individuais de cada vendedor e mostra o total vendido em toda a loja por
     * todos os vendedores
     */
    public void mostrarRelatorioCompleto() {

        float total_vendido_loja = 0;

        for (Vendedor vendedor : vendedores) {
            System.out.println();
            System.out.println();
            System.out.println(
                    "Matrícula do vendedor: " + vendedor.getMatricula() + "\t" + "Nome: " + vendedor.getNome() + "\n");
            vendedor.mostrarRelatorio();
            System.out.println();
            total_vendido_loja += vendedor.getTotalVendido();
        }
        System.out.println("Total vendido pela loja: " + total_vendido_loja + "\n");

    }

    // mostra os vendedores contidos no arraylist vendedores
    public void exibirVendedores() {
        System.out.println("-----Vendedores cadastrados disponíveis para atender vc-----\n");
        for (Vendedor vendedor : vendedores) {
            System.out.println("Matricula do Vendedor: " + vendedor.getMatricula() +
                    ", Nome do Vendedor: " + vendedor.getNome() + "\n");
        }
        System.out.println();
    }

    // metodos adcionais

    // remove o produto do arraylist produtos
    public void removerProduto(Produto produto) {
        if (produtos.contains(produto)) {
            produtos.remove(produto);
        }
    }

    // remove o vendedor do arraylist vendedores
    public void removerVendedor(Vendedor vendedor) {
        if (vendedores.contains(vendedor)) {
            vendedores.remove(vendedor);
        }
    }

}
