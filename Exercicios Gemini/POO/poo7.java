/*
 * QUESTÃO 57: MÉTODOS DE NEGÓCIO 2 (CRIANDO A AÇÃO DE SACAR)
 * * CENÁRIO:
 * Vamos adicionar a opção de SAQUE na nossa conta bancária inteligente.
 * A própria classe deve saber como subtrair o dinheiro do saldo.
 */
package POO;
import java.util.Scanner;

class ContaBancariaComSaque {
    private String nome;
    private Double saldo;

    public ContaBancariaComSaque(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // GETTERS
    public String getNome() { return this.nome; }
    public Double getSaldo() { return this.saldo; }

    // Método de depósito que você já domina
    public void depositar(Double valorDeposito) {
        this.saldo = this.saldo + valorDeposito;
    }

    // ====================================================================
    // REQUISITO 1: Crie o método de negócio 'sacar' aqui embaixo!
    // Ele deve ser 'public void sacar(Double valorSaque)' e, lá dentro,
    // deve subtrair o valorSaque do 'this.saldo'.
    // ====================================================================
    
}

public class poo7 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // REQUISITO 2 (LÓGICA DO MAIN):
            // a) Peça o nome e o saldo inicial para criar a conta.
            // b) Peça para o usuário digitar um valor para SACAR.
            // c) Dê a ordem de saque para o objeto: c.sacar(valor_digitado);
            // d) Mostre o saldo final usando o getSaldo() para conferir se o dinheiro sumiu da conta.
            
        }
    }
}