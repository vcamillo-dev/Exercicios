/*
 * QUESTÃO 47: SISTEMA DE CONTROLE DE ESTOQUE E REPOSIÇÃO CRÍTICA
 * * CENÁRIO:
 * Um gerente de supermercado precisa cadastrar os produtos do estoque e suas 
 * respectivas quantidades atuais. Ele quer cadastrar quantos produtos quiser 
 * e, no final, o sistema deve alertar qual é o produto com o estoque mais crítico
 * (ou seja, a menor quantidade em estoque) para que ele peça reposição.
 * * REQUISITOS DO PROGRAMA:
 * 1. O programa deve permitir que o gerente cadastre o NOME do produto e a 
 * QUANTIDADE em estoque (use números inteiros para a quantidade).
 * * 2. O programa NÃO tem limite de 3 cadastros. Ele deve continuar perguntando 
 * "Deseja cadastrar outro produto? (S/N)" após cada cadastro. Se o usuário 
 * digitar "S", o programa continua. Se digitar "N" (ou qualquer outra coisa), 
 * o programa para de pedir dados e vai para o relatório.
 * * 3. Após encerrar os cadastros, o programa deve varrer os dados informados e 
 * encontrar o produto que tem a MENOR quantidade em estoque.
 * * 4. Exiba na tela:
 * - A lista com todos os produtos cadastrados.
 * - O aviso: "ALERTA DE REPOSIÇÃO: O produto [NOME] está com o estoque crítico de apenas [QUANTIDADE] unidades!".
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio47 {
    public static void main(String[] arg){
        try ( Scanner input = new Scanner(System.in)){
            ArrayList<String> produtos = new ArrayList<>();
            ArrayList<Double> quantidade_produtos = new ArrayList<>();

            boolean running = true;
            while ( running ){
                System.out.println("Insira o nome do produto desejado: ");
                String nome_produto = input.nextLine();
                produtos.add(nome_produto);

                System.out.println("Insira a quantidade desse produto:");
                String quantidade_texto = input.nextLine();
                Double quantidade_numero = Double.parseDouble(quantidade_texto);
                quantidade_produtos.add(quantidade_numero);

                System.out.println("Deseja cadastrar outro produto? Sim para continuar ou Nao para encerrar");
                String resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("Nao")){
                    running = false;
                } else {

                }            
            }

            Double menor_qntd_produtos = 99999.0;
            int menor_index = 0;
            for (int i = 0 ; i < quantidade_produtos.size() ; i ++){
                if ( quantidade_produtos.get(i) < menor_qntd_produtos){
                    menor_qntd_produtos = quantidade_produtos.get(i);
                    menor_index = i;
                }
            }

            System.out.println("Os produtos cadastrador na lista sao: "+ produtos);
            System.out.println("O produto:" + produtos.get(menor_index) + " esta com estoque critico de apenas:" + menor_qntd_produtos);
            
        }
    }    
}
