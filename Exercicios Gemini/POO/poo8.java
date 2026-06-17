/*
 * QUESTÃO 58: O EXTRATO BANCÁRIO SIMPLIFICADO
 * * * CENÁRIO:
 * Você precisa criar um sistema que apenas registra uma conta e mostra o extrato inicial.
 * Vamos focar apenas na estrutura pura da POO com encapsulamento.
 * * * REQUISITOS DA CLASSE (ContaSimples):
 * 1. Crie a classe 'ContaSimples' fora da classe principal.
 * 2. Defina dois atributos PRIVADOS: 'titular' (String) e 'saldo' (Double).
 * 3. Crie o construtor para receber o titular e o saldo e inicializar os atributos.
 * 4. Crie apenas os métodos GETTERS para o 'titular' e para o 'saldo'.
 * * * REQUISITOS DO MAIN (poo8):
 * 1. Peça para o usuário digitar o nome do titular (Scanner).
 * 2. Peça para o usuário digitar o saldo inicial.
 * 3. Crie o objeto da classe 'ContaSimples' passando os dados capturados.
 * 4. Use os GETTERS para exibir o resultado final na tela em uma mensagem organizada.
 */
package POO;
import java.util.Scanner;

class ContaSimples {
    private String titular;
    private Double saldo;   
    
    public ContaSimples (String titular , Double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    //getters
    public String getTitular() { return this.titular; }
    public Double getSaldo() { return this.saldo; }
}

public class poo8 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o nome do titular");
            String nome = input.nextLine();

            System.out.println("Insira o seu saldo inicial");
            String saldo_texto = input.nextLine();
            Double saldo_numero = Double.parseDouble(saldo_texto);

            ContaSimples c = new ContaSimples(nome, saldo_numero);

            System.out.println("---Conta criada com sucesso ---");
            System.out.println("O titular da conta é: "+ c.getTitular());
            System.out.println("O valor total da conta é: "+ c.getSaldo());

        }
    }

}
