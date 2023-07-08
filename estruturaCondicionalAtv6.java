//Exercício 06
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1037.java
//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor não estiver em
//nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

import java.util.Scanner;
public class estruturaCondicionalAtv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double numero;
        System.out.println("DIGITE UM NUMERO:");
        numero = scanner.nextDouble();

        if (numero>=0 && numero<25){
            System.out.printf("%.2f ESTÁ NO INTERVALO [0,25]",numero);
        } else if (numero>=25 && numero<50) {
            System.out.printf("%.2f ESTÁ NO INTERVALO [25,50]",numero);
        } else if (numero>=50 && numero<75) {
            System.out.printf("%.2f ESTÁ NO INTERVALO [50,75]",numero);
        } else if (numero>=75 && numero<=100) {
            System.out.printf("%.2f ESTÁ NO INTERVALO [75,100]",numero);
        } else {
            System.out.println("FORA DO INTERVALO!!!");
        }
    }
}
