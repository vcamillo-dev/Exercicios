/*
 * QUESTÃO 33: O BUSCADOR DE NOMES
 * 1. Crie um ArrayList<String> chamado "convidados".
 * 2. Peça para o usuário cadastrar 5 nomes (use um for simples de 0 a 5).
 * 3. Depois, peça para o usuário digitar UM nome para pesquisar.
 * 4. Use um novo FOR para percorrer a lista e um IF para verificar:
 * - SE convidados.get(i).equalsIgnoreCase(nomePesquisado)
 * - ENTÃO exiba: "Nome encontrado na posição " + i
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] arg){
        try (Scanner input = new Scanner(System.in)) {
            ArrayList<String> convidados = new ArrayList<>();
            String convidado;
            
            for ( int i = 0 ; i < 5 ; i ++){
                System.out.println("Cadastre os nomes do convidados");
                convidado = input.nextLine();
                convidados.add(convidado);
            }
            
            System.out.println("Qual nome voce deseja pesquisar");
            String pesquisar = input.nextLine();
            
            
            for ( int i = 0; i < convidados.size() ; i ++) {
                if ( convidados.get(i).equalsIgnoreCase(pesquisar)) {
                    System.out.println("Nome encontrado na posicao: " + i);
                    
                }
            }
        }

        }

    }
    
