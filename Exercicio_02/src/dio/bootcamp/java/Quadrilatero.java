package dio.bootcamp.java;

public class Quadrilatero {
    public static void area(double lado) {
        System.out.println("Área do Quadrado: " + lado * lado);
    }

    public static void area(double lado1, double lado2) {
        System.out.println("Área do Retângulo: " + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
        System.out.println("Área do Trapézio: " + ((baseMaior + baseMenor) * altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
        System.out.println("Área do Losango: " + (diagonal1 * diagonal2) / 2);
    }
}
