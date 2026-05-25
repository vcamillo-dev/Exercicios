/*
 * QUESTÃO 45: O MELHOR FUNCIONÁRIO DO MÊS (MAIOR VALOR + ÍNDICE)
 * * 1. Crie um ArrayList<String> chamado "funcionarios" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "vendas" (vazio).
 * * 3. Crie um loop WHILE que rode exatamente 3 vezes para cadastrar 
 *      o nome do funcionário e o valor total que ele vendeu no mês.
 * * 4. Fora do while:
 * - Crie uma variável double "maiorVenda" começando em 0.0.
 * - Crie uma variável int "indiceMaiorVenda" começando em 0.
 * * 5. Use um loop FOR para percorrer a lista de vendas.
 * - Dentro do FOR, faça um IF para ver se a venda atual é maior que "maiorVenda".
 * - Se for maior, você deve atualizar DUAS coisas:
 *   a) A variável "maiorVenda" recebe a venda atual.
 *   b) A variável "indiceMaiorVenda" recebe o índice 'i' atual.
 * * 6. Ao final de tudo, use o "indiceMaiorVenda" para buscar o nome do funcionário campeão e exiba:
 * - "O melhor funcionário foi [NOME] com R$ [VALOR] em vendas!".
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio45 {
    public static void main(String[] arg) {
        try ( Scanner input = new Scanner(System.in)) {
            
            ArrayList<String> funcionarios = new ArrayList<>();
            ArrayList<Double> vendas = new ArrayList<>();

            int contador = 0;
            while ( contador < 3) {
                System.out.println(" Insira o Nome do funcionario: ");
                String nome_funcionarios = input.nextLine();
                funcionarios.add(nome_funcionarios);

                System.out.println("Insira a quantidade total em RS% Vendido" );
                String quantidade_texto = input.nextLine();
                double vendas_funcionario = Double.parseDouble(quantidade_texto);
                vendas.add(vendas_funcionario);

                contador ++;
            }

/* - Dentro do FOR, faça um IF para ver se a venda atual é maior que "maiorVenda".
 * - Se for maior, você deve atualizar DUAS coisas:
 *   a) A variável "maiorVenda" recebe a venda atual.
 *   b) A variável "indiceMaiorVenda" recebe o índice 'i' atual.
 * * 6. Ao final de tudo, use o "indiceMaiorVenda" para buscar o nome do funcionário campeão e exiba:
 * - "O melhor funcionário foi [NOME] com R$ [VALOR] em vendas!".
 */
            double maiorVenda = 0.0;
            int indiceMaiorVenda = 0;

            for (int i = 0 ; i < vendas.size(); i ++){
                if (vendas.get(i) > maiorVenda){
                    maiorVenda = vendas.get(i);
                    indiceMaiorVenda = i;
                }
            }

            System.out.println("O melhor funcionario foi: " + funcionarios.get(indiceMaiorVenda) + " com o valor R$" + vendas.get(indiceMaiorVenda)+ " em vendas!");




        }
    }    
}
