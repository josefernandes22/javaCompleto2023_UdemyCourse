//Exercício 03
//Correção: https://github.com/acenelio/nivelamento-java/blob/master/src/uri1044.java
//Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//ordem crescente ou decrescente.

import java.util.Scanner;
public class estruturaCondicionalAtv3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A,B;
        System.out.println("DIGITE OS DOIS NUMEROS A E B:");
        A = scanner.nextInt();
        B = scanner.nextInt();

        if (((A%B)==0) || ((B%A)==0)){
            System.out.printf("%d E %d SÃO MULTIPLOS !!!",A,B);
        }else{
            System.out.printf("%d E %d NÃO SÃO MULTIPLOS !!!",A,B);
        }
    }
}
