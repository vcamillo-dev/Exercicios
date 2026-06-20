package POO;
import java.util.Scanner;
/*
 * QUESTÃO 68: O TERMÔMETRO DO DATA CENTER (MÉTODO COM RETORNO)
 * * * CENÁRIO:
 * Vamos monitorar a temperatura de uma sala de servidores (Data Center).
 * O sistema deve analisar a temperatura atual e DEVOLVER um diagnóstico em texto.
 * * * REQUISITOS DA CLASSE (TermometroDataCenter):
 * 1. Crie a classe 'TermometroDataCenter' fora da classe principal.
 * 2. Atributos PRIVADOS: 'sala' (String) e 'temperatura' (Double).
 * 3. Crie o construtor padrão para receber ambos os atributos.
 * 4. Crie os GETTERS para ambos os atributos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'analisarStatus' (Repare que NÃO é void, ele retorna uma String!):
 * public String analisarStatus() {
 * - SE 'this.temperatura' for MAIOR que 25.0, execute: return "ALERTA: Superaquecimento!";
 * - SENÃO, execute: return "STATUS: Temperatura normal.";
*/
class TermometroDataCenter {
    private String sala;
    private Double temperatura;

    public TermometroDataCenter(String sala, Double temperatura){
        this.sala = sala;
        this.temperatura = temperatura;
    }    
    public String getSala(){
        return this.sala;
    }
    public Double getTemperatura(){
        return this.temperatura;
    }
    public String analisarStatus(){
        if (this.temperatura> 25.0){
            return "Alerta: Superaquecimento!";
        } else {
            return "Temperatura normal";
        }
    }
}
/*REQUISITOS DO MAIN (poo18):
 * 1. Peça para o usuário digitar o nome da sala e a temperatura atual. Crie o objeto.
 * 2. Chame o método 'analisarStatus()'. Como ele DEVOLVE um texto, você deve colocar ele direto dentro de um System.out.println()!
 * Exemplo: System.out.println("Diagnóstico: " + objeto.analisarStatus());
 */
public class poo18{
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Digite o nome da sala");
            String sala = input.nextLine();
            System.out.println("Digite a temperatura atual");
            String temperatura_texto = input.nextLine();
            Double temperatura_numero = Double.parseDouble(temperatura_texto);

            TermometroDataCenter t = new TermometroDataCenter(sala, temperatura_numero);
            System.out.println("Diagnostico " + t.analisarStatus());

        }
    }
}
