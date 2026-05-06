/*
 * QUESTÃO 24: TOTALIZADOR DE COMPRAS (DO-WHILE)
 * Escreva um programa que:
 * 1. Declare: double preco, double total = 0; e int qtdProdutos = 0;
 * 2. Utilize o do-while para ler os preços dos produtos.
 * 3. DENTRO do laço:
 *    - Peça o preço do produto (ou 0 para encerrar).
 *    - Leia o preco.
 *    - SE o preco for maior que 0:
 *        - Adicione o preco ao total.
 *        - Incremente 1 na qtdProdutos (qtdProdutos++).
 *    - SENÃO SE o preco for menor que 0:
 *        - Exiba: "Preço inválido! Valor ignorado."
 * 4. A condição do while deve ser: continuar enquanto preco != 0.
 * 5. Ao final, exiba:
 *    - "Quantidade de itens: " + qtdProdutos
 *    - "Total da compra: R$ " + total
 */

import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] arg){
        Scanner input = new Scanner(System.in);
        
        double preco;
        double total = 0; 
        int qntdProdutos = 0;

        do{
            System.out.println("Insira o preço do produto ou 0 p encerrar");
            preco = input.nextDouble();
            
            if ( preco > 0 ){
                total = preco + total;
                qntdProdutos ++;

            } else if ( preco < 0){
                System.out.println("Preco invalido insiro, ele precisa ser maior que zero");
            }
        } while( preco != 0);

        System.out.print("O valor total dos produtos é: " + total + " E a quantidade de produtos é: " + qntdProdutos);
        input.close();
    }
    
}
