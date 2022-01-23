package dio.bootcamp.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercício do Quadrilátero:");

        double quadrado = Quadrilatero.area(5);
        System.out.println("Área do Quadrado: " + quadrado);

        double retangulo = Quadrilatero.area(3d, 5d);
        System.out.println("Área do Retângulo: " + retangulo);

        double trapezio = Quadrilatero.area(7, 5, 6);
        System.out.println("Área do Trapézio: " + trapezio);

        double losango = Quadrilatero.area(7f, 8f);
        System.out.println("Área do Losango: " + losango);
    }
}
