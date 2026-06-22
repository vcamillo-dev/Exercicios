package POO;
import java.util.Scanner;
/*
 * QUESTÃO 75: O CONTROLADOR DE ACESSOS
 * * * CENÁRIO:
 * Vamos criar o sistema de uma catraca de um evento tecnológico.
 * O sistema registra o nome do evento, e a quantidade de pessoas começa em 0.
 * Toda vez que uma pessoa passa pela catraca, o sistema registra a entrada (+1).
 * * * REQUISITOS DA CLASSE (ControladorCatraca):
 * 1. Crie a classe 'ControladorCatraca' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nomeEvento' (String) e 'totalEntradas' (Integer).
 * 3. Crie o construtor para receber apenas o 'nomeEvento'. O 'totalEntradas' começa em 0.
 * 4. Crie os GETTERS padrão para ambos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'registrarAcesso' (void e SEM parâmetros):
 * public void registrarAcesso() {
 * - Toda vez que for chamado, deve somar 1 ao 'this.totalEntradas'.
 * - Dica: use 'this.totalEntradas = this.totalEntradas + 1;' ou 'this.totalEntradas++;'
*/
class ControladorCatraca {
    private String nomeEvento;
    private Integer totalEntradas;
    
    public ControladorCatraca(String nomeEvento){
        this.nomeEvento = nomeEvento;
        this.totalEntradas = 0;
    }    
    public String getNomeEvento(){
        return this.nomeEvento;
    }
    public Integer getTotalEntradas(){
        return this.totalEntradas;
    }
    public void registrarAcesso(){
        this.totalEntradas ++;
    }
}
/*REQUISITOS DO MAIN (poo25):
 * 1. Peça o nome do evento e crie o objeto.
 * 2. Simule a entrada de 3 pessoas chamando o método 3 vezes seguidas no código!
 * Exemplo: 
 * objeto.registrarAcesso();
 * objeto.registrarAcesso();
 * objeto.registrarAcesso();
 * 3. Exiba o relatório final usando os GETTERS (ex: "O evento X recebeu um total de Y pessoas.").
 */
public class poo25 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do evento");
            String nomeEvento = input.nextLine();

            ControladorCatraca c = new ControladorCatraca(nomeEvento);

            System.out.println("1 pessoa entrou");
            c.registrarAcesso();

             System.out.println("1 pessoa entrou");
            c.registrarAcesso();

             System.out.println("1 pessoa entrou");
            c.registrarAcesso();

            System.out.println("O evento " + c.getNomeEvento() + " recebeu: " + c.getTotalEntradas() + " pessoas");
        }
    }
    
}
