/*
 * QUESTÃO 34: REMOÇÃO E ATUALIZAÇÃO
 * 1. Crie um ArrayList<Double> chamado "precos".
 * 2. Adicione 3 preços manualmente usando precos.add(10.5); etc.
 * 3. Remova o primeiro item da lista usando: precos.remove(0);
 * 4. Altere o valor do item que sobrou na posição 0 para 99.99 usando:
 * precos.set(0, 99.99);
 * 5. Use um FOR para exibir a lista final e o novo tamanho dela.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio34 {
    public static void main(String[] arg){

        try (Scanner input = new Scanner(System.in)){

            ArrayList<Double> precos = new ArrayList<>();
            double preco;

            for ( int i = 0 ; i < 3 ; i ++){
                System.out.println("Insira o valor do item " + (i+1));
                preco = input.nextDouble();
                precos.add(preco);
            }

            precos.remove(0);
            precos.set(0,99.99);

            for ( int i = 0 ; i < precos.size(); i++){
                System.out.println("Os precos, foram alterados para os seguintes produtos : ");
            }

            System.out.println("Lista atualizada com primeiro preco removido. :" + precos);



            input.close();

        }

    }
    
}