package FichaPratica02;

import java.util.Scanner;

public class Ex_18 {
    public static void main(String[] args) {

        // Import Scanner - uso sempre que precisar de ler coisas do teclado
        Scanner input = new Scanner(System.in);

        // Declarar variáveis
        double ID, dias, vencimento, subAlimentacao, IRS, vencliquido, SegSocial1, SegSocial2, funcao;

        //Cargo E-Empregado, C-Chefe, A-Administrador
        //vencimento dia: Empregado=40,  Chefe=60, Administrador=80
        //SubAlimentacao: Empregado=5,  Chefe e Administrador=7.5
        //IRS 10% se inferior a 1000 eur
        //IRS 20% se superior a 1000 eur
        // SegSoc- Administrador=9% funcionario / 21% encargo entidade patronal
        // SegSoc- outros=11% funcionario / 23.75% encargo entidade patronal




        // Solicitar ID do Funcionario
        System.out.print("Introduza código de funcionário: ");
        ID = input.nextDouble();

        // Solicitar função
        System.out.print("Introduzir função E-Empregado, C-Chefe, A-Administrador ");
        funcao = input.nextDouble();

        // Solicitar dias trabalhados
        System.out.print("Introduza os nº de dias trabalhados: ");
        dias = input.nextDouble();

        vencimento = 40 * dias;
        System.out.println("\n" + "Valor ilíquido " + vencimento + "€");

        //Retenção de IRS:10%
        IRS = vencimento * 0.10;
        System.out.println("Retenção IRS " + IRS + "€");

        //Encargos Segurança Social (funcionário: 11%)631
        SegSocial1 = vencimento * 0.11;
        System.out.println("Segurança Social func " + SegSocial1 + "€");

        //Encargos Segurança Social (patrono: 23,75%)
        SegSocial2 = vencimento * 0.2375;
        System.out.println("Segurança Social pat " + SegSocial2 + "€" + "\n");

        // vencimento líquido
        vencliquido = vencimento - IRS - SegSocial1 - SegSocial2;
        System.out.println("Valor líquido: " + vencliquido + "€");

        // Subsídio de alimentação
        subAlimentacao = 5 * dias;
        System.out.println("Subsídio de alimentação: " + subAlimentacao + "€");


    }
}