package FichaPratica02;

import java.util.Scanner;

public class Ex_14 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Escreva um programa que leia 3 números
        int a, b, c;

        System.out.print("Insira um número (1 a 10):");
        a = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        b = input.nextInt();
        System.out.print("Insira outro número (1 a 10):");
        c = input.nextInt();


        //SE a < b && a < c
        //SE b < a && b < c
        //SE c < a && c < b


        if (a < b && a < c) {
            if (b < c) {
                System.out.print(a + "\t" + b + "\t" + c);
            } else {
                System.out.print(a + "\t" + c + "\t" + b);
            }
        }
        if (b < a && b < c) {
            if (a < c) {
                System.out.print(b + "\t" + a + "\t" + c);
            } else {
                System.out.print(b + "\t" + c + "\t" + a);
            }
        }
        if (c < a && c < b) {
            if (b < a) {
                System.out.print(c + "\t" + b + "\t" + a);
            } else {
                System.out.print(c + "\t" + a + "\t" + b);
            }
        }

    }
}
