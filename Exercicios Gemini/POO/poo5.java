/*
 * QUESTÃO 55: O SIMULADOR BANCÁRIO (FIXANDO ENCAPSULAMENTO)
 * * CENÁRIO:
 * Vamos criar um sistema para o caixa eletrônico de um banco. Toda conta tem 
 * o NOME do titular e o SALDO. O saldo é privado e altamente protegido!
 * * REQUISITOS:
 * 1. Crie a classe 'ContaBancaria' com os atributos PRIVADOS: 'titular' (String) e 'saldo' (Double).
 * 2. Crie o construtor padrão para receber o titular e o saldo inicial.
 * 3. Crie os GETTERS para 'titular' e 'saldo'.
 * 4. Crie o SETTER apenas para o 'saldo' (já que o nome do titular não muda no caixa eletrônico).
 */
package POO;
import java.util.Scanner;

class ContaBancaria {
    private String nome;
    private Double saldo;

    public ContaBancaria(String nome, Double saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getSaldo() {
        return this.saldo;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
public class poo5 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Insira o nome do titular");
            String nome = input.nextLine();

            System.out.println("Insira seu saldo inicial");
            String saldo_text = input.nextLine();
            Double saldo_numero = Double.parseDouble(saldo_text);

            ContaBancaria c = new ContaBancaria(nome, saldo_numero);
            // c) Mostre os dados da conta usando os GETTERS (ex: "Titular: X, Saldo: Y").

            System.out.println("Os dados da conta sao: " + c.getNome() + " Saldo: " + c.getSaldo() );

            // d) O cliente fez um depósito! Peça para digitar o valor do depósito.
            System.out.println("Insira o quanto voce esta depositando agora");
            String deposito = input.nextLine();
            Double deposito_numero = Double.parseDouble(deposito);

            Double Valor_total = deposito_numero + c.getSaldo();
            // e) Atualize o saldo usando o SETTER. (Dica: o novo saldo será o saldo antigo + depósito!).
            c.setSaldo(Valor_total);
            // f) Mostre o saldo atualizado usando o GETTER para conferir se o depósito entrou.
            System.out.println("O valor final do saldo eh: " + c.getSaldo());
        }
    }
}