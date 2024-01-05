
public class Quadrado extends Quadrilatero {

    public Quadrado() {

    }

    public Quadrado(String nome, float[] dimensoes) {
        super(nome, dimensoes);
        for (int i = 0; i < dimensoes.length; i++) {
            if (dimensoes[0] != dimensoes[i]) {
                throw new IllegalArgumentException("O vetor " + this.nome + " deve ter os 4 elementos iguais.");
            }
        }
    }

    public float calcularArea() {
        float lado = dimensoes[0];
        float area = lado * lado;
        return area;
    }

}
