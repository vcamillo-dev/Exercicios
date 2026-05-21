/*
 * QUESTÃO 39: CONSULTA DE RAMAL TELEFÔNICO (WHILE + BUSCA)
 * * 1. Crie um ArrayList<String> chamado "departamentos" e adicione 3 setores:
 * "TI", "RH", "Vendas".
 * * 2. Crie um ArrayList<Integer> chamado "ramais" e adicione os números:
 * 101, 102, 103 (na mesma ordem dos departamentos).
 * * 3. Crie um loop WHILE que continue rodando até o usuário digitar um setor válido.
 * * 4. Dentro do loop, peça para o usuário digitar o nome do departamento.
 * * 5. Use um loop FOR para encontrar o ÍNDICE do departamento digitado.
 * * 6. SE o departamento existir (índice diferente de -1):
 * - Busque o número do ramal correspondente na lista de "ramais".
 * - Exiba: "O ramal do setor [DEPARTAMENTO] é o [RAMAL]".
 * - Encerre o loop mudando a variável de controle do while para falso.
 * * 7. SENÃO:
 * - Exiba: "Setor inválido. Digite novamente!".
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio39 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)) {

            ArrayList<String> departamentos = new ArrayList<>();
            departamentos.add("Ti");
            departamentos.add("RH");
            departamentos.add("Vendas");

            ArrayList<String> ramais = new ArrayList<>();
            ramais.add("101");
            ramais.add("102");
            ramais.add("103");

            boolean running = true;
            while ( running ){
                System.out.println("Insira o nome do departamento desejado");
                String departamento = input.nextLine();

                int found_index = -1;
                for (int i = 0; i < departamentos.size(); i++){
                    if (departamentos.get(i).equalsIgnoreCase(departamento)){
                        found_index = i;
                    }
                }

                if ( found_index != -1){
                    String departamento_encontrado = departamentos.get(found_index);
                    String ramal_encontrado = ramais.get(found_index);

                    System.out.println("O ramal do setor : " + departamento_encontrado + " eh: " + ramal_encontrado);
                  
                } else {
                    System.out.println("Setor invalido. Digite novamente!");
                }

            }
        }
    }
}