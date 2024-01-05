package empresa;

import java.util.HashMap;

public class Vendedor {

    // atributos
    private int matricula;
    private String nome;
    public HashMap<Produto, Integer> vendas;
    private float total_vendido;

    // metodo construtor
    public Vendedor(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
        this.vendas = new HashMap<>();
        this.total_vendido = 0;
    }

    // getters e setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getTotalVendido() {
        return this.total_vendido;
    }

    public void setTotalVendido(float preco) {
        this.total_vendido += preco;
    }

    public HashMap<Produto, Integer> getVendas() {
        return vendas;
    }
    // outros metodos - mostra o relatorio individual de cada vendedor

    public void mostrarRelatorio() {
        System.out.println("-----Relatório do vendedor " + nome + "-----\n");
        for (Produto produto : vendas.keySet()) {
            int quantidade = vendas.get(produto);
            System.out.println("Nome do produto vendido: " + produto.getNome() + ".\n");
            System.out.println("Descrição do produto vendido: " + produto.getDescricao() + ".\n");
            System.out.println("Quantidade vendida do produto: " + quantidade + ".\n");
        }
        System.out.println("Valor total vendido: " + getTotalVendido() + ".\n");
    }

}
