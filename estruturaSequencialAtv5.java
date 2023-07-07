//Exercício 05
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1010.java
//Fazer um programa para ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, o
//código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Calcule e mostre o valor a ser pago.

import java.util.Scanner;
public class estruturaSequencialAtv5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codigoPeca1, codigoPeca2, numeroPecas1, numeroPecas2;
        double valorDaPeca1, valorDaPeca2, valorFinalPedido1, valorFinalPedido2, valorFinal;

        System.out.println("PEDIDO 1: DIGITE O CÓDIGO, QUANTIDADE DE PEÇAS, E VALOR DA PEÇA, RESPECTIVAMENTE:");
        codigoPeca1 = scanner.nextInt();
        numeroPecas1 = scanner.nextInt();
        valorDaPeca1 = scanner.nextDouble();
        valorFinalPedido1 = numeroPecas1*valorDaPeca1;
        System.out.printf("RESUMO PEDIDO 1:\nCÓD DA PEÇA: %d \nQTD PEÇAS: %d \nVALOR PEÇA: %f \nVALOR PEDIDO 1: %.2f \n", codigoPeca1,numeroPecas1,valorDaPeca1,valorFinalPedido1);

        System.out.println("PEDIDO 2: DIGITE O CÓDIGO, QUANTIDADE DE PEÇAS, E VALOR DA PEÇA, RESPECTIVAMENTE:");
        codigoPeca2 = scanner.nextInt();
        numeroPecas2 = scanner.nextInt();
        valorDaPeca2 = scanner.nextDouble();
        valorFinalPedido2 = numeroPecas2*valorDaPeca2;
        System.out.printf("RESUMO PEDIDO 2:\nCÓD DA PEÇA: %d \nQTD PEÇAS: %d \nVALOR PEÇA: %f \nVALOR PEDIDO 1: %.2f\n", codigoPeca2,numeroPecas2,valorDaPeca2,valorFinalPedido2);

        valorFinal = valorFinalPedido1+valorFinalPedido2;
        System.out.printf("VALOR FINAL A PAGAR = %.2f",valorFinal);

    }
}
