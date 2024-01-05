
public abstract class Quadrilatero extends FiguraGeometrica {

    public Quadrilatero() {

    }

    public Quadrilatero(String nome, float[] dimensoes) {
        super(4, nome, dimensoes);
        if (dimensoes.length != 4) {
            throw new IllegalArgumentException("O vetor " + this.nome + " deve ter um tamanho de 4 elementos.");
        }

        // Verifica se os números formam um quadrilátero
        if (!(dimensoes[0] + dimensoes[1] > dimensoes[2] && dimensoes[1] + dimensoes[2] > dimensoes[3])) {
            throw new IllegalArgumentException("Os números fornecidos não formam um quadrilátero válido.");
        }
    }


    //sobrescrita de metodos
    @Override
    public abstract float calcularArea();

	/*
	if (numLados != 4) {
		System.out.println("um quadrilatero possui 4 lados, vc digitou um valro diferente");

	}
	if (dimensoes[0] == dimensoes[1] && dimensoes[0] == dimensoes[2] && dimensoes[0] == dimensoes[3]) {
		System.out.println("eh um quadrado");
	}
	else if(
			((dimensoes[0] == dimensoes[2] && dimensoes[1] == dimensoes[3]) ||
			(dimensoes[0] == dimensoes[1] && dimensoes[2] == dimensoes[3]) ||
			(dimensoes[0] == dimensoes[3] && dimensoes[1]==dimensoes[2])
			)) {
		System.out.println("eh um retangulo");
	}
}*/
}