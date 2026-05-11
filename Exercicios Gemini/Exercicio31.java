/*
 * QUESTÃO 31: ARRAYLIST (A LISTA DINÂMICA)
 * Escreva um programa que:
 * 1. Importe: import java.util.ArrayList;
 * 2. Declare: ArrayList<String> compras = new ArrayList<>();
 * 3. Use um while(true) para pedir itens.
 * 4. SE o usuário digitar "sair", use o comando "break" para sair do loop.
 * 5. SENÃO, use compras.add(item) para adicionar na lista.
 * 6. Ao final, use um for para exibir todos os itens e o total de itens (compras.size()).
 */

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio31 {
    public static void main(String[] arg){
    Scanner input = new Scanner(System.in);

    ArrayList<String> compras = new ArrayList<>();
    String produto;


    while (true) {
        System.out.println("Digite o produto (ou sair para finalizar)");
        produto = input.nextLine();


        if (produto.equalsIgnoreCase("Sair")) {
            break;
        }
        compras.add(produto);
    }

    for(int i = 0; i < compras.size(); i++){
        System.out.println("Item " + (i+1) +": " + compras.get(i));
    }

    System.out.println("Total de items: " + compras.size());

    input.close();



    }
}
