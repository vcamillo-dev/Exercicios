/*
 * QUESTÃO 56: MÉTODOS DE NEGÓCIO (A CLASSE INTELIGENTE)
 * * CENÁRIO:
 * Vamos evoluir nossa Conta Bancária. Agora, o 'main' não fará contas.
 * A própria classe ContaBancaria terá uma função pública chamada 'depositar' 
 * que recebe o valor do depósito e faz a soma lá dentro dela mesma.
 */
package POO;
import java.util.Scanner;

class ContaBancariaInteligente {
    private String nome;
    private Double saldo;

    public ContaBancariaInteligente(String nome, Double saldo) {
        this.nome = nome;
        this.saldo = saldo;
    }

    // GETTERS
    public String getNome() { return this.nome; }
    public Double getSaldo() { return this.saldo; }

    // ====================================================================
    // NOVO: ISSO É UM MÉTODO DE NEGÓCIO!
    // É uma função que executa uma ação real do objeto.
    // Ela não precisa de 'return' (por isso é void) porque altera o saldo direto aqui dentro.
    // ====================================================================
    public void depositar(Double valorDeposito) {
        // A sua lógica foi trazida para cá! 
        this.saldo = this.saldo + valorDeposito;
    }
}

public class poo6 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Insira o nome do titular:");
            String nome = input.nextLine();

            System.out.println("Insira seu saldo inicial:");
            Double saldo_numero = Double.parseDouble(input.nextLine());

            ContaBancariaInteligente c = new ContaBancariaInteligente(nome, saldo_numero);

            System.out.println("Insira o quanto você está depositando agora:");
            Double deposito_numero = Double.parseDouble(input.nextLine());

            // ================================================================
            // O SEU DESAFIO NO MAIN:
            // Em vez de criar a variável 'Valor_total' e usar o setSaldo,
            // chame a nova função inteligente direto no seu objeto 'c':
            // c.depositar(deposito_numero);
            // ================================================================            
            
            // 1. Chame o método depositar aqui...
            c.depositar(deposito_numero);
            // 2. Mostre o saldo final usando o getSaldo() igual você fez antes...
            System.out.println("O valor final do slado eh :" + c.getSaldo());
        }
    }
}