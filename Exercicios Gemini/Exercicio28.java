/*
 * QUESTÃO 28: CAIXA DE LANCHONETE COMPLETO (SWITCH + REPETIÇÃO)
 * Escreva um programa que:
 * 1. Declare: int opcao, int qtdItens = 0; e double totalConta = 0;
 * 2. Utilize o do-while para o menu de vendas.
 * 3. DENTRO do do-while:
 * - Exiba o menu: 1-X-Burguer (R$20), 2-Batata (R$10), 3-Suco (R$5), 0-Finalizar.
 * - Leia a opcao.
 * - Use o SWITCH(opcao):
 * - Caso 1: Some 20.0 ao totalConta e aumente 1 na qtdItens.
 * - Caso 2: Some 10.0 ao totalConta e aumente 1 na qtdItens.
 * - Caso 3: Some 5.0 ao totalConta e aumente 1 na qtdItens.
 * - Caso 0: Exiba "Processando conta...".
 * - Default: Exiba "Produto inexistente!".
 * 4. Condição do while: repetir enquanto opcao != 0.
 * 5. Ao final (FORA DO LAÇO), exiba:
 * - "Quantidade de itens pedidos: " + qtdItens
 * - "Valor total a pagar: R$ " + totalConta
 */

import java.util.Scanner;

public class Exercicio28 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int opcao;
        int qntdItens = 0;
        double totalCOnta =0;

        do {
            System.out.println("Selecione 1, para X-Burguer, 2-Batata, 3 Suco, ou 0 para finalizar");
            opcao = input.nextInt();

            switch(opcao){
                
                case 1:
                    System.out.println("O valor do hamburguer é 20 reais");
                    qntdItens ++;
                    totalCOnta = totalCOnta + 20;
                    break;
                
                case 2:
                    System.out.println("O valor da batata é 15 reais");
                    qntdItens++;
                    totalCOnta = totalCOnta + 15;
                    break;
                
                case 3:
                    System.out.println("O valor do suco é 10 reais");
                    qntdItens++;
                    totalCOnta = totalCOnta+10;
                    break;
                
                case 0:
                    System.out.println("Finalizando os pedidos");
                
                default:
                    System.out.println("Insira um numero valido de 1 ate 3 ou 0 para sair");
            }
        } while (opcao !=0);

        System.out.println("O valor final dos pedidos é: " + totalCOnta);
        System.out.println("A qntdItens é: " + qntdItens);


        input.close();
    }
    
}
