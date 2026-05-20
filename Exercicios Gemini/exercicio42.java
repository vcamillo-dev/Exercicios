/*
 * QUESTÃO 42: REGISTRO DE CONSUMO DE COMBUSTÍVEL (SEM REMENDO NO SCANNER)
 * * 1. Crie um ArrayList<String> chamado "cidades" (vazio).
 * * 2. Crie um ArrayList<Double> chamado "combustivel" (vazio).
 * * 3. Crie um loop WHILE que vai rodar exatamente 3 vezes usando um contador.
 * * 4. Dentro do loop:
 * - Peça o nome de uma cidade visitada na viagem e adicione em "cidades" (use input.nextLine()).
 * - Peça quantos litros de combustível gastou até lá. 
 *   (LEIA como String usando input.nextLine() e converta com Double.parseDouble()).
 *   Adicione o valor convertido na lista "combustivel".
 * * 5. Fora do while:
 * - Crie uma variável double chamada "totalLitros" começando em 0.0.
 * - Use um loop FOR para somar todos os litros da lista "combustivel".
 * * 6. Exiba a lista de cidades visitadas e a soma total de litros gastos.
 */

import java.util.Scanner;
import java.util.ArrayList;

public class exercicio42 {
    public static void main(String[] arg){
        try ( Scanner input = new Scanner(System.in)){

            ArrayList<String> cidades = new ArrayList<>();


            ArrayList<Double> combustivel = new ArrayList<>();

            int contador = 0;

            while ( contador < 3){
                System.out.println("Insira a cidade desejada");
                String cidade = input.nextLine();
                cidades.add(cidade);

                System.out.println("Insira a quantidade de gasolina gasto (em km/l)");
                String gasolina_texto = input.nextLine();                
                Double gasolina = Double.parseDouble(gasolina_texto);
                combustivel.add(gasolina);

                contador ++;
            }

            double total_litros = 0.0;

            for (int i = 0; i < combustivel.size(); i++){
                total_litros = total_litros + combustivel.get(i);
            }

            System.out.println("Cidades visitadas: " + cidades);
            System.out.println("Total de litros gastos: " + total_litros);




        }
    }
    
}
