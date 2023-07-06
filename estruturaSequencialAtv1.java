//Exercício 01
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1003.java
//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
//mensagem explicativa, conforme exemplos.

import java.util.Scanner;
public class estruturaSequencialAtv1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = 0;
        int num2 = 0;

        System.out.println("DIGITE O PRIMEIRO NUMERO:");
        num1 = scanner.nextInt();
        System.out.println("DIGITE O SEGUNDO NUMERO:");
        num2 = scanner.nextInt();

        System.out.println(num1+ " + "+num2 +" É IGUAL A: " + (num1+num2));
        scanner.close();
    }
}
