package POO;
import java.util.Scanner;
/*
 * QUESTÃO 72: CALCULADORA DE VIAGEM (PARÂMETROS DE TIPOS DIFERENTES)
 * * * CENÁRIO:
 * Vamos criar um sistema que calcula o custo total de combustível para uma viagem.
 * O carro faz fixo 10 km por litro de combustível.
 * * * REQUISITOS DA CLASSE (CalculadoraViagem):
 * 1. Crie a classe 'CalculadoraViagem' fora da classe principal.
 * 2. Atributo PRIVADO: 'modeloCarro' (String).
 * 3. Crie o construtor para receber o 'modeloCarro'.
 * 4. Crie o GETTER padrão para o 'modeloCarro'.
 * 5. Crie o MÉTODO DE NEGÓCIO 'calcularCustoViagem' (Retorna Double e recebe dois parâmetros de tipos diferentes!):
 * public Double calcularCustoViagem(Integer distanciaKm, Double precoCombustivel) {
 * - Descubra os litros necessários: Double litrosNecessarios = distanciaKm / 10.0;
 * - Retorne o custo total: return litrosNecessarios * precoCombustivel;
*/
class CalculadoraViagem {
    private String modeloCarro;

    public CalculadoraViagem(String modeloCarro){
        this.modeloCarro = modeloCarro;
    }
    public String getModeloCarro(){
        return this.modeloCarro;
    }
    public Double calcularCustoViagem(Integer distanciaKm, Double precoCombustivel){
        Double litrosNecessarios = distanciaKm / 10.0;
        return litrosNecessarios*precoCombustivel;
    }
}
/*REQUISITOS DO MAIN (poo22):
 * 1. Peça para o usuário digitar o modelo do carro e crie o objeto.
 * 2. Peça para o usuário digitar a distância da viagem em KM (Inteiro).
 * 3. Peça para o usuário digitar o preço do combustível (Double).
 * 4. Chame o método 'calcularCustoViagem' passando os dois valores na ordem correta e exiba o resultado no print.
 * Exemplo: System.out.println("Custo total da viagem: R$" + objeto.calcularCustoViagem(km, preco));
 */
public class poo22 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o modelo do carro");
            String modelo = input.nextLine();

            CalculadoraViagem c = new CalculadoraViagem(modelo);

            System.out.println("Quantos km foram viajados");
            String km_text = input.nextLine();
            Integer km_numero = Integer.parseInt(km_text);

            System.out.println("Qual é o preço do combustivel");
            String preço_text = input.nextLine();
            Double preço_number = Double.parseDouble(preço_text);

            System.out.println("O custo total da viagem é:" + c.calcularCustoViagem(km_numero, preço_number));

        }
    }
}