package POO;

/* * QUESTÃO 79.7: SISTEMA DE VENDA DE LIVROS
 * * * CENÁRIO:
 * Vamos simular a venda de um Livro para um Cliente, atualizando o estoque e acumulando o valor na conta do cliente.
 * * * * REQUISITOS DA CLASSE 1 (Cliente):
 * 1. Atributos Privados:
 * - nome (Tipo: String)
 * - totalGasto (Tipo: Double)
 * 2. Construtor: Recebe apenas o parâmetro 'nome'. O 'totalGasto' deve iniciar em 0.0.
 * 3. Encapsulamento: Getters e Setters necessários para os atributos.*/
class Cliente {
    private String nome;
    private Double totalGasto;

    public Cliente(String nome) {
        this.nome = nome;
        this.totalGasto = 0.0;
    }
    public String getNome() {
        return this.nome;
    }
    public Double getTotalGasto() {
        return this.totalGasto;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    public void setTotalGasto(Double totalGasto) {
        this.totalGasto = totalGasto;
    }
}
/*REQUISITOS DA CLASSE 2 (Livro):
 * 1. Atributos Privados:
 * - titulo (Tipo: String)
 * - preco (Tipo: Double)
 * - quantidadeEstoque (Tipo: Integer)
 * 2. Construtor: Recebe os três atributos por parâmetro. * 
 * 3. Encapsulamento: Getters para todos os atributos. Um Setter necessário apenas para o estoque.*/
class Livro {
    private String titulo;
    private Double preco;
    private Integer quantidadeEstoque;

    public Livro(String titulo, Double preco, Integer quantidadeEstoque) {
        this.titulo = titulo;
        this.preco = preco;
        this.quantidadeEstoque = quantidadeEstoque;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public Double getPreco() {
        return this.preco;
    }
    public Integer getQuantidadeEstoque() {
        return this.quantidadeEstoque;
    }
    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }
    /*4. Método de Negócio (venderLivro):
 * - Tipo de retorno do método: void
 * - Parâmetro que o método recebe: Um objeto da classe Cliente.
 * - Regra 1: Se o estoque do livro for menor ou igual a zero, exiba mensagem de produto esgotado.
 * - Regra 2: Se houver estoque, diminua 1 unidade do estoque do livro, some o preço do livro no total gasto 
do cliente e exiba uma mensagem de sucesso com o título do livro e o nome do cliente*/
    public void venderLivro(Cliente cliente) {
        if (this.quantidadeEstoque <= 0) {
            System.out.println("Este produto já está esgotado :(");
        } else if (this.quantidadeEstoque >= 1) {
            this.quantidadeEstoque = this.quantidadeEstoque - 1;
            cliente.setTotalGasto(cliente.getTotalGasto() + this.preco);
            System.out.println("Sucesso o livro:" + this.getTitulo() + " Foi vendido para o cliente: " + cliente.getNome() );
        }
    }
}
/*REQUISITOS DO MAIN (poo34):
 * 1. Instancie o Cliente: "Bruno".
 * 2. Instancie o Livro 1: Título "Java Efetivo", Preço: 120.00, Estoque: 1.
 * 3. No main, faça o livro tentar ser vendido para o Bruno.
 * 4. No main, faça o livro tentar ser vendido para o Bruno uma segunda vez (para testar o bloqueio de estoque zerado).
 * 5. Exiba na tela o total gasto pelo cliente Bruno e o estoque restante do livro usando os objetos criados.
 */
public class poo34 {

    public static void main(String[] args) {
        Cliente Bruno = new Cliente("Bruno");

        Livro livro1 = new Livro("Java Efetivo", 120.00, 1);

        livro1.venderLivro(Bruno);
        livro1.venderLivro(Bruno);

        System.out.println("O total que o cliente:" + Bruno.getNome() + " gastou é : "  + Bruno.getTotalGasto() + " ainda restam: " + livro1.getQuantidadeEstoque() + " no estoque");

    }
}
