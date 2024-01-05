
public class Equilatero extends Triangulo {

    public Equilatero() {

    }

    public Equilatero(String nome, float[] dimensoes) {
        super(nome, dimensoes);
        if (!(dimensoes[0] == dimensoes[1] && dimensoes[0] == dimensoes[2] && dimensoes[1] == dimensoes[2])) {
            throw new IllegalArgumentException("Os lados não formam um triângulo equilátero!");
        }

    }
}
