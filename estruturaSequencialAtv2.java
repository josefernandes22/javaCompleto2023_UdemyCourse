//Exercício 02
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1002.java
//Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
//casas decimais conforme exemplos.

import java.util.Scanner;
public class estruturaSequencialAtv2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double pi = 3.14159;
        double raio,area = 0;

        System.out.println("DIGITE O RAIO DO CIRCULO:");
        raio = scanner.nextDouble();
        area = pi*(raio*raio);

        System.out.printf("A AREA DO CIRCULO EQUIVALE A %.4f",area);
    }
}
