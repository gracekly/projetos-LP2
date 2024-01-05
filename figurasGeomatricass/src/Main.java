import java.util.ArrayList;

public class Main {
    public static void main(String args[]) {

        ArrayList<FiguraGeometrica> figuras = new ArrayList<>();

        // criando vetores dimensoes
        float d_tri_equilatero[] = {4, 4, 4};
        float d_tri_isosceles[] = {6, 6, 3};
        float d_tri_escaleno[] = {3, 4, 5};
        float d_quadrado[] = {4, 4, 4, 4};
        float d_retangulo[] = {4, 4, 5, 5};

        //criando figuras
        Equilatero t_e = new Equilatero("triangulo equilatero", d_tri_equilatero);
        Isosceles t_i = new Isosceles("triangulo isosceles", d_tri_isosceles);
        Escaleno t_esc = new Escaleno("triangulo escoleno", d_tri_escaleno);
        Quadrado quad = new Quadrado("quadrado", d_quadrado);
        Retangulo ret = new Retangulo("retangulo", d_retangulo);

        // adicionando objetos ao arraylist
        figuras.add(t_e);
        figuras.add(t_i);
        figuras.add(t_esc);
        figuras.add(quad);
        figuras.add(ret);

        t_e.mostrarDimensoes();
        t_i.mostrarDimensoes();

        t_e.calcularArea();
        System.out.println(t_esc.calcularPerimetro());
        System.out.println(t_i.calcularPerimetro());
        System.out.println(t_e.calcularPerimetro());
        System.out.println(t_esc.calcularPerimetro());
        System.out.printf("O perimetro do quadrado é %.1f", quad.calcularPerimetro());
        System.out.println();
        System.out.printf("O perimetro do retangulo é %.1f", ret.calcularPerimetro());
        System.out.println();

        compararPerimetro(t_e, t_i);
        System.out.println("perimetro: " + t_e.calcularPerimetro());
        System.out.println("perimetro :" + t_i.calcularPerimetro());
        compararArea(quad, ret);
    }

    // metodos

    public static void compararPerimetro(FiguraGeometrica a, FiguraGeometrica b) {
        if (a.calcularPerimetro() > b.calcularPerimetro()) {
            System.out.println("a medida do perimetro do " + a.getNome() + " é maior que a do " + b.getNome());
        } else if (a.calcularPerimetro() < b.calcularPerimetro()) {
            System.out.println("a medida do perimetro do " + a.getNome() + " é menor que a do " + b.getNome());
        } else {
            System.out.println("as medidas dos perimetros sao iguais");
        }
    }

    public static void compararArea(FiguraGeometrica a, FiguraGeometrica b) {
        if (a.calcularArea() > b.calcularArea()) {
            System.out.println("a area do " + a.getNome() + " é maior que a area do " + b.getNome());
        } else if (a.calcularArea() < b.calcularArea()) {
            System.out.println("a area do " + b.getNome() + " é maior que a area do " + a.getNome());
        } else {
            System.out.println("a medida das areas das figuras são iguais");
        }
    }

}