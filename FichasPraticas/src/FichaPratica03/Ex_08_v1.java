package FichaPratica03;

import java.util.Scanner;

public class Ex_08_v1 {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        // Faça um programa que leia um número inteiro e imprima os 5 anteriores e os 5 seguintes.
        //a. Por exemplo: Leu 15, deve imprimir: 10 11 12 13 14 16 17 18 19 20

        //Declarar variaveis
        int numeroUserInicio, anterioresCinco, seguintesCinco;

        //Solicitar ao user um número inteiro
        System.out.print("Digite um número inteiro: ");
        numeroUserInicio = input.nextInt(); //ler o número inteiro


        anterioresCinco = numeroUserInicio - 5;
        seguintesCinco = numeroUserInicio + 5;


        // Imprimir os 5 numeros anteriores do numero introduzido pelo utilizador.
        while (anterioresCinco <= seguintesCinco) {
            if (anterioresCinco!=numeroUserInicio){
                System.out.println(anterioresCinco);
            }else{
                System.out.println();
            }
            anterioresCinco = anterioresCinco + 1;
        }
    }
}
