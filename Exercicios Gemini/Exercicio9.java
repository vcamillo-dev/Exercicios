// Verifique se uma idade permite votar (mínimo 16 anos).
// Saída esperada (para idade 15):
// Você tem 15 anos. Voto Negado.

import java.util.Scanner;

public class Exercicio9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Insira sua idade");
        int idade = input.nextInt();
        if(idade >=16) {
            System.out.println("Voce tem " +idade+ " anos pode votar");

        } else {
            System.out.println("Voce tem menos de 16 anos, nao pode votar");
        }



        input.close();


    }
    
}
