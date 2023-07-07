//Exercício 04
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1008.java
//Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
//hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
//decimais.

import java.util.Scanner;
public class estruturaSequencialAtv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int idFuncionario, totalHorasTrabalhadasNoMes, valorHoraFuncionario,salario;

        System.out.println("QUAL O SEU ID ?");
        idFuncionario = scanner.nextInt();
        System.out.println("QUANTAS HORAS VOCÊ TRABALHOU ESSE MÊS?");
        totalHorasTrabalhadasNoMes = scanner.nextInt();
        System.out.println("POR FIM, QUAL O VALOR DA SUA HORA? ");
        valorHoraFuncionario = scanner.nextInt();

        salario = totalHorasTrabalhadasNoMes*valorHoraFuncionario;

        System.out.printf("PARABÉNS FUNCIONÁRIO ID: %d, VOCÊ GANHOU %d REAIS ESSE MÊS!!!",idFuncionario,salario);
    }
}
