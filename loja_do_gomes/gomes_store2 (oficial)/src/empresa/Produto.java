package empresa;

public class Produto {

    // atributos

    private String nome;
    private String descricao;
    private float valor;
    private int estoque;

    // metodo construtor

    public Produto(String nome, String descricao, float valor, int estoque) {

        this.nome = nome;
        this.descricao = descricao;
        this.valor = valor;
        this.estoque = estoque;

    }

    // getters e setters

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public int getEstoque() {
        return this.estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

}
