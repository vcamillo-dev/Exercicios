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
/*
/*REQUISITOS DO MAIN (poo23):
 * 1. Peça o nome do titular e crie o objeto.
 * 2. Peça o valor do depósito inicial e chame o método 'depositar'.
 * 3. Peça a quantidade de meses que o dinheiro ficará rendendo (Integer).
 * 4. Peça a taxa de juros mensal (Double - ex: 0.5).
 * 5. Chame o método 'calcularRendimento' e exiba o valor total final formatado com duas casas decimais usando o String.format.
 */
public class poo23 {
    static public void main(String[]arg){
        try(Scanner input = new Scanner(System.in)){

        }
    }
    
}
