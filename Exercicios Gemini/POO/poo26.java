package POO;
import java.util.Scanner;
/*
 * QUESTÃO 76: O MONITOR DE TEMPERATURA DA ESTUFA
 * * * CENÁRIO:
 * Vamos gerenciar a temperatura de uma estufa de plantas. O objeto guarda o nome da planta.
 * O monitor começa com uma temperatura base de 20.0 graus. Teremos métodos para aumentar ou 
 * diminuir essa temperatura, e um método para avaliar a saúde da planta.
 * * * REQUISITOS DA CLASSE (MonitorEstufa):
 * 1. Crie a classe 'MonitorEstufa' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nomePlanta' (String) e 'temperatura' (Double).
 * 3. Crie o construtor para receber apenas o 'nomePlanta'. A 'temperatura' deve começar em 20.0.
 * 4. Crie os GETTERS padrão para ambos.
 * 5. Crie os MÉTODOS MODIFICADORES (void):
 * - public void aquecer(Double graus) -> Soma o valor recebido à 'this.temperatura'.
 * - public void resfriar(Double graus) -> Subtrai o valor recebido da 'this.temperatura'.
 * 6. Crie o MÉTODO DE NEGÓCIO COM RETORNO (String):
 * public String avaliarStatus() {
 * - SE 'this.temperatura' for MAIOR que 30.0, retorne: "CRÍTICO: Muito quente!"
 * - SE 'this.temperatura' for MENOR que 15.0, retorne: "CRÍTICO: Muito frio!"
 * - SENÃO, retorne: "ESTÁVEL: Temperatura ideal."
*/
class MonitorEstufa {
    private String nomePlanta;
    private Double temperatura;

    public MonitorEstufa(String nomePLanta){
        this.nomePlanta = nomePLanta;
        this.temperatura = 20.0;
    }
    public String getNomePlanta(){
        return this.nomePlanta;
    }
    public Double getTemperatura(){
        return this.temperatura;
    }
    public void aquecer(Double graus){
        this.temperatura = this.temperatura + graus;
    }
    public void resfriar(Double graus){
        this.temperatura = this.temperatura - graus;
    }
    public String availiarStatus(){
        if (this.temperatura > 30.0){
            return "Temperatura esta muito quente";
        } else if (this.temperatura < 15.0){
            return "Temperatura esta muito fria";
        } else {
            return "A temperatura esta ok";
        }
        }    
}
/* REQUISITOS DO MAIN (poo26):
 * 1. Peça o nome da planta e crie o objeto.
 * 2. Peça para o usuário digitar quantos graus deseja AQUECER a estufa e chame o método 'aquecer'.
 * 3. Peça para o usuário digitar quantos graus deseja RESFRIAR a estufa e chame o método 'resfriar'.
 * 4. Imprima o relatório final mostrando a temperatura atual (com 1 ou 2 casas decimais) e o status devolvido pelo método 'avaliarStatus'.
 */
public class poo26 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome da planta");
            String nomePLanta = input.nextLine();
            MonitorEstufa c = new MonitorEstufa(nomePLanta);

            System.out.println("A estufa tem por padrao a temperatura de 20 graus, leve em conta isso");

            System.out.println("Quantos graus voce deseja AQUECER");
            String esquentar = input.nextLine();
            Double esquentar_numeros = Double.parseDouble(esquentar);
            c.aquecer(esquentar_numeros);

            System.out.println("Quantos graus voce deseja resfriar");
            String esfriar = input.nextLine();
            Double esfriar_numero = Double.parseDouble(esfriar);
            c.resfriar(esfriar_numero);

            System.out.println(c.availiarStatus());
            
        }
    }    
}
