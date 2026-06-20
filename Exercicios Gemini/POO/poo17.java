package POO;
import java.util.Scanner;
/*
 * QUESTÃO 67: CLUBE DE CINEMA (VALIDAÇÃO DE IDADE)
 * * * CENÁRIO:
 * Vamos criar um sistema de venda de ingressos para um filme VIP (+18).
 * O objeto deve validar se o cliente pode ou não assistir ao filme.
 * * * REQUISITOS DA CLASSE (IngressoVip):
 * 1. Crie a classe 'IngressoVip' fora da classe principal.
 * 2. Atributos PRIVADOS: 'cliente' (String) e 'idade' (Integer).
 * 3. Crie o construtor para receber ambos os atributos ('cliente' e 'idade').
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'verificarPermissao':
 * public void verificarPermissao() -> Não recebe parâmetros! Ela olha o próprio 'this.idade':
 * - SE 'this.idade' for MAIOR ou IGUAL a 18, mostre: "Acesso AUTORIZADO! Bom filme."
 * - SENÃO, mostre: "Acesso NEGADO! Filme proibido para menores de 18 anos."
*/
class IngressoVip {
    private String cliente;
    private Integer idade;
    
    public IngressoVip(String cliente, Integer idade){
        this.cliente = cliente;
        this.idade = idade;
    }

    public String getCliente(){
        return this.cliente;
    }
    public Integer getIdade(){
        return this.idade;
    }
    public void verificarPermissao(){
        if (this.idade >= 18){
            System.out.println("Acesso autorizado, Bom filme");
        } else {
            System.out.println("Acesso NEGADO, filme proibido para menores de 18 anos");
        }
    }
}

/*REQUISITOS DO MAIN (poo17):
 * 1. Peça para o usuário digitar o nome do cliente e a idade.
 * 2. Crie o objeto 'IngressoVip' com esses dados.
 * 3. Chame o método inteligente do objeto: objeto.verificarPermissao();
 * 4. Use um print final com os GETTERS para confirmar quem tentou assistir (ex: "Verificação concluída para o cliente: X").
*/

public class poo17 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do cliente");
            String cliente = input.nextLine();

            System.out.println("Insira a idade do cliente");
            Integer idade = input.nextInt();
            IngressoVip c = new IngressoVip(cliente, idade);

            System.out.println("O cliente " + c.getCliente() + " possui " + c.getIdade());

            c.verificarPermissao();

            System.out.println("Verificacao concluida para o cliente " + c.getCliente());



        }
    }
}
