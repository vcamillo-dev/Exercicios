package POO;
import java.util.Scanner;
/*
 * QUESTÃO 71: O SISTEMA DE NOTAS (MÉTODOS COM MÚLTIPLOS PARÂMETROS)
 * * * CENÁRIO:
 * Vamos criar um sistema escolar. O objeto do aluno guarda o seu nome.
 * O método de negócio receberá as duas notas do bimestre, fará a média e retornará o status.
 * * * REQUISITOS DA CLASSE (BoletimAluno):
 * 1. Crie a classe 'BoletimAluno' fora da classe principal.
 * 2. Atributo PRIVADO: 'nome' (String).
 * 3. Crie o construtor para receber apenas o 'nome'.
 * 4. Crie o GETTER para o 'nome'.
 * 5. Crie o MÉTODO DE NEGÓCIO 'calcularMediaFinal' (Retorna String e RECEBE DOIS parâmetros!):
 * public String calcularMediaFinal(Double nota1, Double nota2) {
 * - Crie uma variável interna: Double media = (nota1 + nota2) / 2.0;
 * - SE 'media' for MAIOR ou IGUAL a 7.0, execute: return "APROVADO com média " + media;
 * - SENÃO, execute: return "REPROVADO com média " + media;
*/
class BoletimAluno{
    private String nome;

    public BoletimAluno(String nome){
    this.nome = nome;
    }
    public String getNome(){
        return this.nome;
    }
    //method
    public String calcularMediaFinal(Double nota1, Double nota2){
        Double media = (nota1 + nota2)/2.0;
        if ( media >= 7.0){
            return "Aluno aprovado com media " + media;
        }else{
            return "Reprovado com media: " + media;
        }
    }
}
/* REQUISITOS DO MAIN (poo21):
 * 1. Peça para o usuário digitar o nome do aluno e crie o objeto passando apenas o nome.
 * 2. Peça para o usuário digitar a Nota 1.
 * 3. Peça para o usuário digitar a Nota 2.
 * 4. Chame o método 'calcularMediaFinal' passando as duas notas separadas por vírgula e exiba no print!
 * Exemplo: System.out.println("Resultado: " + objeto.calcularMediaFinal(n1, n2));
 */

public class poo21 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o nome do aluno");
            String nome = input.nextLine();

            BoletimAluno b = new BoletimAluno(nome);

            System.out.println("Digite a primeira nota do aluno");
            String nota_1_text = input.nextLine();
            Double nota_1_number = Double.parseDouble(nota_1_text);

            System.out.println("Digite a segunda nota do aluno");
            String nota_2_text = input.nextLine();
            Double nota_2_number = Double.parseDouble(nota_2_text);

            System.out.println("A nota final do aluno é: " + b.calcularMediaFinal(nota_2_number,nota_1_number));

        }
    }
    
}
