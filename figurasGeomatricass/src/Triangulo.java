public class Triangulo extends FiguraGeometrica {
    //metodo construtor
    public Triangulo() {

    }

    public Triangulo(String nome, float[] dimensoes) {
        super(3, nome, dimensoes);
        if (dimensoes.length != 3) {
            throw new IllegalArgumentException("O vetor " + this.nome + " deve ter um tamanho de 3 elementos.");
        }
        // Verifica se os lados formam um triângulo
        if (!(dimensoes[0] + dimensoes[1] > dimensoes[2] &&
                dimensoes[1] + dimensoes[2] > dimensoes[0] &&
                dimensoes[0] + dimensoes[2] > dimensoes[1])) {
            throw new IllegalArgumentException("Os lados não formam um triângulo válido.");
        }
    }

    //if(this.dimensoes.length!=3) {
    //System.out.println("asdfgh");
    //}

    //sobrescrita de metodos


    @Override
    public float calcularArea() {
        float area = 0;
        float s = calcularPerimetro() / 2;
		/*
		int cont = 0;
		for(float dimensao : dimensoes) {
			cont++;
		}
		if(cont!=3) {
			System
		}*/
        area = (float) Math.sqrt(s * (s - dimensoes[0]) * (s - dimensoes[1]) * (s - dimensoes[2]));

        return area;
    }

	/*
	if (numLados!=3) {
		System.out.println("Um triangulo possui 3 lados");

	}
	if (dimensoes[0]==dimensoes[1] && dimensoes[0]==dimensoes[2]) {
		System.out.println("é um triangulo equilatero");

	}
	/*else if (dimensoes[0] == dimensoes[1] && dimensoes[0]!=dimensoes[2] ||
			dimensoes[0]!=dimensoes[1] && dimensoes[0]==dimensoes[2] ||
			dimensoes[1]== dimensoes[2] && dimensoes[1]!= dimensoes[0])

	else if (dimensoes[0]!=dimensoes[1] && dimensoes[0]!=dimensoes[2] && dimensoes[1]!=dimensoes[2]) {
		System.out.println("é um triangulo escaleno");
	}
	else {
		System.out.println("é um triangulo isosceles");
	}
	*/


}
