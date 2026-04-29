// Calcule a média aritmética de três notas e diga se o aluno passou (Média >= 7).
// Saída esperada (para notas 8, 5 e 9):
// Média: 7.33 - Aprovado

import java.util.Scanner;

public class Exercicio8 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.println("Insira a primeira nota");
        double nota1 = input.nextDouble();

        System.out.println("Insira a segunda nota");
        double nota2 = input.nextDouble();

        System.out.println("Insira a terceira nota");
        double nota3 = input.nextDouble();

        double media = ( (nota1+nota2+nota3) /3);

        if (media >= 7) {
            System.out.println("A media eh "+media+"  -Aprovado");
        } else {
            System.out.println("A media eh " +media+ " -Reprovado");
        }
        input.close();


    }
    
}
