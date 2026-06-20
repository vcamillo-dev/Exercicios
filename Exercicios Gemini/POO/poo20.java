package POO;
import java.util.Scanner;
/*
 * QUESTÃO 70: O CALCULADOR DE DESCONTO (MÉTODO QUE RETORNA NÚMERO)
 * * * CENÁRIO:
 * Vamos criar um sistema para uma loja que calcula o preço final de um produto 
 * aplicando uma porcentagem de desconto que o vendedor vai digitar.
 * * * REQUISITOS DA CLASSE (CalculadoraDesconto):
 * 1. Crie a classe 'CalculadoraDesconto' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nomeProduto' (String) e 'precoOriginal' (Double).
 * 3. Crie o construtor padrão para receber ambos os atributos.
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'calcularPrecoFinal' (Retorna Double e RECEBE parâmetro!):
 * public Double calcularPrecoFinal(Double porcentagemDesconto) {
 * - Faça a conta: Double valorDesconto = this.precoOriginal * (porcentagemDesconto / 100.0);
 * - Retorne o preço com o desconto aplicado: return this.precoOriginal - valorDesconto;
 */
class CalculadoraDesconto {
    private String nomeProduto;
    private Double precoOriginal;

    public CalculadoraDesconto(String nomeProduto, Double precoOriginal){
        this.nomeProduto = nomeProduto;
        this.precoOriginal = precoOriginal;
    }
    public String getNomeProduto(){
        return this.nomeProduto;
    }
    public Double getPrecoOriginal(){
        return this.precoOriginal;
    }
    public Double calcularPrecoFinal(Double porcentagemDesconto){
        Double valorDesconto = this.precoOriginal * (porcentagemDesconto / 100);
        return this.precoOriginal - valorDesconto;
    }
}
/*REQUISITOS DO MAIN (poo20):
 * 1. Peça o nome do produto e o preço original. Crie o objeto.
 * 2. Peça para o usuário digitar a porcentagem de desconto (ex: 10 para 10%).
 * 3. Chame o método 'calcularPrecoFinal' passando esse valor e exiba o resultado no print.
 * Exemplo: System.out.println("Preço final com desconto: R$" + objeto.calcularPrecoFinal(desconto_digitado));
 */
public class poo20 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o nome do produto");
            String nome = input.nextLine();

            System.out.println("Digite o preco original do produto");
            String preco_texto = input.nextLine();
            Double preco_numero = Double.parseDouble(preco_texto);

            CalculadoraDesconto c = new CalculadoraDesconto(nome, preco_numero);

            System.out.println("Quanto de desconto sera aplicado no produto");
            String desconto = input.nextLine();
            Double desconto_numero = Double.parseDouble(desconto);

            System.out.println("Preco final do produto ficou: " + c.calcularPrecoFinal(desconto_numero));

        }
    }
}
