//Exercício 05
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1038.java
//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
//seguir, calcule e mostre o valor da conta a pagar.

import java.util.Scanner;
public class estruturaCondicionalAtv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int opcaoMenu, quantidade;
        double valorFinal;

        System.out.println("==========================");
        System.out.println("======     MENU     ======");
        System.out.println("[1] CACHORRO QUENTE = 4,00");
        System.out.println("[2]    X - SALADA   = 4,50");
        System.out.println("[3]    X - BACON    = 5,00");
        System.out.println("[4] TORRADA SIMPLES = 2,00");
        System.out.println("[5]    REFRIGERANTE = 1,50");

        System.out.println("\n ESCOLHA 1 ITEM:");
        opcaoMenu = scanner.nextInt();

        switch (opcaoMenu){
            case 1:
                System.out.println("QUANTOS GOSTARIA DE COMPRAR ?");
                quantidade = scanner.nextInt();
                valorFinal = 4.0*quantidade;
                System.out.printf("TOTAL A PAGAR = %.2f", valorFinal);
                break;
            case 2:
                System.out.println("QUANTOS GOSTARIA DE COMPRAR ?");
                quantidade = scanner.nextInt();
                valorFinal = 4.5*quantidade;
                System.out.printf("TOTAL A PAGAR = %.2f", valorFinal);
                break;
            case 3:
                System.out.println("QUANTOS GOSTARIA DE COMPRAR ?");
                quantidade = scanner.nextInt();
                valorFinal = 5.0*quantidade;
                System.out.printf("TOTAL A PAGAR = %.2f", valorFinal);
                break;
            case 4:
                System.out.println("QUANTOS GOSTARIA DE COMPRAR ?");
                quantidade = scanner.nextInt();
                valorFinal = 2.0*quantidade;
                System.out.printf("TOTAL A PAGAR = %.2f", valorFinal);
                break;
            case 5:
                System.out.println("QUANTOS GOSTARIA DE COMPRAR ?");
                quantidade = scanner.nextInt();
                valorFinal = 1.5*quantidade;
                System.out.printf("TOTAL A PAGAR = %.2f", valorFinal);
                break;
        }
    }
}
