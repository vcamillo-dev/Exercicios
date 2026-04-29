/*
 * QUESTÃO 18: QUANTIDADE E TOTAL NO CAIXA
 * Escreva um programa que:
 * 1. Utilize um laço while para ler preços de produtos.
 * 2. O programa para quando o valor 0 for digitado.
 * 3. Use a "perfumaria": leia o próximo valor no FINAL do laço.
 * 4. Ao final, exiba:
 * - O valor total da compra.
 * - A quantidade total de itens (sem contar o 0).
 * * Exemplo: Digitou 10, depois 20, depois 0.
 * Saída: Total R$ 30.0 | Itens: 2.
 */

import java.util.Scanner;

    public class Exercicio18 {
        public static void main(String[] arg){
            Scanner input = new Scanner(System.in);

            double total = 0;
            int quantidade =0;

            System.out.println("Insira o valor do produto:");
            double valor = input.nextDouble();

            while(valor !=0){
                total = total + valor;
                quantidade = quantidade +1;

                System.out.println("Insira o valor do produto ou 0 para sair");
                valor = input.nextDouble();
            }

        System.out.println("o Valor total da compra eh : "+ total);
        System.out.println("o Valor total de itens eh : "+ quantidade);




            input.close();
        }
}
