/*
 * QUESTÃO 44: MAIOR NOTA DA TURMA
 * * 1. Crie um ArrayList<String> chamado "alunos" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "notas" (vazio).
 * * 3. Crie um loop WHILE que rode exatamente 3 vezes usando um contador.
 * * 4. Dentro do loop, peça o nome do aluno e a nota dele (use o método limpo Double.parseDouble(input.nextLine())).
 * * 5. Fora do while:
 * - Crie uma variável double chamada "maiorNota" começando com o valor 0.0.
 * - Use un loop FOR para percorrer a lista de notas.
 * - Dentro do FOR, faça um IF: SE a nota atual for MAIOR que a "maiorNota", 
 *   a variável "maiorNota" deve receber essa nota atual.
 * * 6. Ao final de tudo, exiba a lista de alunos e qual foi a maior nota encontrada.
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio44 {

    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {

            ArrayList<String> alunos = new ArrayList<>();
            ArrayList<Double> notas = new ArrayList<>();

            int contador = 0;
            int i;
            while( contador < 3 ){
                System.out.println("Insira o nome do aluno: ");
                String nome = input.nextLine();
                alunos.add(nome);

                System.out.println("Insira a nota do aluno: ");
                String nota_texto = input.nextLine();
                Double nota_numero = Double.parseDouble(nota_texto);
                notas.add(nota_numero);
                contador ++;
            }
/*
 - Use un loop FOR para percorrer a lista de notas.
 * - Dentro do FOR, faça um IF: SE a nota atual for MAIOR que a "maiorNota", 
 *   a variável "maiorNota" deve receber essa nota atual.
 * * 6. Ao final de tudo, exiba a lista de alunos e qual foi a maior nota encontrada.
 */
            double maior_nota = 0.0;
            for ( i = 0; i < notas.size(); i++){
                if ( notas.get(i) > maior_nota){
                    maior_nota = notas.get(i);
                }
            }

            System.out.println("A lista de alunos eh : " + alunos + " e a maior nota eh : " + maior_nota);
            
        }
    }
}
