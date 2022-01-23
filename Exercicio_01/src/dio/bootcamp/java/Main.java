package dio.bootcamp.java;

public class Main {
    public static void main(String[] args) {
        System.out.println("\nExercício da Calculadora: ");
        Calculadora.soma(2, 3);
        Calculadora.subtracao(10, 8);
        Calculadora.multiplicacao(3, 6);
        Calculadora.divisao(10, 3);

        System.out.println("\nExercício das Mensagens: ");
        Mensagem.obterMensagem(10);
        Mensagem.obterMensagem(15);
        Mensagem.obterMensagem(21);

        System.out.println("\nExercício do Empréstimo: ");
        Emprestimo.calcular(5000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(5000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(5000, 4);
    }
}
