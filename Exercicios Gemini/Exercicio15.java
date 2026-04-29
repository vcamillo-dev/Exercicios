/*
 * QUESTÃO 15: O PRODUTO MAIS CARO
 * Escreva um programa que:
 * 1. Utilize um laço for para ler o preço de 5 produtos.
 
 * 2. Crie uma variável para armazenar o maior valor encontrado
 * (double maior = 0).
  
 * 3. Dentro do laço, a cada repetição, utilize um IF para verificar 
 * se o valor digitado agora é maior que o valor guardado na
 * variável "maior".

 * 4. Se o valor atual for maior, atualize a variável "maior" 
 * com esse novo valor.
 * 
 * 5. Ao final, fora do laço, exiba o maior preço encontrado.
 
*  Exemplo de fluxo:
* 
 * Produto 1: 10.0 (maior passa a ser 10.0)
 * Produto 2: 50.0 (50 > 10, maior passa a ser 50.0)
 * Produto 3: 20.0 (20 não é maior que 50, ignora)
 * Saída esperada: "O produto mais caro custa: R$ 50.0"
 */

import java.util.Scanner;

public class Exercicio15 {
    public static void main(String[]arg) {
        Scanner input = new Scanner(System.in);

        double maior_valor = 0;
        int i;

        for ( i = 1 ; i < 6 ; i++){
            System.out.println("Insira o valor do produto");
            Double valor = input.nextDouble();
            
            if ( valor > maior_valor){
                maior_valor = valor;
            
            } else{

            }
        }
        System.out.println("O maior valor exibido eh : " +  maior_valor);
         
        input.close();

    }   
    
}
