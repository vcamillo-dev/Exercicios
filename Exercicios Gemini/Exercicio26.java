/*
 * QUESTÃO 26: O CARDÁPIO (SWITCH CASE)
 * Escreva um programa que:
 * 1. Declare uma variável int codigoProduto.
 * 2. Peça para o usuário digitar o código do produto (1 a 3).
 * 3. Use o SWITCH (codigoProduto) para exibir o nome e o preço:
 * - Caso 1: "Cachorro-quente - R$ 10,00"
 * - Caso 2: "X-Salada - R$ 15,00"
 * - Caso 3: "Refrigerante - R$ 5,00"
 * - Default: "Código inválido!"
 * 
 * switch (variavel) {
    case 1:
        // O que acontece se a variavel for 1
        break; // IMPORTANTE: Para o código não "escorregar" para o próximo caso

    case 2:
        // O que acontece se a variavel for 2
        break;

    default:
        // O que acontece se não for nenhuma das opções acima (tipo o seu else final)
        break;
}
 */


import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)) {
            int codigoProduto;
            System.out.println("Insira o codigo do produto de 1 ate 3");
            codigoProduto = input.nextInt();
            
            switch (codigoProduto ){
                case 1:
                    System.out.println("Cachorro quente - R$10,00");
                    break;
                    
                case 2:
                    System.out.println("X-SALADA - R$ 15.00");
                    break;
                    
                case 3:
                    System.out.println("Refrigerante - R$ 5.00");
                    
                case 0:
                    System.out.println("Finalizando pedido até logo");
                    break;
                    
                default:
                    System.out.println("Numero invalido, insira um numero de 1 ate 3 ou 0 para sair");
            }
        }
    }
    
}
