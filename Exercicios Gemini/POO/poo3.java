/*
 * QUESTÃO 53: INTRODUÇÃO AO ENCAPSULAMENTO (GETTERS E SETTERS)
 * * CENÁRIO:
 * Vamos evoluir o sistema de produtos. Agora, os dados do Produto precisam ser 
 * protegidos. Não poderemos mais acessar direto usando '.nome' ou '.valor'.
 * * REQUISITOS DO PROGRAMA:
 * 1. Altere a classe 'Produto' aplicando 'private' antes de 'String nome' e 'Double valor'.
 * 2. Crie os métodos públicos para acessar e alterar esses dados (Getters e Setters) dentro da classe Produto.
 * 3. Na classe principal 'poo3', monte um loop para cadastrar apenas 1 produto.
 * 4. Na hora de exibir o dado no final, use o método get correspondente.
 */
package POO;
import java.util.Scanner;

class ProdutoEncapsulado {
    // 1. Atributos trancados
    private String nome;
    private Double valor;

    // Construtor continua igual
    public ProdutoEncapsulado(String nome, Double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    // 2. Os GETTERS (Para você buscar o valor de fora da classe)
    public String getNome() {
        return this.nome;
    }

    public Double getValor() {
        return this.valor;
    }

    // Os SETTERS (Para você alterar o valor se precisar - não usaremos hoje, mas guarde o padrão)
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }
}

public class poo3 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            System.out.println("Insira o nome do produto:");
            String nome = input.nextLine();
            System.out.println("Insira o valor:");
            Double valor = Double.parseDouble(input.nextLine());

            // Cria o objeto normalmente
            ProdutoEncapsulado p = new ProdutoEncapsulado(nome, valor);

            // DESAFIO:
            // Tente printar na tela o nome e o valor desse produto 'p' 
            // usando os métodos .getNome() e .getValor() em vez de usar .nome e .valor.
            
            System.out.println("Produto cadastrado com sucesso!");
            System.out.println("O produto cadastrados foi: " + p.getNome() );
            System.out.println("O valor do produto cadastrado foi: " + p.getValor() );
            // Escreva seus System.out.println aqui embaixo...

        }
    }
}