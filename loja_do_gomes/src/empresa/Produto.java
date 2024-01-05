package empresa;

public class Produto {

	// atributos

	private String nome;
	private String descricao;
	private float valor;
	private int estoque;

	// metodo construtor

	public Produto() {
	}

	public Produto(String nome, String descricao, float valor, int estoque) {

		this.setNome(nome);
		this.setDescricao(descricao);
		this.setValor(valor);
		this.setEstoque(estoque);

	}

	// encapsulamentos - metodos getters e setters

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		// System.out.println("Nome do novo produto: ");
		this.nome = nome;
	}

	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		// System.out.println("Descrição do novo produto: ");
		this.descricao = descricao;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		// System.out.println("Valor do novo produto (R$): ");
		this.valor = valor;
	}

	public int getEstoque() {
		return this.estoque;
	}

	public void setEstoque(int estoque) {
		// System.out.println("Estoque do novo produto (quantidade): ");
		this.estoque = estoque;
	}

	public void atualizarEstoque(int quant_vendido) {
		if (this.estoque > 0 && this.estoque - quant_vendido >= 0)
			this.estoque = estoque - quant_vendido;
	}

}
