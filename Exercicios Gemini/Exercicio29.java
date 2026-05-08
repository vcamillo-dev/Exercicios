/*
 * QUESTÃO 29: CONHECENDO O ARRAY FIXO
 * No Java, o array tem tamanho fixo e tipo fixo. 
 * Diferente do JS, você não pode simplesmente dar um .push() para aumentar o tamanho.
 * * Escreva um programa que:
 * 1. Declare um array de Strings chamado "produtos" com tamanho 3.
 * Ex: String[] produtos = new String[3];
 * 2. Atribua valores aos índices manualmente:
 * - No índice 0: "Hambúrguer"
 * - No índice 1: "Batata Frita"
 * - No índice 2: "Refrigerante"
 * 3. Utilize um laço "for" (o clássico) para percorrer o array.
 * A estrutura é: for(int i = 0; i < produtos.length; i++) { ... }
 * 4. Dentro do laço, imprima: "Posição " + i + ": " + produtos[i];

 */

import java.util.Scanner;

public class Exercicio29{
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        String[] produtos =  new String[3];

        produtos[0] = "Hamburguer";
        produtos[1] = "Batata";
        produtos[2] = "Refri";


        for (int i = 0 ; i < produtos.length; i++){
            System.out.println("Produto " + i + " : "  + produtos[i]);

        }



        input.close();
    }
}