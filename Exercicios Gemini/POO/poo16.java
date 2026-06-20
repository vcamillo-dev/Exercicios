package POO;
import java.util.Scanner;
/*
 * QUESTÃO 66: CONTA BANCÁRIA COM VALIDAÇÃO DE SAQUE
 * * * CENÁRIO:
 * Vamos criar uma conta bancária inteligente. Ela começa com um saldo inicial, 
 * mas o método de sacar só vai funcionar se o saldo for suficiente.
 * * * REQUISITOS DA CLASSE (ContaValidada):
 * 1. Crie a classe 'ContaValidada' fora da classe principal.
 * 2. Atributos PRIVADOS: 'titular' (String) e 'saldo' (Double).
 * 3. Crie o construtor para receber ambos os atributos ('titular' e 'saldo' inicial).
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'sacar':
 * public void sacar(Double valorSaque) -> Lá dentro, use um IF:
 * - SE o valorSaque for MENOR ou IGUAL ao 'this.saldo', faça a subtração e mostre: "Saque realizado!".
 * - SENÃO, não subtraia nada e mostre na tela: "Saldo insuficiente para a operação!".
*/
class ContaValidada {
    private String titular;
    private Double saldo;
    
    public ContaValidada (String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    //getters 
    public String getTitular(){
        return this.titular;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    //methods
    public void sacar(Double valorSaque){
        if (valorSaque <= this.saldo){
            this.saldo = this.saldo - valorSaque;
            System.out.println("Saque realizado com sucesso");
        } else {
            System.out.println("Saldo insuficiente para operaocao");
        }
    }
}
/*REQUISITOS DO MAIN (poo16):
 * 1. Peça para o usuário digitar o nome do titular e o saldo inicial da conta. Crie o objeto.
 * 2. Peça para digitar um valor para SACAR.
 * 3. Chame o método 'sacar' passando esse valor.
 * 4. Exiba o saldo final usando o GETTER para conferir o resultado.
 */

public class poo16 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do titular");
            String titular = input.nextLine();

            System.out.println("Insira o saldo inicial da conta");
            String saldo_text = input.nextLine();
            Double saldo = Double.parseDouble(saldo_text);

            ContaValidada c = new ContaValidada(titular, saldo);

            System.out.println("O cliente " + c.getTitular() + " possui na conta: " + c.getSaldo());

            System.out.println("Quanto voce deseja sacar agora ?");
            String valor_saque = input.nextLine();
            Double valor_saque_numero = Double.parseDouble(valor_saque);
            c.sacar(valor_saque_numero);

            System.out.println("O cliente " + c.getTitular() + " apos o saque"+ " possui " + c.getSaldo()+ " na conta");

        }
    }
}
