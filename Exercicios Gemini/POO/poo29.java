package POO;
import java.util.Scanner;
/*
 * QUESTÃO 79: A TRANSFERÊNCIA PIX
 * * * CENÁRIO:
 * Vamos simular uma transferência bancária. O método de negócio vai rodar dentro da conta 
 * de quem está ENVIANDO o dinheiro, e receberá como parâmetro a conta de quem vai RECEBER.
 * * * REQUISITOS DA CLASSE (ContaPix):
 * 1. Crie a classe 'ContaPix' fora da classe principal.
 * 2. Atributos PRIVADOS: 'titular' (String) e 'saldo' (Double).
 * 3. Crie o construtor para receber o 'titular' e um 'saldoInicial'.
 * 4. Crie os GETTERS padrão para ambos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'transferir' (void):
 * public void transferir(Double valor, ContaPix contaDestino) {
 * - SE 'this.saldo' for MAIOR ou IGUAL ao 'valor':
 * Subtraia o 'valor' do seu próprio saldo ('this.saldo').
 * Pegue a 'contaDestino' e use o saldo dela para somar o valor! (Dica: 'contaDestino.saldo = contaDestino.saldo + valor;')
 * Mostre na tela: "Pix de R$[valor] enviado com sucesso para [contaDestino.getTitular()]."
 * - SENÃO:
 * Mostre na tela: "Erro: Saldo insuficiente para realizar a transferência."
*/
class ContaPix{
    private String titular;
    private Double saldo;
    
    public ContaPix(String titular, Double saldo){
        this.titular = titular;
        this.saldo = saldo;
    }
    public String getTitular(){
        return this.titular;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public void transferir(Double valor, ContaPix contaDestino){
        if (this.saldo >= valor){
            // 1. Tira o dinheiro de quem está enviando
            this.saldo = this.saldo - valor;
            
            // 2. Coloca o dinheiro em quem está recebendo
            contaDestino.saldo = contaDestino.saldo + valor;
            
            // 3. Print corrigido (sem 'this.valor' e sem colchetes)
            System.out.println("Pix de R$ " + valor + " enviado com sucesso para " + contaDestino.getTitular());
        } else {
            System.out.println("Erro: Saldo insuficiente para realizar a transferência");
        }
    }
}
/* REQUISITOS DO MAIN (poo29):
 * 1. Crie a CONTA 1 digitando o nome "Alice" e saldo inicial 1000.0 (pode fixar no código para testar rápido).
 * 2. Crie a CONTA 2 digitando o nome "Bob" e saldo inicial 200.0.
 * 3. Mostre o saldo inicial de ambos na tela usando os GETTERS.
 * 4. Chame o método transferir da conta da Alice, passando o valor de 300.0 e a conta do Bob como destino.
 * Exemplo: conta1.transferir(300.0, conta2);
 * 5. Imprima o saldo final de ambos para confirmar que a Alice ficou com 700.0 e o Bob com 500.0.
 */
  
public class poo29 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome da conta 1");
            String nome_conta_1 = input.nextLine();
            System.out.println("Insira o saldo inicial da conta 1");
            String saldo_conta_1_String = input.nextLine();
            Double saldo_conta1_Double = Double.parseDouble(saldo_conta_1_String);

            ContaPix conta1 = new ContaPix(nome_conta_1, saldo_conta1_Double);

            System.out.println("Insira o nome da conta2");
            String nome_conta_2_String = input.nextLine();
            System.out.println("INsira o saldo da conta 2");
            String saldo_conta_2_String = input.nextLine();
            Double saldo_conta_2_Double = Double.parseDouble(saldo_conta_2_String);

            ContaPix conta2 = new ContaPix(nome_conta_2_String, saldo_conta_2_Double);
            
            System.out.println("Insira o valor para transferir da conta 1 para conta 2 ");
            Double valor_transferencia = input.nextDouble();
            conta1.transferir(valor_transferencia, conta2);

        }
    }    
}
