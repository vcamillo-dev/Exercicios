/*
 * QUESTÃO 60: CONTROLE DE ESTOQUE COM MÉTODO DE NEGÓCIO
 * * * CENÁRIO:
 * Vamos evoluir o sistema de estoque. Agora o 'main' não define o valor total.
 * O 'main' apenas vai dizer quantas unidades CHEGARAM ou quantas unidades FORAM VENDIDAS.
 * * * REQUISITOS DA CLASSE (JogoEstoqueAvancado):
 * 1. Crie a classe 'JogoEstoqueAvancado' fora da classe principal.
 * 2. Atributos PRIVADOS: 'titulo' (String) e 'quantidade' (Integer).
 * 3. Crie o construtor padrão (titulo e quantidade inicial).
 * 4. Crie os GETTERS para ambos os atributos. (Não crie Setters comuns desta vez!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'darEntrada':
 * public void darEntrada(Integer qtdChegou) -> Deve somar a qtdChegou ao estoque atual.
 * 6. Crie o MÉTODO DE NEGÓCIO 'vender':
 * public void vender(Integer qtdVendida) -> Deve subtrair a qtdVendida do estoque atual.
 * * * REQUISITOS DO MAIN (poo10):
 * 1. Peça o título do jogo e a quantidade inicial. Crie o objeto.
 * 2. O jogo vendeu! Peça para o usuário digitar quantas unidades foram VENDIDAS.
 * 3. Chame o método inteligente do objeto: j.vender(qtd_digitada);
 * 4. Exiba o estoque atualizado usando o GETTER.
 */
package POO;
import java.util.Scanner;

class JogoEstoqueAvancado {
    private String titulo;
    private Integer quantidade;
    
    public JogoEstoqueAvancado(String titulo, Integer quantidade){
        this.titulo = titulo;
        this.quantidade = quantidade;
    }
    //getters
    public String getTItulo(){
        return this.titulo;
    }
    public Integer getQuantidade(){
        return this.quantidade;
    }
    //metodo
    public void vender(Integer qtdVendida){
        this.quantidade = this.quantidade - qtdVendida;
    }
}
 /*REQUISITOS DO MAIN (poo10):
 * 1. Peça o título do jogo e a quantidade inicial. Crie o objeto.
 * 2. O jogo vendeu! Peça para o usuário digitar quantas unidades foram VENDIDAS.
 * 3. Chame o método inteligente do objeto: j.vender(qtd_digitada);
 * 4. Exiba o estoque atualizado usando o GETTER.
*/
public class poo10{
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){

            System.out.println("Insira o titulo do jogo");
            String titulo = input.nextLine();
            System.out.println("Insira a quantidade do titulo no estoque");
            Integer quantidade = input.nextInt();

            System.out.println("O jogo vendeu!, Diga quantas unidades foram vendidas");
            Integer qntVendida = input.nextInt();

            JogoEstoqueAvancado j = new JogoEstoqueAvancado(titulo, quantidade);
            j.vender(qntVendida);

            System.out.println("O jogo: " + j.getTItulo() + " Possui:" + j.getQuantidade()+ " vendidas!");

        }
    }
}
