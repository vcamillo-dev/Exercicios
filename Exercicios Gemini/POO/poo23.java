package POO;
import java.util.Scanner;
/*
 * QUESTÃO 73: O SIMULADOR DE RENDIMENTO
 * * * CENÁRIO:
 * Vamos criar um simulador para uma conta poupança. O cliente cria a conta informando 
 * o seu nome. O caixa começa zerado. Ele faz um depósito inicial e depois calcula 
 * quanto aquele dinheiro vai render após uma quantidade de meses informada.
 * * * REQUISITOS DA CLASSE (SimuladorRendimento):
 * 1. Crie a classe 'SimuladorRendimento' fora da classe principal.
 * 2. Atributos PRIVADOS: 'titular' (String) e 'saldo' (Double).
 * 3. Crie o construtor para receber apenas o 'titular'. O 'saldo' deve começar valendo 0.0.
 * 4. Crie os GETTERS padrão para ambos (parênteses dos getters vazios!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'depositar' (void):
 * public void depositar(Double valor) -> Soma o valor ao saldo atual.
 * 6. Crie o MÉTODO DE NEGÓCIO 'calcularRendimento' (Retorna Double):
 * public Double calcularRendimento(Integer meses, Double taxaMensal) {
 * - A taxa virá em porcentagem (ex: 0.5 para 0.5%).
 * - Para fins educativos, use juros simples: Double rendimento = this.saldo * (taxaMensal / 100.0) * meses;
 * - Retorne o valor total final (saldo + rendimento): return this.saldo + rendimento;
*/
class SimuladorRendimento{
    private String titular;
    private Double saldo;

    public SimuladorRendimento(String titular){
        this.titular = titular;
        this.saldo = 0.0;
    }
    public String getTitular(){
        return this.titular;
    }
    public Double getSaldo(){
        return this.saldo;
    }
    public void depositar (Double valor){
        this.saldo = this.saldo + valor;
    }
    public Double calcularRendimento(Integer meses, Double taxaMensal){
        Double rendimento = this.saldo * (taxaMensal/100.0) * meses;
        return saldo + rendimento;
    }
}
/*
REQUISITOS DO MAIN (poo23):
 * 1. Peça o nome do titular e crie o objeto.
 * 2. Peça o valor do depósito inicial e chame o método 'depositar'.
 * 3. Peça a quantidade de meses que o dinheiro ficará rendendo (Integer).
 * 4. Peça a taxa de juros mensal (Double - ex: 0.5).
 * 5. Chame o método 'calcularRendimento' e exiba o valor total final formatado com duas casas decimais usando o String.format.
 */
public class poo23 {
    static public void main(String[]arg){
        try(Scanner input = new Scanner(System.in)){

            System.out.println("Insira o nome do titular");
            String nome = input.nextLine();

            SimuladorRendimento c = new SimuladorRendimento(nome);

            System.out.println("Insira o valor do deposito inicial");
            String deposito_text = input.nextLine();
            Double deposito_numero = Double.parseDouble(deposito_text);

            c.depositar(deposito_numero);

            System.out.println("Insira quanto do deposito ficará rendendo:");
            String rendimento_text = input.nextLine();
            Integer rendimento_numero = Integer.parseInt(rendimento_text);

            System.out.println("Qual será a taxa de juros mensal em porcentagem");
            String juros_text = input.nextLine();
            Double juros_double = Double.parseDouble(juros_text);

            System.out.println("O valor total final é:" + String.format("%.2f", c.calcularRendimento(rendimento_numero, juros_double)));


        }
    }
    
}
