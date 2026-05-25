/*
 * QUESTÃO 46: O PRODUTO MAIS BARATO (MENOR VALOR + ÍNDICE)
 * * 1. Crie um ArrayList<String> chamado "produtos" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "precos" (vazio).
 * * 3. Crie um loop WHILE que rode exatamente 3 vezes para cadastrar 
 * o nome do produto e o preço dele.
 * * 4. Fora do while:
 * - Crie uma variável double "menorPreco" começando com um valor bem alto (ex: 99999.0).
 * - Crie uma variável int "indiceMaisBarato" começando em 0.
 * * 5. Use um loop FOR para percorrer a lista de preços.
 * - Dentro do FOR, faça um IF para ver se o preço atual é MENOR (<) que "menorPreco".
 * - Se for menor, atualize as DUAS coisas dentro das chaves { }:
 * a) A variável "menorPreco" recebe o preço atual.
 * b) A variável "indiceMaisBarato" recebe o índice 'i' atual.
 * * 6. Ao final, use o "indiceMaisBarato" para exibir o nome do produto campeão de economia e o preço dele.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio46 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)){
            ArrayList<String> produtos = new ArrayList<>();
            ArrayList<Double> precos = new ArrayList<>();

            int contador = 0 ;
            while ( contador < 3){
                System.out.println("Insira o nome do produto");
                String nome_produto = input.nextLine();
                produtos.add(nome_produto);

                System.out.println("Insira o valor do produto: ");
                String valor_texto = input.nextLine();
                Double valor_numero = Double.parseDouble(valor_texto);
                precos.add(valor_numero);

                contador ++;
            }
            double menorPreco = 99999.0;
            int indice_Barato = 0;

/*5. Use um loop FOR para percorrer a lista de preços.
 * - Dentro do FOR, faça um IF para ver se o preço atual é MENOR (<) que "menorPreco".
 * - Se for menor, atualize as DUAS coisas dentro das chaves { }:
 * a) A variável "menorPreco" recebe o preço atual.
 * b) A variável "indiceMaisBarato" recebe o índice 'i' atual.
 * * 6. Ao final, use o "indiceMaisBarato" para exibir o nome do produto campeão de economia e o preço dele.
 */
            for ( int i = 0; i < precos.size(); i++){
                if (precos.get(i) < menorPreco){
                    menorPreco = precos.get(i);
                    indice_Barato = i;
                }
            }

            System.out.println("O produto mais barato eh: " + produtos.get(indice_Barato)+" E o preco dele eh: "+ menorPreco);

 
        }
    }    
}
