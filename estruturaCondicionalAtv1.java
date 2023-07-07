//Exercício 01
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/cond01.java
//Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

import java.util.Scanner;
public class estruturaCondicionalAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;

        System.out.println("DIGITE O NUMERO: ");
        numero = scanner.nextInt();

        if (numero < 0){
            System.out.printf("%d É NEGATIVO !!!",numero);
        } else if (numero > 0) {
            System.out.printf("%d É POSITIVO !!!",numero);
        } else {
            System.out.println("É ZERO !!!");
        }
    }
}
