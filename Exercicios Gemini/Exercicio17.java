/*
 * QUESTÃO 17: O CAIXA ILIMITADO
 * Escreva um programa que:
 * 1. Crie uma variável double total = 0.
 * 2. Utilize o laço "while" para repetir a leitura de preços.
 * 3. A condição do while deve ser: (valor != 0).
 * 4. Dentro do laço, peça o preço e some ao total.
 * 5. Se o usuário digitar 0, o laço para e exibe o total da compra.
 * * DICA: Peça o primeiro valor ANTES de entrar no while para a 
 * condição ter o que testar.
 */

import java.util.Scanner;

public class Exercicio17 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
    
        double total = 0;

        System.out.println("Insira o valor do produto (ou 0 para encerrar)");
        double valor = input.nextDouble();
        total = total + valor;

        while(valor !=0) {
            System.out.println("Insira o valor do produto (ou 0 para encerrar)");
            valor = input.nextDouble();
            total = total + valor;

        }

        System.out.println("O valor total dos produtos eh : "+ total);


        input.close();
    }
    
}
