/* * QUESTÃO 50: SISTEMA CONSOLIDADO DE RECRUTAMENTO (O DESAFIO FINAL)
 * * CENÁRIO:
 * O RH de uma empresa de tecnologia quer registrar os candidatos de um processo 
 * seletivo para vagas de programação. O sistema deve coletar os dados e, ao final, 
 * cuspir um relatório estatístico completo para a diretoria.
 * * REQUISITOS DO PROGRAMA:
 * 1. O programa deve permitir o cadastro do NOME do candidato (String) e da 
 * NOTA do teste técnico (Double).
 * * 2. O loop deve ser totalmente dinâmico (pergunta se deseja continuar S/N).
 * * 3. Após encerrar os cadastros, faça um único loop FOR para calcular:
 * a) O total de candidatos cadastrados.
 * b) A média geral das notas de todos os candidatos.
 * c) Quantos candidatos foram APROVADOS (Nota maior ou igual a 7.0).
 * d) O nome e a nota do candidato CAMPEÃO (A maior nota do processo seletivo).
 * * 4. Exiba na tela de forma organizada:
 * - Lista de todos os nomes inscritos.
 * - Quantidade total de candidatos e a média geral das notas.
 * - Quantidade de candidatos aprovados.
 * - O anúncio: "O(A) campeão(ã) do processo foi [NOME] com a nota impressionante de [NOTA]!".*/

import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio50 {
    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> nomes = new ArrayList<>();
            ArrayList<Double> notas = new ArrayList<>();

            boolean running = true;
            while (running) {
                System.out.println("Insira o nome do cadidato: ");
                String nome = input.nextLine();
                nomes.add(nome);

                System.out.println("Insira nota do cadidato: ");
                String nota_text = input.nextLine();
                Double nota_numero = Double.parseDouble(nota_text);
                notas.add(nota_numero);

                System.out.println("Desaja cadastrar outro participante? (S para continuar ou N para encerrar)");
                String resposta = input.nextLine();
                if (resposta.equalsIgnoreCase("N")) {
                    running = false;
                } else {
                }
            }
            /*
             * 3. Após encerrar os cadastros, faça um único loop FOR para calcular:
             * a) O total de candidatos cadastrados.
             * b) A média geral das notas de todos os candidatos.
             * c) Quantos candidatos foram APROVADOS (Nota maior ou igual a 7.0).
             * d) O nome e a nota do candidato CAMPEÃO (A maior nota do processo seletivo).
             * * 4. Exiba na tela de forma organizada:
             * - Lista de todos os nomes inscritos.
             * - Quantidade total de candidatos e a média geral das notas.
             * - Quantidade de candidatos aprovados.
             * - O anúncio:
             * "O(A) campeão(ã) do processo foi [NOME] com a nota impressionante de [NOTA]!"
             * .
             */

            int total_candidados = 0;
            double medial_geral = 0;
            int aprovados = 0;
            double maior_nota = 0;
            int maior_indice = 0;

            for (int i = 0; i < notas.size(); i++) {
                medial_geral = medial_geral + notas.get(i);
                total_candidados++;

                if (notas.get(i) >= 7.0) {
                    aprovados++;
                }

                if (notas.get(i) > maior_nota) {
                    maior_nota = notas.get(i);
                    maior_indice = i;
                }
            }
            System.out.println("Todos os candidados listados sao: " + nomes);
            System.out.println("A quantidade total de candidatos eh: " + total_candidados+ "e a media geral das notas eh: " + (medial_geral / total_candidados));
            System.out.println("A quantidade de candidatos aprovados eh: " + aprovados);
            System.out.println("O(A) Campeao do processo foi: " + nomes.get(maior_indice)+ " com a nota impressionante de: " + notas.get(maior_indice));
        }
    }
}
