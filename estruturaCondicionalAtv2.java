//Exercício 02
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond02.java
//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

import java.util.Scanner;
public class estruturaCondicionalAtv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        System.out.println("DIGITE UM NUMERO:");
        numero = scanner.nextInt();

        if ((numero%2)==0){
            System.out.printf("%d É PAR !!!",numero);
        } else {
            System.out.printf("%d É IMPAR !!!",numero);
        }
    }
}
