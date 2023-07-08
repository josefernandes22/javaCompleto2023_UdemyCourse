//Exercício 07
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1041.java
//Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
//Se o ponto estiver na origem, escreva a mensagem “Origem”.
//Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a
//situação.

import java.util.Scanner;
public class estruturaCondicionalAtv7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double x,y;
        System.out.println("DIGITE OS DOIS PONTOS CARTESIANOS EM SEQUÊNCIA");
        x = scanner.nextDouble();
        y = scanner.nextDouble();

        if (x>0 && y>0){
            System.out.println("QUADRANTE 1");
        } else if (x<0 && y>0) {
            System.out.println("QUADRANTE 2");
        } else if (x<0 && y<0) {
            System.out.println("QUADRANTE 3");
        } else if (x>0 && y<0) {
            System.out.println("QUADRANTE 4");
        } else if (x==0 && y!=0) {
            System.out.println("PONTO NO EIXO Y");
        } else if (x!=0 && y==0) {
            System.out.println("PONTO NO EIXO X");
        }else{
            System.out.println("ORIGEM");
        }
    }
}
