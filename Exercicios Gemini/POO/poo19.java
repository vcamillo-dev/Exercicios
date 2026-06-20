package POO;
import java.util.Scanner;
/*
 * QUESTÃO 69: O SIMULADOR DE CRÉDITO BANCÁRIO
 * * * CENÁRIO:
 * Vamos criar um sistema que avalia se uma parcela de empréstimo é aprovada.
 * A parcela não pode ultrapassar 30% do salário do cliente.
 * * * REQUISITOS DA CLASSE (AnaliseCredito):
 * 1. Crie a classe 'AnaliseCredito' fora da classe principal.
 * 2. Atributos PRIVADOS: 'cliente' (String) e 'salario' (Double).
 * 3. Crie o construtor padrão para receber ambos os atributos.
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'simularEmprestimo' (Retorna String e RECEBE parâmetro!):
 * public String simularEmprestimo(Double valorParcela) {
 * - Crie uma variável interna para calcular o limite: Double limite = this.salario * 0.30;
 * - SE o 'valorParcela' for MENOR ou IGUAL ao 'limite', execute: return "APROVADO! A parcela cabe no seu orçamento.";
 * - SENÃO, execute: return "REPROVADO! Valor da parcela ultrapassa 30% do seu salário.";
*/
class AnaliseCredito{
    private String cliente;
    private Double salario;

    public AnaliseCredito(String cliente, Double salario){
        this.cliente = cliente;
        this.salario = salario;
    }
    public String getCliente(){
        return this.cliente;
    }
    public Double getSalario(){
        return this.salario;
    }
    public String simularEmprestimo(Double valorParcela){
        Double limite = this.salario * 0.30;
        if (valorParcela <= limite){
            return "Aprovado! A parcela cabe no seu orçamento";
        }else{
            return "Rperovado! Valor da parcela ultrapassa 30% do salario";
        }        
    }
}
/*REQUISITOS DO MAIN (poo19):
 * 1. Peça para o usuário digitar o nome do cliente e o seu salário. Crie o objeto.
 * 2. Peça para o usuário digitar o valor da parcela que ele deseja pagar.
 * 3. Chame o método 'simularEmprestimo' passando o valor da parcela e jogue o resultado direto no print!
 * Exemplo: System.out.println("Resultado da simulação: " + objeto.simularEmprestimo(parcela_digitada));
 */
public class poo19 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o nome do cliente");
            String nome = input.nextLine();

            System.out.println("Digite o seu salario");
            String salario_texto = input.nextLine();
            Double salario_numero = Double.parseDouble(salario_texto);

            AnaliseCredito a = new AnaliseCredito(nome, salario_numero);

            System.out.println("Qual valor da parcela que voce deseja pagar?");
            Double parcela = input.nextDouble();

            System.out.println("Resultado da simulação: " + a.simularEmprestimo(parcela));

        }
    }
    
}
