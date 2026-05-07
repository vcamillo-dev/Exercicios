/*
 * QUESTÃO 27: O SISTEMA DE PEDIDOS (SWITCH + DO-WHILE)
 * Escreva um programa que:
 * 1. Declare: int opcao.
 * 2. Utilize o do-while para repetir o menu.
 * 3. DENTRO do do-while:
 * - Exiba o menu: 1-Dog, 2-XSalada, 3-Refri, 0-Sair.
 * - Leia a opcao.
 * - Use o SWITCH(opcao) para tratar as escolhas:
 * - Caso 1, 2 e 3: Mostre o nome/preço (como na 26).
 * - Caso 0: Exiba "Finalizando pedido...".
 * - Default: Exiba "Opção inválida!".
 * 4. Condição do while: repetir enquanto opcao != 0.
 */

import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int opcao;
        
        do{
            System.out.println("Selecione 1-Dog, 2-X-Salada, 3-Refri, 0-Sair");
            opcao = input.nextInt();

            switch(opcao){
                case 1:
                    System.out.println("O Preco do Dog é 15 reais");
                    break;

                case 2:
                    System.out.println("O preço do X-Salada é 20 reais");
                    break;

                case 3:
                    System.out.println("O preço do Refri é 5 reais");

                    break;
                case 0:
                    System.out.println("Finalizando pedido até logo");

                default:
                    System.out.println("Opcção invalida insira um numero de 1 a 3 ou 0 para sair");

            }

        } while (opcao != 0);

        input.close();
    }
    
}
