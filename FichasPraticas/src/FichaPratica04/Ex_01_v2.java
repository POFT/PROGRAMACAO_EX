package FichaPratica04;

import java.util.Scanner;

public class Ex_01_v2 {
    public static void main(String[] args) {

        //Ex_01: Implemente um programa que peça ao utilizador dois valores e um carácter representando uma das quatro operações aritméticas (+, -, *, /).
        // Apresente o resultado de aplicar a operação correspondente aos valores.
        // No final, deverá perguntar ao utilizador se deseja repetir, permitindo-lhe efetuar novos cálculos.
        //Exemplo: Deseja continuar? (introduza s/n).

        Scanner input = new Scanner(System.in);
        int numeroUser1, numeroUser2;
        String operacao, funcao;


        do { //FAZER...
            System.out.println("Introduza um valor: "); //Instrução
            numeroUser1 = input.nextInt();
            System.out.println("Introduza outro valor: "); //Instrução2
            numeroUser2 = input.nextInt();
            System.out.println("Escolha a operação aritemética (+, -, *, /): "); //Instrução3
            operacao = input.next();

            switch (operacao) { //SELECIONAR CASO... (Estrutura de seleção/escolha)
                case "+":
                    System.out.println("Soma = " + (numeroUser1 + numeroUser2));
                    break;
                case "-":
                    System.out.println("Subtracao = " + (numeroUser1 - numeroUser2));
                    break;
                case "*":
                    System.out.println("Multiplicacao = " + (numeroUser1 * numeroUser2));
                    break;
                case "/":
                    System.out.println("Divisao = " + (numeroUser1 / numeroUser2));
                    break;
                default:
                    System.out.println("Opção Inválida!");
            }
            System.out.println("Deseja continuar? (introduza s/n)");
            funcao = input.next();
        } while (funcao.equals("s")); // ENQUANTO...é Verdadeira (funcao é igual a "s"), quando é falsa o ciclo termina e o algoritmo continua na instrução imediatamente a seguir.
    }
}
