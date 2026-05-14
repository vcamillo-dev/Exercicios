/*
 * QUESTÃO 35: BUSCA E DESCONTO NO ESTOQUE
 * * 1. Crie um ArrayList<String> chamado "produtos" e adicione 4 nomes:
 * "Monitor", "Teclado", "Mouse", "Fone".
 * * 2. Crie um ArrayList<Double> chamado "precos" e adicione os preços:
 * 1000.0, 150.0, 80.0, 200.0 (na mesma ordem dos produtos).
 * * 3. Peça para o usuário digitar o nome de um produto para buscar.
 * * 4. Use o método produtos.indexOf(nomeDigitado) para encontrar a posição.
 * * 5. SE o índice for diferente de -1:
 * - Pegue o preço no mesmo índice da lista "precos".
 * - Calcule 10% de desconto.
 * - Exiba o nome do produto e o novo preço com desconto.
 * * 6. SENÃO:
 * - Exiba "Produto não encontrado".
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio35 {
    public static void main(String[] arg){
        try ( Scanner input = new Scanner(System.in)) {

            ArrayList<String> produtos = new ArrayList<>();
            produtos.add("Monitor");
            produtos.add("Teclado");
            produtos.add("Mouse");
            produtos.add("Fone");

            ArrayList<Double> precos = new ArrayList<>();
            precos.add(1000.0);
            precos.add(150.0);
            precos.add(50.0);
            precos.add(200.0);

            System.out.println("Digite o nome do produto desejado");
            String busca = input.nextLine();

            int indiceEncontrado = -1;

            for ( int i = 0 ; i <produtos.size(); i++){
                if ( produtos.get(i).equalsIgnoreCase(busca)){
                    indiceEncontrado = i;
                    break;
                }
            }

            if ( indiceEncontrado != -1 ) {
                double precoOriginal = precos.get(indiceEncontrado);
                double precoComDesconto = precoOriginal * 0.90;

                System.out.println("\nProduto: " + produtos.get(indiceEncontrado));
                System.out.println("Preço Original: R$ " + precoOriginal);
                System.out.println("Preço com 10% de desconto: R$ " + precoComDesconto);

            }else {
                System.out.println("\nProduto não encontrado!");
            }

        }
    }    
}
