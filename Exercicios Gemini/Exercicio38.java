/*
 * QUESTÃO 38: CONSULTA DE NOTAS DE ALUNOS (WHILE + BUSCA)
 * * 1. Crie um ArrayList<String> chamado "alunos" e adicione 3 nomes:
 * "Ana", "Carlos", "Beatriz".
 * * 2. Crie um ArrayList<Double> chamado "notas" e adicione as notas:
 * 8.5, 6.0, 9.5 (na mesma ordem dos alunos).
 * * 3. Crie uma estrutura de repetição (WHILE) que continue rodando
 * até que o usuário digite o nome de um aluno que realmente exista.
 * * 4. Dentro do loop, peça para o usuário digitar o nome do aluno.
 * * 5. Use um loop FOR para encontrar o ÍNDICE do aluno digitado
 * (lembre-se do .equalsIgnoreCase() para evitar problemas com maiúsculas).
 * * 6. SE o aluno existir (índice diferente de -1):
 * - Use o índice encontrado para buscar a nota na lista de "notas".
 * - Exiba: "O aluno(a) [NOME] tirou nota [NOTA]".
 * - Encerre o loop mudando a variável de controle do while.
 * * 7. SENÃO (se o aluno não existir):
 * - Exiba: "Aluno não encontrado. Digite novamente!".
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] arg) {
        try(Scanner input = new Scanner(System.in)){

            ArrayList<String> nomes = new ArrayList<>();
            nomes.add("Ana");
            nomes.add("Carlos");
            nomes.add("Beatriz");

            ArrayList<Double> notas = new ArrayList<>();
            notas.add(8.5);
            notas.add(6.0);
            notas.add(9.5);

            boolean running = true;
            while( running = true ){
                System.out.println("Insira o Nome do aluno desejado");
                String nome = input.nextLine();

                int found_index = -1;
                for ( int i =  0 ; i<nomes.size(); i++){
                    if ( nomes.get(i).equalsIgnoreCase(nome)){
                        found_index = i;
                    }

                }
                if ( found_index != -1 ){
                    String nome_encontrado = nomes.get(found_index);
                    Double nota_encontrada = notas.get(found_index);

                    System.out.println("A aluno : " + nome_encontrado + " tirou a nota " + nota_encontrada);

                } else{
                    running = false;
                }

            }

            


        }

    }
    
}
