/*
 * QUESTÃO 23: O JOGO DA ADVINHAÇÃO (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare: int numeroSecreto = 42; e int palpite;
 * 2. Utilize o do-while para as tentativas do usuário.
 * 3. DENTRO do laço:
 *    - Peça para o usuário: "Adivinhe o número secreto:"
 *    - Leia o palpite.
 *    - SE o palpite for menor que o numeroSecreto:
 *        - Exiba: "Muito baixo! Tente um número maior."
 *    - SENÃO SE o palpite for maior que o numeroSecreto:
 *        - Exiba: "Muito alto! Tente um número menor."
 * 4. A condição do while deve ser: continuar enquanto o palpite for diferente do numeroSecreto.
 * 5. Ao final (fora do laço), exiba: "Parabéns! Você descobriu que o número era " + numeroSecreto;
 */
import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int numeroSecreto = 42;
        int palpite;

        do {
            System.out.println("Adivinhe o numero secreto");
            palpite = input.nextInt();
            
            if (palpite < numeroSecreto){
                System.out.println("Muito baixo, tente um numero maior");
            } else if (palpite > numeroSecreto){
                System.out.println("Muito alto, tente um numero menor");
            }

        } while( palpite != numeroSecreto);

        System.out.println("Parabens você acertou o numero secreto "+ numeroSecreto);

        input.close();

    }
    
}
