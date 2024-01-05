
public abstract class FiguraGeometrica implements FiguraPlanar {

    // atributos
    protected int numLados;
    protected String nome;
    protected float dimensoes[];

    // construtor
    public FiguraGeometrica() {

    }

    public FiguraGeometrica(int numLados, String nome, float[] dimensoes) {
        this.numLados = numLados;
        this.nome = nome;
        this.dimensoes = dimensoes;
    }

    // gets e sets
    public int getNumLados() {
        return numLados;
    }

    public void setNumLados(int numLados) {
        this.numLados = numLados;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float[] getDimensoes() {
        return dimensoes;
    }

    public void setDimensoes(float[] dimensoes) {
        this.dimensoes = dimensoes;
    }

    // metodo

    public float calcularPerimetro() {
        float soma_lados = 0;
        for (float dimensao : dimensoes) {
            soma_lados += dimensao;
        }
        return soma_lados;
    }

    public void mostrarDimensoes() {
        for (float i : this.getDimensoes()) {
            System.out.println("as dimensoes da figura geometrica " + this.nome + " são: " + i);
        }
    }

    /*
     * @Overr { if () }
     *
     * if(numLados<=2)
     *
     * { System.out.println("Uma figura geométrica deve ter mais de dois lados.");
     * }}
     */

    public abstract float calcularArea();

}
