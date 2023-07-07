//Exercício 03
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1007.java
//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
//de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;
public class estruturaSequencialAtv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A,B,C,D,resultado;

        System.out.println("DIGITE 4 NUMEROS EM SEQUÊNCIA:");
        A = scanner.nextInt();
        B = scanner.nextInt();
        C = scanner.nextInt();
        D = scanner.nextInt();
        resultado = ((A*B)-(C*D));

        System.out.printf("RESULTADO = %d",resultado);
    }
}
