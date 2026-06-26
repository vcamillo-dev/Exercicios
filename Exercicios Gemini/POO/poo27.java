package POO;
import java.util.Scanner;
/*
 * QUESTÃO 77: CONTA CORRENTE COM CHEQUE ESPECIAL
 * * * CENÁRIO:
 * Vamos criar uma conta bancária que possui um saldo real e também um limite de cheque especial.
 * O cliente pode sacar um valor mesmo que o saldo fique negativo, desde que NÃO ultrapasse o limite do cheque especial.
 * * * REQUISITOS DA CLASSE (ContaCorrenteVIP):
 * 1. Crie a classe 'ContaCorrenteVIP' fora da classe principal.
 * 2. Atributos PRIVADOS: 'titular' (String), 'saldo' (Double) e 'limiteChequeEspecial' (Double).
 * 3. Crie o construtor para receber o 'titular' e o 'limiteChequeEspecial'. O 'saldo' começa em 0.0.
 * 4. Crie os GETTERS para todos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'sacar' (void):
 * public void sacar(Double valorSaque) {
 * - O saldo DISPONÍVEL total do cliente é a soma do 'this.saldo' + 'this.limiteChequeEspecial'.
 * - SE o 'valorSaque' for MENOR ou IGUAL ao saldo disponível total:
 * Subtraia o 'valorSaque' do seu 'this.saldo' (sim, o saldo pode ficar negativo!).
 * Mostre na tela: "Saque de R$[valor] realizado com sucesso!"
 * - SENÃO:
 * Mostre na tela: "Erro: Saldo e Cheque Especial insuficientes para este saque."
*/
class ContaCorrenteVIP {
    private String titular;
    private Double saldo;
    private Double limiteChequeEpescial;

    public ContaCorrenteVIP(String titular, Double limiteChequeEspecial){
        this.titular = titular;
        this.limiteChequeEpescial = limiteChequeEspecial;
        this.saldo = 0.0;
    }
    public String getTitular(){
        return this.titular;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public Double getLimiteChequeEspecial(){
        return this.limiteChequeEpescial;
    }
    public void Depositar(Double ValorDeposito){
        this.saldo = this.saldo + ValorDeposito;
    }
    public void Sacar(Double ValorSaque){
        Double SaldoTotalDisponivel = this.saldo + this.limiteChequeEpescial;

        if( ValorSaque <= SaldoTotalDisponivel){
            SaldoTotalDisponivel = SaldoTotalDisponivel-ValorSaque;
            System.out.println("Saque no valor de: " + ValorSaque + " Aceito com sucesso");
        } else {
            System.out.println("Erro: Saldo e Cheque Especial insuficientes para este saque.");
        }
    }
}
/*REQUISITOS DO MAIN (poo27):
 * 1. Peça o nome do titular e o valor do limite do Cheque Especial (ex: 500.0). Crie o objeto.
 * 2. Peça para o usuário digitar um valor para DEPOSITAR. Crie e chame um método 'depositar' (void) para somar esse valor ao saldo.
 * 3. Peça para o usuário digitar um valor para SACAR e chame o método 'sacar'.
 * 4. Exiba o saldo final do cliente usando o seu getter.
 */

public class poo27 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do titular da conta");
            String nome = input.nextLine();

            System.out.println("Insira o valor do limite do cheque especial");
            String valorChequeEspecial = input.nextLine();
            Double valorChequeEspecialDouble = Double.parseDouble(valorChequeEspecial);

            ContaCorrenteVIP c = new ContaCorrenteVIP(nome, valorChequeEspecialDouble);

            System.out.println("Quanto voce deseja depositar na conta");
            String depositoString = input.nextLine();
            Double depositDouble = Double.parseDouble(depositoString);

            c.Depositar(depositDouble);

            System.out.println("Quanto voce deseja sacar");
            String saqueString = input.nextLine();
            Double saqueDouble = Double.parseDouble(saqueString);

            c.Sacar(saqueDouble);

            System.out.println("O cliente " + c.getTitular() + " possui " + c.getSaldo() + " apos o saque");
        }
    }
}
