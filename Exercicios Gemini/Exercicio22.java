/*
 * QUESTÃO 22: O SOMADOR DE NÚMEROS POSITIVOS (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare as variáveis: int numero e int soma = 0.
 * 2. Utilize o do-while para pedir números ao usuário continuamente.
 * 3. DENTRO do laço:
 *    - Peça para o usuário digitar um número (0 para sair).
 *    - SE o número for maior que 0:
 *        - Adicione esse número à variável "soma".
 *    - SENÃO SE o número for menor que 0:
 *        - Exiba: "Apenas números positivos são aceitos!".
 * 4. A condição do while deve ser: continuar enquanto o número for diferente de 0.
 * 5. Ao final (fora do laço), exiba o valor total da soma.
 */

import java.util.Scanner;

public class Exercicio22 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        

        int numero;
        int soma = 0;

        do {
            System.out.println("Insira um numero ou o numero 0 para sair");
            numero = input.nextInt();
            
            if (numero > 0){
                soma = soma+numero;

            }else if (numero < 0)
                System.out.println("Apenas números positivos são aceitos");

        } while (numero != 0); {

        System.out.println("A somta total dos numeros é "+ soma);
            
        }

        
        
        input.close();

    }
    
}
