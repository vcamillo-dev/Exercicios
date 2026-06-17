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

    public void sacar(Double valorSaque){
        this.saldo = this.saldo - valorSaque;
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

            // 1. Pedimos o nome do titular
            System.out.println("Insira o nome do titular:");
            String nome = input.nextLine();

            // CORREÇÃO AQUI: Pedir o saldo inicial da conta primeiro!
            System.out.println("Insira o seu saldo inicial:");
            String saldo_texto = input.nextLine();
            Double saldo_numero = Double.parseDouble(saldo_texto);

            // Agora sim, criamos a conta com o nome e o saldo inicial digitados
            ContaBancariaComSaque c = new ContaBancariaComSaque(nome, saldo_numero);

            // 2. Pedimos o valor do SAQUE
            System.out.println("Insira o valor que deseja sacar:");
            String saqueTexto = input.nextLine();
            Double valor_digitado = Double.parseDouble(saqueTexto);

            // 3. Damos a ordem de saque para o objeto inteligente
            c.sacar(valor_digitado);

            // 4. Mostramos o resultado final buscando direto do "cofre"
            System.out.println("Saque realizado com sucesso!");
            System.out.println("O valor final de saldo atualizado é : R$" + c.getSaldo());
            
        }
    }
}