/*
 * QUESTÃO 12: FILTRO DE PROMOÇÃO
 * * Escreva um programa que:
 * 1. Peça ao usuário para digitar o valor de 5 produtos.
 * 2. Utilize um laço de repetição para ler esses valores.
 * 3. Some ao total APENAS os produtos que custarem mais de R$ 20,00.
 * 4. Ao final, exiba o valor total da soma dos produtos filtrados.
 * * Exemplo de fluxo:
 * Produto 1: 10.0 (ignora)
 * Produto 2: 25.0 (soma)
 * Produto 3: 30.0 (soma)
 * Produto 4: 5.0  (ignora)
 * Produto 5: 100.0(soma)
 * Saída esperada: "O total dos produtos selecionados é: R$ 155.0"
 */

import java.util.Scanner;


public class Exercicio12 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        double contador = 0;
    

    for( double i = 1; i < 6 ; i = i+1 ){
        System.out.println("Insira o valor do produto: ");
        Double valor = input.nextDouble();

        if(valor > 20){
            contador = contador + valor;
        }
    }

    System.out.println("O valor dos produtos caros somados eh :" + contador);
    input.close();

    }
    
}
