/*
 * QUESTÃO 25: MÉDIA DE NOTAS VÁLIDAS (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare: double nota, double somaNotas = 0; e int contador = 0;
 * 2. Utilize o do-while para pedir 4 notas válidas (entre 0 e 10).
 * 3. DENTRO do laço:
 *    - Peça a nota.
 *    - SE a nota estiver entre 0 e 10 (inclusive):
 *        - Some a nota à somaNotas.
 *        - Aumente o contador em 1.
 *    - SENÃO:
 *        - Exiba: "Nota inválida! Digite valores de 0 a 10."
 * 4. A condição do while deve ser: continuar enquanto contador < 4.
 * 5. Ao final, calcule a média (somaNotas / 4) e exiba o resultado.
 */

import java.util.Scanner;

public class Exercicio25 {
    @SuppressWarnings("empty-statement")
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)) {

       

        Double nota;
        Double somaNotas = 0.0;
        int contador = 0;

        do{
            System.out.println("Insira 4 notas entre 0 a 10");
            nota = input.nextDouble();

            if ( nota >= 0 && nota <=10 ){
                somaNotas = nota+somaNotas;
                contador ++;

            } else if (nota < 0 && nota >10){
                System.out.println("Nota inválida! Digite valores de 0 a 10");

            }

        } while(contador < 4);

        System.out.println("A Media final do aluno é " + somaNotas/4 );

        input.close();

        }
    }
}
