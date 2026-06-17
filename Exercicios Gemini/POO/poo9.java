/*
 * QUESTÃO 59: O CONTROLE DE ESTOQUE (PRODUTO COM SETTER)
 * * * CENÁRIO:
 * Vamos criar um sistema para controlar o estoque de jogos de uma loja.
 * O título do jogo não muda, mas a quantidade em estoque precisa ser atualizada.
 * * * REQUISITOS DA CLASSE (JogoEstoque):
 * 1. Crie a classe 'JogoEstoque' fora da classe principal.
 * 2. Defina dois atributos PRIVADOS: 'titulo' (String) e 'quantidade' (Integer).
 * 3. Crie o construtor para receber o titulo e a quantidade inicial.
 * 4. Crie os métodos GETTERS para ambos os atributos ('titulo' e 'quantidade').
 * 5. Crie o método SETTER apenas para a 'quantidade' (public void setQuantidade(Integer quantidade)).
 */
package POO;

import java.util.Scanner;

class JogoEstoque {
    private String titulo;
    private Integer quantidade;

    public JogoEstoque(String titulo, Integer quantidade) {
        this.titulo = titulo;
        this.quantidade = quantidade;
    }

    // getters
    public String getTitulo() {
        return this.titulo;
    }

    public Integer getQuantidade() {
        return this.quantidade;
    }

    // setters
    public void setQuantidade(Integer quantidade) {
        this.quantidade = quantidade;

    }
}
/*
 * REQUISITOS DO MAIN (poo9):
 * 1. Peça para o usuário digitar o título do jogo e a quantidade que tem hoje
 * no estoque.
 * 2. Crie o objeto da classe 'JogoEstoque'.
 * 3. Exiba o estado atual do estoque usando os GETTERS (ex:
 * "Jogo: X | Estoque: Y").
 * 4. Chegou mercadoria nova! Peça para o usuário digitar a NOVA quantidade
 * total do estoque.
 * 5. Use o SETTER para atualizar a quantidade dentro do objeto.
 * 6. Exiba os dados novamente usando os GETTERS para provar que o estoque foi
 * atualizado.
 */

public class poo9 {
    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Insira o titulo do jogo");
            String titulo = input.nextLine();

            System.out.println("Insira a quantidade de jogos hoje em estoque");
            Integer quantidade = input.nextInt();

            JogoEstoque j = new JogoEstoque(titulo, quantidade);

            System.out.println("A quantidade do " + j.getTitulo() + " é : " + j.getQuantidade());
            System.out.println("Chegou mercadoria nova, atualize a nova quantidade total do estoque");

            Integer nova_quantidade = input.nextInt();

            j.setQuantidade(nova_quantidade);

            System.out.println("A quantidade do" + j.getTitulo() + " é : " + j.getQuantidade());

        }
    }
}
