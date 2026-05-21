import java.util.ArrayList;
import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] arg){

        try (Scanner input = new Scanner(System.in)){

            ArrayList<String> estados = new ArrayList<>();
            estados.add("Sp");
            estados.add("Rj");
            estados.add("Mg");

            ArrayList<String> capitais = new ArrayList<>();
            capitais.add("Sao Paulo");
            capitais.add("Rio de Janeiro");
            capitais.add("Belo Horizonte");

            boolean running = true;

            while (running){
                System.out.println("Insira a siga do estado desejado");
                String estado = input.nextLine();

                int found_index = -1;
                for ( int i = 0 ; i < estados.size(); i++){
                    if (  estados.get(i).equalsIgnoreCase(estado)) {
                        found_index = i;
                        break;                                         
                    }
                }

                if ( found_index != -1 ){
                    String estado_encontrado = estados.get(found_index);
                    String capital_encontrada = capitais.get(found_index);
                    System.out.println("A capital do estado de " + estado_encontrado + " eh: " + capital_encontrada);
                    
                    running = false;

                } else {
                    System.out.println("Setor invalido. Digite novamente");
                }
            }
        }
    }    
}
