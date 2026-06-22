package POO;
import java.util.Scanner;
/*
 * QUESTÃO 74: O CONTROLE DE ESTOQUE
 * * * CENÁRIO:
 * Vamos gerenciar o estoque de um produto eletrônico. O produto começa com estoque ZERADO.
 * Teremos um método para dar entrada de novas unidades e outro método para calcular o 
 * valor total desse estoque baseado em um preço que o usuário vai informar.
 * * * REQUISITOS DA CLASSE (EstoqueProduto):
 * 1. Crie a classe 'EstoqueProduto' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nome' (String) e 'quantidade' (Integer).
 * 3. Crie o construtor para receber apenas o 'nome'. A 'quantidade' começa em 0.
 * 4. Crie os GETTERS padrão para ambos.
 * 
 * 5. Crie o MÉTODO DE NEGÓCIO 'reporEstoque' (void):
 * public void reporEstoque(Integer qtdNova) -> Soma a quantidade atual à 'quantidade' interna.
 * 
 * 6. Crie o MÉTODO DE NEGÓCIO 'calcularValorEstoque' (Retorna Double):
 * public Double calcularValorEstoque(Double precoUnitario) {
 * - Retorne a multiplicação da 'this.quantidade' (convertida para Double) pelo 'precoUnitario'.
 * - Dica: use 'this.quantidade * precoUnitario'. O Java converte o cálculo automaticamente.
*/
class EstoqueProduto {
    private String nome;
    private Integer quantidade;

    public EstoqueProduto(String nome){
        this.nome = nome;
        this.quantidade = 0;
    }
    public String getNome(){
        return this.nome;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
    //methods
    public void reporEstoque(Integer qntNova){
        this.quantidade = this.quantidade + qntNova;
    }
    public Double calcularValorEstoque ( Double precoUnitario ){
        return this.quantidade * precoUnitario;
    }
}
/*
 * * * REQUISITOS DO MAIN (poo24):
 * 1. Peça o nome do produto e crie o objeto.
 * 2. Peça a quantidade de itens que chegaram no estoque (Integer) e chame o 'reporEstoque'.
 * 3. Peça o preço unitário atual daquele produto (Double).
 * 4. Exiba o valor total do estoque usando o 'String.format' com duas casas decimais.
 */
public class poo24 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do produto");
            String nome = input.nextLine();

            EstoqueProduto e = new EstoqueProduto(nome);

            System.out.println("Insira a quantidade de itens que chgaram no estoque");
            String reporEstoque_text = input.nextLine();
            Integer reporEstoque_Integer = Integer.parseInt(reporEstoque_text);
            //a quantidade pedid em repor_estoque_integer sera adicionado no method reporEstoque e la sera "calculado"
            e.reporEstoque(reporEstoque_Integer);

            System.out.println("Insira o valor atual do produto");
            String produto_text = input.nextLine();
            Double produto_Double = Double.parseDouble(produto_text);

            System.out.println("A quantidade do produto " + e.getNome() + " que temos no estoque é: "
             + e.getQuantidade() + " no valor total de:" + String.format("%.al2f", e.calcularValorEstoque(produto_Double)));
        }
    }
    
}
