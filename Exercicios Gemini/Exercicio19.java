/*
 * QUESTÃO 19: VALIDAÇÃO DE SENHA (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare uma variável int senhaCorreta = 1234.
 * 2. Utilize o laço "do-while" para pedir ao usuário que digite a senha.
 * 3. Estrutura: 
 * do { 
 * // pede a senha e lê aqui dentro
 * } while (senhaDigitada != senhaCorreta);
 * 4. Enquanto ele errar, o programa continua repetindo.
 * 5. Quando ele acertar, exiba "Acesso Permitido!".
 */

import java.util.Scanner;

public class Exercicio19 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int senhaCorreta =1234;
        int senhaDigitada;

        do {
            System.out.println("Insira a senha");
            senhaDigitada = input.nextInt();

            if (senhaDigitada != senhaCorreta) {
                System.out.println("Senha incorreta, tente novamente");
            }

        } while (senhaDigitada != senhaCorreta);

        System.out.println("Acesso permitido");

        input.close();

    }
    
}
