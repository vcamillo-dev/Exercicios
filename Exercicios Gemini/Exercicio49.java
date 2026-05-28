/*
 * QUESTÃO 49: CONTROLE DE ACESSO E PERFIL DE PÚBLICO
 * * CENÁRIO:
 * A segurança de um evento precisa registrar a idade de todas as pessoas que 
 * entram. No final do evento, a organização quer saber estatísticas sobre o público.
 * * REQUISITOS DO PROGRAMA:
 * 1. O programa deve permitir o cadastro do NOME da pessoa (String) e da IDADE (Integer).
 * * 2. O loop deve ser dinâmico (pergunte "Deseja cadastrar mais alguém? S/N").
 * * 3. Após o encerramento, o programa deve varrer as idades e calcular:
 * a) Quantos menores de idade tentaram entrar (Idade MENOR que 18).
 * b) Quantos adultos entraram (Idade MAIOR OU IGUAL a 18).
 * c) A média de idade das pessoas que compareceram (Soma de todas as idades dividida pelo total de pessoas cadastradas).
 * * 4. Exiba na tela:
 * - O total de menores de idade.
 * - O total de adultos.
 * - A média de idade do público (ex: "Média de idade do público: 24.5 anos").
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)){
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<Double> idades = new ArrayList<>();

            boolean running = true;
            while (running){
                System.out.println("Insira o nome do participante: ");
                String nome = input.nextLine();
                nomes.add(nome);

                System.out.println("Insira a idade do participante: ");
                String idade_texto = input.nextLine();
                Double idade_numero = Double.parseDouble(idade_texto);
                idades.add(idade_numero);

                System.out.println("Desaja cadastrar outro participante? (S para continuar ou N para encerrar)");
                String resposta = input.nextLine();
                if ( resposta.equalsIgnoreCase("N")){
                    running = false;
                } else {
                }            
            }
/* 3. Após o encerramento, o programa deve varrer as idades e calcular:
 * a) Quantos menores de idade tentaram entrar (Idade MENOR que 18).
 * b) Quantos adultos entraram (Idade MAIOR OU IGUAL a 18).
 * c) A média de idade das pessoas que compareceram (Soma de todas as idades dividida pelo total de pessoas cadastradas).
 * * 4. Exiba na tela:
 * - O total de menores de idade.
 * - O total de adultos.
 * - A média de idade do público (ex: "Média de idade do público: 24.5 anos"). */

            int menores_idade = 0;
            int adultos = 0;
            double soma_idades = 0;

            for ( int i = 0; i < idades.size(); i++){
                if (idades.get(i) < 18){
                    soma_idades = soma_idades + idades.get(i);
                    menores_idade ++;
                } else {
                    adultos ++;
                    soma_idades = soma_idades+idades.get(i);
                }
            }
            int total = menores_idade + adultos;
            System.out.println("A quantidade de menores no ambiente foi: "+ menores_idade);
            System.out.println("A quantidade de adultos foi: "+ adultos);
            System.out.println("A media de idade do publico foi: " +(soma_idades)/total);

        
    }    
}
}
