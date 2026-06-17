/*
 * QUESTÃO 62: O CONTROLADOR DE TEMPERATURA
 * * * CENÁRIO:
 * Vamos criar o sistema de um ar condicionado. Ele começa com uma temperatura inicial 
 * definida pelo usuário e possui métodos para aumentar ou diminuir essa temperatura.
 * * * REQUISITOS DA CLASSE (ControladorTemperatura):
 * 1. Crie a classe 'ControladorTemperatura' fora da classe principal.
 * 2. Atributos PRIVADOS: 'comodo' (String - ex: Sala, Quarto) e 'temperatura' (Integer).
 * 3. Crie o construtor para receber o 'comodo' e a 'temperatura' inicial.
 * 4. Crie os GETTERS para ambos os atributos. (Sem Setters normais!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'aumentar':
 * public void aumentar(Integer graus) -> Deve SOMAR os graus à 'temperatura' atual.
 * 6. Crie o MÉTODO DE NEGÓCIO 'diminuir':
 * public void diminuir(Integer graus) -> Deve SUBTRAIR os graus da 'temperatura' atual.
 */
package POO;
import java.util.Scanner;

class ControladorTemperatura {
    private String ambientes;
    private Integer temperatura;

    public ControladorTemperatura(String ambientes, Integer temperatura){
        this.ambientes = ambientes;
        this.temperatura = temperatura;
    }
    //getters
    public String getAmbientes(){
        return this.ambientes;
    }
    public Integer getTemperatura(){
        return this.temperatura;
    }
    //metodos
    public void Aumentar(Integer AumentarTemperatura){
        this.temperatura = this.temperatura + AumentarTemperatura;
    }
    public void Diminiuir(Integer DiminuirTemperatura){
        this.temperatura = this.temperatura - DiminuirTemperatura;
    }    
}
/*
REQUISITOS DO MAIN (poo12):
 * 1. Peça o nome do cômodo e a temperatura atual dele.
 * 2. Crie o objeto 'ControladorTemperatura'.
 * 3. Está muito frio! Peça para o usuário digitar quantos graus ele deseja AUMENTAR.
 * 4. Chame o método correspondente no objeto.
 * 5. Exiba a temperatura final atualizada do cômodo usando os GETTERS.
 */

public class poo12{
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do comodo");
            String comodo = input.nextLine();

            System.out.println("Insira a temperatura do comodo");
            Integer temperatura = input.nextInt();

            ControladorTemperatura c = new ControladorTemperatura(comodo, temperatura);

            System.out.println("Esta mto fro, quantos graus voce deseja aumentar?");
            Integer diminuir_Temp = input.nextInt();
            c.Aumentar(diminuir_Temp);
            System.out.println("A temperatura atual é: "+ c.getTemperatura());

            System.out.println("Esquentou o clima, quantos graus voce deseja diminuir");
            Integer aumentar_Temp = input.nextInt();
            c.Diminiuir(aumentar_Temp);
            System.out.println("A temperatura atual é: "+ c.getTemperatura());

        }
    }
}
