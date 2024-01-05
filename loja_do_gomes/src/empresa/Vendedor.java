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

    public void mostrarRelatorio() {
        System.out.println("-----Relatório do vendedor " + nome + "-----");
        for (Produto produto : vendas.keySet()) {
            int quantidade = vendas.get(produto);
            System.out.println("Nome do produto vendido: " + produto.getNome() + ".");
            System.out.println("Descrição do produto vendido: " + produto.getDescricao());
            System.out.println("Quantidade vendida de cada produto: " + quantidade);
        }
        System.out.println("Valor total vendido: " + getTotalVendido());
    }

}
