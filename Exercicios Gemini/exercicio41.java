/*
 * QUESTÃO 41: CARRINHO DE COMPRAS COM SOMA TOTAL
 * * 1. Crie um ArrayList<String> chamado "carrinho" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "precos" (vazio).
 * * 3. Crie um loop WHILE que vai rodar exatamente 3 vezes (use um contador, ex: int i = 0).
 * * 4. Dentro do loop:
 * - Peça para o usuário digitar o NOME de um produto e adicione no "carrinho".
 * - Peça para o usuário digitar o PREÇO desse produto e adicione no "precos".
 * - Aumente o contador do seu while (i++).
 * * 5. DEPOIS que o while terminar (fora dele):
 * - Crie uma variável double chamada "total" começando em 0.0.
 * - Use um loop FOR para percorrer a lista de preços e ir somando cada valor na variável "total".
 * * 6. Ao final de tudo, exiba:
 * - A lista completa de produtos comprados.
 * - O valor total da compra.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio41 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)){

            ArrayList<String> carrinho = new ArrayList<>();

            ArrayList<Double> precos = new ArrayList<>();


            int contador = 0;

            while ( contador <3 ){
                System.out.println("Insira o nome de um produto");
                String produto = input.nextLine();
                carrinho.add(produto);

                System.out.println("Insira o preco do: " + produto );
                Double preco = input.nextDouble();
                precos.add(preco);

                input.nextLine();

                contador ++;
   
            }

            double total = 0.0;
            for ( int i = 0; i < precos.size(); i++){
                total = total + precos.get(i);
            }      

            System.out.println("A lista completa" + carrinho + "Custa um total de : " + total );


        }
    }
    
}
