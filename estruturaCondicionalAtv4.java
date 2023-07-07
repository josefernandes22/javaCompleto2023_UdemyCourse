//Exercício 04
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1046.java
//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.

import java.util.Scanner;
public class estruturaCondicionalAtv4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hrInicial, hrFinal, calculoHoras;

        System.out.println("DIGITE A HORA INICIAL E A FINAL, RESPECTIVAMENTE:");
        hrInicial = scanner.nextInt();
        hrFinal = scanner.nextInt();

        if (hrFinal<hrInicial){
            calculoHoras = (24-hrInicial)+hrFinal;
            System.out.printf("VOCÊ JOGOU %d HORAS !!!", calculoHoras);
        } else if (hrFinal>hrInicial){
            calculoHoras = hrFinal-hrInicial;
            System.out.printf("VOCÊ JOGOU %d HORAS !!!", calculoHoras);
        } else {
            System.out.println("VOCÊ NÃO JOGOU NADA !!!");
        }
    }
}
