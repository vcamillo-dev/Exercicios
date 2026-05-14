/*
 * QUESTÃO 30: CADASTRO DINÂMICO DE PRODUTOS
 * Escreva um programa que:
 * 1. Declare um array de Strings chamado "produtos" com tamanho 4.
 * 2. Utilize um laço FOR para ler os nomes do teclado e salvar no array.
 * - Dica: dentro do loop, você fará: produtos[i] = input.nextLine();
 * 3. Utilize um SEGUNDO laço FOR para exibir a lista completa de produtos cadastrados.
 * - Exemplo de saída: "Produto 1: [Nome]"
 */

import java.util.Scanner;

public class Exercicio30 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)) {
            String[] produtos = new String[4];
            
            for ( int i = 0; i < produtos.length ; i++){
                System.out.println("Insira os produtos que deseja adicionar na lista" + (i+1));
                produtos[i] = input.nextLine();
            }
            
            for (int i = 0; i < produtos.length; i ++){
                System.out.println("Produto: "+(i+1)+produtos[i]);
                
            }
        }
    }
    
}
