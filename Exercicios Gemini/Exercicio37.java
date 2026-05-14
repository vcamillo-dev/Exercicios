/*
 * QUESTÃO 37: CONSULTA DE PREÇOS NO ESTOQUE (WHILE + BUSCA EM ARRAYS)
 * * 1. Crie um ArrayList<String> chamado "produtos" e adicione: 
 * "Arroz", "Feijão", "Macarrão".
 * * 2. Crie um ArrayList<Double> chamado "precos" e adicione: 
 * 25.50, 9.80, 5.20 (na mesma ordem dos produtos).
 * * 3. Crie uma estrutura de repetição (WHILE) que continue rodando 
 * até que o usuário encontre um produto válido.
 * * 4. Dentro do loop, peça para o usuário digitar o nome do produto.
 * * 5. Use um loop FOR para encontrar o ÍNDICE do produto digitado.
 * (Dica: use .equalsIgnoreCase() para comparar as Strings).
 * * 6. SE o produto existir:
 * - Use o índice encontrado para buscar o valor no array de "precos".
 * - Exiba: "O produto [NOME] custa R$ [VALOR]".
 * - Encerre o loop (mude a variável de controle do while).
 * * 7. SENÃO (se o produto não existir):
 * - Exiba: "Produto não encontrado. Tente novamente!".
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio37 {
    public static void main(String[]arg){
        try (Scanner input = new Scanner(System.in)){

        ArrayList<String> produtos = new ArrayList<>();
        produtos.add("Arroz");
        produtos.add("Feijao");
        produtos.add("Macarrao");

        ArrayList<Double> precos = new ArrayList<>();
        precos.add(25.50);
        precos.add(9.80);
        precos.add(5.20);

        boolean running = true;
        while ( running ) {

        }
    }
    }
}
