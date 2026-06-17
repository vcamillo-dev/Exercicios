/*
 * QUESTÃO 63: O CONTROLE DA CABINE DE PEDÁGIO
 * * * CENÁRIO:
 * Vamos criar o sistema de uma cabine de pedágio de uma rodovia. A cabine registra 
 * o total de dinheiro arrecadado e a quantidade total de veículos que passaram por ela.
 * * * REQUISITOS DA CLASSE (CabinePedagio):
 * 1. Crie a classe 'CabinePedagio' fora da classe principal.
 * 2. Atributos PRIVADOS: 'identificador' (String - ex: "Cabine 01") e 'totalArrecadado' (Double).
 * 3. Crie o construtor para receber apenas o 'identificador'. O 'totalArrecadado' deve começar valendo 0.0 direto no construtor.
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'registrarPassagem':
 * public void registrarPassagem(Double valorPago) -> Deve SOMAR o valorPago ao 'totalArrecadado'.
 */ 
package POO;
import java.util.Scanner;

class CabinePedagio {
    private String identificador;
    private Double totalArrecadado;

    public CabinePedagio (String identificador, Double totalArrecadado){
        this.identificador = identificador;
        this.totalArrecadado = totalArrecadado = 0.0;
    }
    //getters
    public String getIdentificador(){
        return this.identificador;
    }
    public Double getTotalArrecadado(){
        return this.totalArrecadado;
    }
    //methods
    public void registrarPassagem(Double valorPago){
        this.totalArrecadado = this.totalArrecadado + valorPago;
    }
}
/*REQUISITOS DO MAIN (poo13):
 * 1. Peça o identificador da cabine (ex: "Cabine Norte") e crie o objeto.
 * 2. Um carro passou! Peça para o usuário digitar o valor do pedágio cobrado desse primeiro carro.
 * 3. Chame o método 'registrarPassagem' para atualizar o caixa da cabine.
 * 4. Outro carro passou! Peça para digitar o valor do pedágio desse segundo carro.
 * 5. Chame o método 'registrarPassagem' novamente.
 * 6. Exiba o relatório final da cabine usando os GETTERS para mostrar o identificador e o total acumulado de dinheiro.
 */

public class poo13{
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){            
            System.out.println("Insira o identificador da cabine no qual voce se encontra");
            String identificador = input.nextLine();

            System.out.println("Insira o valor cobrado no pedagio");
            String valor_texto = input.nextLine();
            Double valor_numero = Double.parseDouble(valor_texto);

            CabinePedagio c = new CabinePedagio(identificador, valor_numero);
            c.registrarPassagem(valor_numero);

            System.out.println("Um segundo carro passou, cobre o valor do pedagio desse segundo carro!");
            String valor_texto_2 = input.nextLine();
            Double valor_numero_2 = Double.parseDouble(valor_texto_2);
            c.registrarPassagem(valor_numero_2);

            System.out.println("O total acumulado na cabine "+ c.getIdentificador()+ " é " + c.getTotalArrecadado());

        }
    }
}