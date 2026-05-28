/*
* QUESTÃO 48: SISTEMA DE ANÁLISE DE DESEMPENHO DE VENDAS
* * CENÁRIO:
* Uma empresa quer avaliar o desempenho de sua equipe de corretores de imóveis.
* O gerente vai cadastrar o nome de cada corretor e o valor da comissão que ele
* recebeu no mês. O sistema deve rodar de forma dinâmica (perguntando se quer continuar)
* e, no final, gerar um relatório categórico sobre quem atingiu a meta da empresa.
* * REQUISITOS DO PROGRAMA:
* 1. O programa deve permitir o cadastro do NOME do corretor (String) e do
* VALOR DA COMISSÃO (Double) recebida.
* * 2. O loop de cadastro deve ser dinâmico. Após cada corretor cadastrado,
* pergunte se o usuário deseja continuar. Se ele digitar "N" (ou "nao"), o loop encerra.
* * 3. Após encerrar as entradas, o programa deve varrer a lista de comissões e calcular:
* a) Quantos corretores ganharam uma comissão MAIOR OU IGUAL a R$ 5000.0 (Meta Atingida).
* b) Quantos corretores ganharam uma comissão MENOR que R$ 5000.0 (Abaixo da Meta).
* c) O valor total gasto pela empresa com todas as comissões somadas.
* * 4. Exiba na tela:
* - A quantidade de corretores que atingiram a meta.
* - A quantidade de corretores abaixo da meta.
* - O total de dinheiro pago em comissões pela empresa.*/
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio48 {
    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<Double> comissoes = new ArrayList<>();

            boolean running = true;
            while (running) {
                System.out.println("Insira o nome do corretor para cadastrar");
                String nome = input.nextLine();
                nomes.add(nome);

                System.out.println("Insira o valor da comissao");
                String comissao_texto = input.nextLine();
                Double comissao_numero = Double.parseDouble(comissao_texto);
                comissoes.add(comissao_numero);

                System.out.println("Deseja cadastrar mais um corretor ? S, para continuar ou N para finalizar");
                String resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    running = false;
                } else {
                }
            }
            /*
             * 3. Após encerrar as entradas, o programa deve varrer a lista de comissões e
             * calcular:             * 
             * a) Quantos corretores ganharam uma comissão MAIOR OU IGUAL a R$ 5000.0 (Meta
             * Atingida).             * 
             * b) Quantos corretores ganharam uma comissão MENOR que R$ 5000.0 (Abaixo da
             * Meta).             * 
             * c) O valor total gasto pela empresa com todas as comissões somadas.             * 
             * * 4. Exiba na tela:             * 
             * - A quantidade de corretores que atingiram a meta.             * 
             * - A quantidade de corretores abaixo da meta.             * 
             * - O total de dinheiro pago em comissões pela empresa.*/
            int comissao_maior = 0;
            int comissao_menor = 0;
            double total_comissoes = 0;
            for (int i = 0; i < comissoes.size(); i++) {
                if (comissoes.get(i) < 5000.0) {
                    comissao_menor++;
                    total_comissoes = total_comissoes + comissoes.get(i);
                } else {
                    comissao_maior++;
                    total_comissoes = total_comissoes + comissoes.get(i);
                }
            }
            System.out.println("A quantidade de corretores que atingiram a meta eh: " + comissao_maior);
            System.out.println("A quantidade de corretores que nao atingiram a meta eh: " + comissao_menor);
            System.out.println("O valor total de comissoes eh: " + total_comissoes);
        }
    }
}