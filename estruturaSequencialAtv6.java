//Exercício 06
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1012.java
//Fazer um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e
//mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;
public class estruturaSequencialAtv6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double A,B,C;
        double pi = 3.14159;

        System.out.println("DIGITE 3 NÚMEROS SEGUIDOS:");
        A = scanner.nextDouble();
        B = scanner.nextDouble();
        C = scanner.nextDouble();

        System.out.printf(" TRIANGULO RETANGULO DE BASE A E ALTURA C = %.3f", (A*C)/2);
        System.out.printf("\n ÁREA DO CÍRCULO DE RAIO C = %.3f", (C*C)*pi);
        System.out.printf("\n ÁREA TRAPÉZIO DE BASES AB E ALTURA C = %.3f", ((A+B)*C)/2);
        System.out.printf("\n ÁREA DO QUADRADO DE LADO B = %.3f", B*B);
        System.out.printf("\n ÁREA RETANGULO DE LADOS AB = %.3f", A*B);
    }
}
