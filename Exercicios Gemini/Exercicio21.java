/*
 * QUESTÃO 21: VALIDADOR DE INTERVALO (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare uma variável double nota.
 * 2. Utilize o laço "do-while" para forçar o usuário a digitar uma nota válida.
 * 3. O programa deve pedir a nota (0 a 10).
 * 4. SE a nota for menor que 0 OU maior que 10:
 *    - Exiba "Nota inválida! Digite novamente:".
 * 5. A condição do while deve ser: continuar repetindo ENQUANTO a nota for inválida.
 * 6. Ao final (fora do laço), exiba: "Nota registrada com sucesso: " + nota.
 */

import java.util.Scanner;

public class Exercicio21 {
    public static void main (String[] arg){
        Scanner input = new Scanner(System.in);

        double nota;


        do {
            System.out.println("Insira uma nota de 0 a 10");
            nota = input.nextDouble();

            if ( nota < 0 || nota > 10){
                System.out.println("Nota invalida, insira uma nota entre 0 e 10");

            } else if (nota > 0 || nota <10){
                System.out.println("Nota valida adicionando-a ao sistema");
            }


        } while (nota <0 || nota > 10);

        System.out.println("A nota final adicionadao foi "+ nota);



        input.close();

    }
}
