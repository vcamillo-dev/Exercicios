/*
 * QUESTÃO 20: MENU INTERATIVO
 * Escreva um programa que:
 * 1. Utilize um do-while para exibir um menu:
 * -------------------------
 * SISTEMA DE CALCULADORA
 * 1. Somar
 * 2. Subtrair
 * 0. Sair
 * -------------------------
 * 2. Leia a opção do usuário (int opcao).
 * 3. Use um SWITCH (ou IFs) para decidir o que fazer:
 * - Se for 1 ou 2: peça dois números (double n1, n2) e mostre a conta.
 * - Se for 0: mostre "Encerrando sistema...".
 * - Se for qualquer outro número: "Opção inválida!".
 * 4. A condição do while deve ser (opcao != 0).
 */

import java.util.Scanner;

public class Exercicio20 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        int opcao;
        double numero1;
        double numero2;
        double resultado;

        do {
            System.out.println("Insira sua opção 1 para somar, 2 para subtrair e 0 para sair");
            opcao = input.nextInt();

            if(opcao ==1){
                System.out.println("A opcao selecionada foi 1, insira os numeros que voce deseja somar");
                numero1 = input.nextDouble();
                numero2 = input.nextDouble();
                resultado = numero1+numero2;
                System.out.println("A soma dos numeros " + numero1 +" + "+ numero2+ " é igual a " + resultado);

            } else if ( opcao == 2){
                System.out.println("A opcao seleciona foi 2, insira os numeros que voce deseja subtrair");
                numero1 = input.nextDouble();
                numero2 = input.nextDouble();
                resultado = numero1-numero2;
                System.out.println("A subtração dos numeros "+ numero1 +" "+ numero2+" é igual a: "+ resultado );

            } else if ( opcao !=1 || opcao !=2){
                System.out.println("A opcao esta invalida");
            }

            }  while (opcao != 0) ;

        
        input.close();
        }

        

    }
