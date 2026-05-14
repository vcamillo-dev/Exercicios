/*
 * QUESTÃO 32: MÉDIA COM ARRAYLIST
 * Escreva um programa que:
 * 1. Declare um ArrayList de números inteiros: 
 * ArrayList<Integer> notas = new ArrayList<>();
 * 2. Use um while(true) para pedir notas (números inteiros).
 * 3. Se o usuário digitar um número negativo (ex: -1), o programa para de pedir.
 * 4. Após o loop, use um FOR para somar todas as notas guardadas na lista.
 * Dica: para pegar a nota use notas.get(i)
 * 5. Calcule e exiba a média final.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio32 {
    public static void main(String[] arg){

        ArrayList<Integer> notas = new ArrayList<>();
        int nota ;
        int total = 0;

        try (Scanner input = new Scanner(System.in)) {
            while ( true ){
                System.out.println("Insira as notas dos alunos(ou nota negativa para sair)");
                nota = input.nextInt();

                if ( nota < 0 ){
                    break;
                }

                notas.add(nota);
            }
        }

        for (int i = 0; i < notas.size() ; i++){
            total = total + notas.get(i);                
        }
        
        if (!notas.isEmpty() ){
            double media = (double) total / notas.size();
            System.out.println("A media total e: " + media);
        } else{
            System.out.println("Nenhuma nota foi inserida");
        }

    }
    
}
