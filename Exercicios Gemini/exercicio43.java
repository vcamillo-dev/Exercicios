
/*
 * QUESTÃO 43: CONTROLE DE HORAS TRABALHADAS (MÉTODO LIMPO)
 * * 1. Crie um ArrayList<String> chamado "projetos" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "horas" (vazio).
 * * 3. Crie um loop WHILE que vai rodar exatamente 3 vezes usando um contador.
 * * 4. Dentro do loop:
 * - Peça o nome do projeto trabalhado e adicione em "projetos" (use input.nextLine()).
 * - Peça a quantidade de horas gastas nesse projeto.
 *   (LEIA como String usando input.nextLine() e converta com Double.parseDouble()).
 *   Adicione o valor convertido na lista "horas".
 * * 5. Fora do while:
 * - Crie uma variável double chamada "totalHoras" começando em 0.0.
 * - Use um loop FOR para somar todas as horas da lista "horas".
 * * 6. Ao final, exiba:
 * - A lista de projetos.
 * - O total de horas trabalhadas.
 * - O faturamento total estimando que o freelancer ganha R$ 50.0 por hora.
 */
import java.util.Scanner;
import java.util.ArrayList;

public class exercicio43 {
    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {

            ArrayList<String> projetos = new ArrayList<>();
            ArrayList<Double> horas = new ArrayList<>();

            int contador = 0;

            while (contador < 3) {
                System.out.println("Insira o nome do projeto");
                String projeto = input.nextLine();
                projetos.add(projeto);

                System.out.println("Insira a quantidade de horas gastas n esse projeto");
                String horas_texto = input.nextLine();
                Double horas_numero = Double.parseDouble(horas_texto);
                horas.add(horas_numero);

                contador++;
            }

            double total_horas;

       
        }
    }
}
