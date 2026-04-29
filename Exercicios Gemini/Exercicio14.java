/*
 * QUESTÃO 14: MÉDIA DE PREÇOS DINÂMICA
 * Escreva um programa que:
 * 1. Utilize um laço for para ler o preço de 5 produtos diferentes.
 * 2. Armazene a soma de todos esses preços em uma variável
 *  acumuladora (double total).
 * 3. Após o laço terminar (fora das chaves do for), calcule a média 
 * desses valores.
 *  * 4. Exiba no console:
 * - O valor total da soma.
 * - A média de preço por produto.
 * * Exemplo de fluxo:
 * Produto 1: 10.0 | Produto 2: 20.0 | Produto 3: 30.0 | Produto 4: 40.0 | Produto 5: 50.0
 * Saída esperada:
 * "O valor total da compra é: R$ 150.0"
 * "A média de preço por produto é: R$ 30.0"
 */

import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double soma = 0;
        int i;

        for (  i = 1 ; i < 6 ; i = i+1){
            System.out.println("Insira o valor do produto: ");
            double valor = input.nextDouble();
            soma = soma + valor;
        }
        System.out.println("O valor total dos produtos eh :" + soma);
        System.out.println("O valor mediano de cada produto eh :" + soma/i);
        


            input.close();

    }
    
}
