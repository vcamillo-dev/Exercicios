// Scanner para ler os preços.Uma variável double total = 0;
//  declarada antes do laço.Um laço for que se repete 5 vezes.
// Dentro do for:Uma mensagem a pedir o preço: "Digite o valor 
// do produto: ".A leitura do valor.A soma desse valor à 
// variável total (total = total + valor;).Depois do for:
// A exibição do valor final acumulado.Exemplo de como a lógica
//  funciona na memória:Começa: total = 0 1º produto (10.0):
//  total passa a ser 10.0 2º produto (5.0):
//  total passa a ser 15.0 
// ... e assim por diante até ao 5º produto.

import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args){

        Scanner input =  new Scanner(System.in);

        double contador = 0;

        for(double i = 1 ; i < 6; i=i+1 ){
            System.out.println("Digite o valor do produto:");
            double valor = input.nextDouble();
            contador = valor + contador;
        }
        
        System.out.println("O valor total eh: "+ contador);

        input.close();           
                    
    }
    
}
