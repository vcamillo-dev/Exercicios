package POO;
import java.util.ArrayList;
import java.util.Scanner;
/*
 * QUESTÃO 52: CADASTRO DE INVENTÁRIO COM POO
 * * CENÁRIO:
 * Um lojista quer cadastrar os produtos do seu estoque. Cada produto tem um NOME e um PREÇO.
 * O sistema deve salvar tudo em uma única lista usando Orientação a Objetos.
 * * REQUISITOS DO PROGRAMA:
 * 1. Crie a classe 'Produto' (fora da classe principal) com os atributos 'nome' (String) e 'preco' (double), além do construtor.
 * 2. Na classe principal 'poo2', crie uma única lista do tipo ArrayList<Produto>.
 * 3. Use um loop WHILE dinâmico (com a variável 'running = true' e perguntando se quer continuar S/N).
 * 4. Dentro do loop, capture o nome e o preço, crie o objeto Produto e adicione-o na lista.
 * 5. Após encerrar o cadastro, use um loop FOR para exibir o relatório final de todos os produtos cadastrados e seus respectivos preços.
 */
class Produto {
    String nome;
    Double valor;

    public Produto(String nome, Double valor){
        this.nome = nome;
        this.valor = valor;
    }
}

public class poo2 {
    public static void main(String[] args){
        try (Scanner input = new Scanner(System.in)){

            ArrayList<Produto> listaProdutos = new ArrayList<>();

            boolean running = true;
            while ( running ){
                System.out.println("Insira o nome do produto");
                String nome_produto = input.nextLine();

                System.out.println("Insira o valor do produto");
                String valor_texto = input.nextLine();
                Double valor_numero = Double.parseDouble(valor_texto);

                System.out.println("Caso deseje adicionar +1 candidato digite S, caso deseje encerrar digite N");
                String resposta = input.nextLine();
                
                Produto novoProduto = new Produto(nome_produto, valor_numero);
                listaProdutos.add(novoProduto);

                if ( resposta.equalsIgnoreCase("N")){
                    running = false;
                } else{

                }
               
            }

            for (int i = 0; i <listaProdutos.size(); i ++){
                System.out.println("Os produtos cadastrados foram: "+ listaProdutos.get(i).nome);
                System.out.println("Os valor do "+ listaProdutos.get(i).nome +"eh: "+ listaProdutos.get(i).valor);
            }
            
        }
    }    
}
