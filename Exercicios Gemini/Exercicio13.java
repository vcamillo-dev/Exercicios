/*
 * QUESTÃO 13: ESTATÍSTICAS DE VENDAS
 * Escreva um programa que:
 * 1. Peça ao usuário para digitar o valor de 5 produtos.
 * 2. Utilize um laço para ler esses valores.
 * 3. Use uma variável ACUMULADORA para somar o valor dos produtos >= 50.0.
 * 4. Use uma variável CONTADORA para saber quantos produtos custaram < 50.0.
 * 5. Ao final, exiba:
 * - O valor total dos produtos caros.
 * - A quantidade de produtos baratos (abaixo de 50).
 * * Exemplo de fluxo:
 * Prod 1: 60.0 | Prod 2: 20.0 | Prod 3: 70.0 | Prod 4: 10.0 | Prod 5: 100.0
 * Saída: 
 * Total dos caros: R$ 230.0
 * Quantidade de baratos: 2
 */

import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args){

    Scanner input = new Scanner(System.in);
    Double contador_pra_cima = 0.0;
    Double contador_pra_baixo = 0.0;

    for( int i = 1; i < 6 ; i = i + 1){
        System.out.println("Insira o valor do produto: ");
        Double valor = input.nextDouble();
        // calcular o valor dos produtos apenas >=50
        if(valor >=50){
            contador_pra_cima = contador_pra_cima + valor;
        } else {
            contador_pra_baixo = contador_pra_baixo + valor;
        }

    }
    System.out.println("O valor dos produtos caros eh :" + contador_pra_cima);
    System.out.println("O valor dos produtos baratos eh :" + contador_pra_baixo);

        input.close();
    }
}
