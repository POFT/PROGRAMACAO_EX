package FichaPratica03;

import java.util.Scanner;

public class Ex_09 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Faça um programa que vai pedindo números ao utilizador até que este introduza o número -1. O computador
        //Deve dizer a média dos números introduzidos (excluindo o -1).

        //Declarar variáveis
        int limite = -1, numeroUser = 0, somaValor = 0, count = 0, media= 0;

        //solicitar numero ao user
        // System.out.println("Introduza um número:");
        // numero = input.nextInt();

        //se user escreve numero diferente de -1 programa volta a pedir para inserir numero
        //Enquanto numero introduzido pelo user é diferente de -1, bot solicita para escrever numero e le numero.


        while (numeroUser != limite){
            somaValor = somaValor + numeroUser;
            System.out.println("Introduza um número:");
            numeroUser = input.nextInt();
            if (numeroUser != limite){
                count = count + 1;
            }
        }
        media = somaValor / count;
        System.out.println("Média: " + media);

    }
}
