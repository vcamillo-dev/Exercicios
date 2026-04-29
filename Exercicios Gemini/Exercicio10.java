// Exiba o nome de um dia da semana baseado em um número de 1 a 7.
// Saída esperada (para o número 1):
// Dia 1: Domingo


import java.util.Scanner;

public class Exercicio10 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o numero do dia da semana");
        int dia = input.nextInt();

        if (dia == 1) {
            System.out.println("o Dia"+dia+"corresponde a domingo");        
        }
        if (dia == 2) {
            System.out.println("o Dia"+dia+"corresponde a segunda");
        }
        if (dia == 3) {
            System.out.println("o Dia"+dia+"corresponde a terca feira");
        }
        if (dia == 4) {
            System.out.println("o Dia"+dia+"corresponde a quarta feira");
        }
        if (dia == 5) {
            System.out.println("o Dia"+dia+"corresponde a quinta feira");
        }
        if (dia == 6) {
            System.out.println("o Dia"+dia+"corresponde a sexta feira");
        }
        if (dia == 6) {
            System.out.println("o Dia"+dia+"corresponde a sabado");
        };

        input.close();
    }
}