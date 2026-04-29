import java.util.Scanner;

public class Exercicio16 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);

        double maior = 0;
        double menor = 99999999;
        int i;

        for (i=1 ; i<6 ; i++){
            System.out.println("Insira o valor do produto: ");
            Double valor = input.nextDouble();

            if (valor > maior){
                maior = valor;
            } else if (valor < menor){
                menor = valor;
            } else {

            }
        }
        
        System.out.println("O valor do maior produto eh : "+ maior);
        System.out.println("O valor do menor produto eh : "+ menor);

        input.close();
    }
    
}
