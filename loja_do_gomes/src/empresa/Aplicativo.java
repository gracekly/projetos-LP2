package empresa;

import java.util.Scanner;

public class Aplicativo {
	public static void main(String args[]) {

		// criando produtos
		Loja papelaria_gomes = new Loja("papelaria gomes");
		Produto caneta = new Produto("caneta", "azul", 3, 25);
		Produto caderno = new Produto("caderno", "96 folhas", 25, 20);
		Produto lapis = new Produto("lapis", "HB", 1, 5);

		// criando vendedores
		Vendedor manoel_gomes = new Vendedor("manoel gomes", 1);
		Vendedor joao_gomes = new Vendedor("joao gomes", 2);
		Vendedor ciro_gomes = new Vendedor("ciro gomes", 3);

		// adicionando produtos
		papelaria_gomes.adicionarProduto(caneta);
		papelaria_gomes.adicionarProduto(caderno);
		papelaria_gomes.adicionarProduto(lapis);

		// adicionando vendedores
		papelaria_gomes.adicionarVendedor(manoel_gomes);
		papelaria_gomes.adicionarVendedor(joao_gomes);
		papelaria_gomes.adicionarVendedor(ciro_gomes);

		// registrando vendas
		papelaria_gomes.registrarVenda(manoel_gomes, caneta, 5);
		papelaria_gomes.registrarVenda(manoel_gomes, caderno, 2);
		papelaria_gomes.registrarVenda(joao_gomes, lapis, 3);
		papelaria_gomes.registrarVenda(ciro_gomes, lapis, 2);
		papelaria_gomes.registrarVenda(manoel_gomes, caneta, 10);
		papelaria_gomes.registrarVenda(joao_gomes, caderno, 9);
		papelaria_gomes.registrarVenda(manoel_gomes, lapis, 1);
		papelaria_gomes.registrarVenda(ciro_gomes, caderno, 2);
		papelaria_gomes.registrarVenda(ciro_gomes, caneta, 2);

		int escolha = 0;
		while (escolha != 3) {

			Scanner input = new Scanner(System.in);

			System.out.println("digite o tipo de relatorio 1 p/ estouqe, 2 p relatorio completo: ");
			escolha = input.nextInt();
			switch (escolha) {
				case 1:
					papelaria_gomes.mostrarEstoque();
					break;
				case 2:
					papelaria_gomes.mostrarRelatorioCompleto();

					break;
				default:
					System.out.println("opção invalida");
					input.close();
					break;
			}
		}
		System.out.println("sistema fechado.");

		// System.out.println("valor total vendido: " + ciro_gomes.valorTotalVendido());

	}
}
