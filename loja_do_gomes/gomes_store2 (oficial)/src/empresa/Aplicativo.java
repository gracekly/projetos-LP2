//18/04/2023
//GRACE KELLY
//NYCOLE MARIA
//GIOVANNI

package empresa;

import java.util.Scanner;
import empresa.Loja;
import empresa.Produto;
import empresa.Vendedor;

public class Aplicativo {
    public static void main(String args[]) {

        // criando Loja
        Loja papelaria_gomes = new Loja("Papelaria Gomes");
        System.out.println("-----Bem vindes a " + papelaria_gomes.getNome() + "!-----\n");
        System.out.println("\n");

        // criandos os produtos
        Produto caneta = new Produto("Caneta", "Azul", 3, 25);
        Produto caderno = new Produto("Caderno", "96 folhas", 25, 20);
        Produto lapis = new Produto("Lapis", "HB", 1, 5);

        // criando vendedores
        Vendedor manoel_gomes = new Vendedor("Manoel Gomes", 1);
        Vendedor joao_gomes = new Vendedor("Joao Gomes", 2);
        Vendedor ciro_gomes = new Vendedor("Ciro Gomes", 3);

        // adicionando produtos na loja
        System.out.println("------Status das adições dos produtos-----\n");
        papelaria_gomes.adicionarProduto(caneta);
        papelaria_gomes.adicionarProduto(caderno);
        papelaria_gomes.adicionarProduto(lapis);

        // adicionando vendedores na loja
        System.out.println();
        System.out.println("-----Status das adições dos vendedores------\n");
        papelaria_gomes.adicionarVendedor(manoel_gomes);
        papelaria_gomes.adicionarVendedor(joao_gomes);
        papelaria_gomes.adicionarVendedor(ciro_gomes);

        // registrando vendas na loja
        System.out.println();
        System.out.println("-----Status das vendas-----\n");
        papelaria_gomes.registrarVenda(manoel_gomes, caneta, 5);
        papelaria_gomes.registrarVenda(manoel_gomes, caderno, 2);
        papelaria_gomes.registrarVenda(joao_gomes, lapis, 3);
        papelaria_gomes.registrarVenda(ciro_gomes, lapis, 2);
        papelaria_gomes.registrarVenda(manoel_gomes, caneta, 10);
        papelaria_gomes.registrarVenda(joao_gomes, caderno, 9);
        papelaria_gomes.registrarVenda(manoel_gomes, lapis, 1);
        papelaria_gomes.registrarVenda(ciro_gomes, caderno, 2);
        papelaria_gomes.registrarVenda(ciro_gomes, caneta, 2);
        System.out.println();

        // Menu de opções para o usuário escolher o que quer ver
        System.out.println();
        System.out.println("-----Sistema iniciado-----\n");
        System.out.println("Hi everybody!\n");
        System.out.println();
        int escolha = 0;
        while (escolha != 4) {

            Scanner input = new Scanner(System.in);

            System.out.println(
                    "Digite 1 para exibir os vendedores, 2 para ver o estoque, 3 para exibir o relatório completo da loja ou digite 4 para fechar o sistema: \n ");
            escolha = input.nextInt();
            switch (escolha) {
                case 1:
                    papelaria_gomes.exibirVendedores();
                    break;
                case 2:
                    papelaria_gomes.mostrarEstoque();

                    break;
                case 3:
                    papelaria_gomes.mostrarRelatorioCompleto();
                    break;
                default:
                    input.close();
                    break;
            }
        }
        System.out.println();
        System.out.println("Sistema fechado, até mais! :)\n");

        // Demonstração dos métodos adcionais
        System.out.println("-----DEMONSTRAÇÃO DOS MÉTODOS ADCIONAIS-----\n");
        System.out.println("-----Produtos após usar o método para remover produto-----\n");
        papelaria_gomes.removerProduto(lapis);
        papelaria_gomes.mostrarEstoque();
        System.out.println("-----Vendedores após usar o método remover vendedor-----\n");
        papelaria_gomes.removerVendedor(ciro_gomes);
        papelaria_gomes.exibirVendedores();
    }
}
