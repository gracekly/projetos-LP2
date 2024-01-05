public class Retangulo extends Quadrilatero {

    public Retangulo() {

    }

    public Retangulo(String nome, float[] dimensoes) {
        super(nome, dimensoes);
        if (!((dimensoes[0] == dimensoes[2] && dimensoes[1] == dimensoes[3]) ||
                (dimensoes[0] == dimensoes[1] && dimensoes[2] == dimensoes[3]) ||
                (dimensoes[0] == dimensoes[3] && dimensoes[1] == dimensoes[2]))) {
            throw new IllegalArgumentException("Os lados não formam um retângulo!");
        }
    }

    // Sobrescrita de métodos
    @Override
    public float calcularArea() {
        float area = 0;
        float lado_a = dimensoes[0];
        float lado_b = 0;
        for (float dimensao : dimensoes) {
            if (dimensao != lado_a) {
                lado_b = dimensao;
                break;
            }
        }
        area = lado_a * lado_b;
        return area;
    }
}
