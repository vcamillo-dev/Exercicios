/*
 * QUESTÃO 61: O CONTADOR DE PASSOS (MÉTODOS DE NEGÓCIO)
 * * * CENÁRIO:
 * Vamos criar um sistema para um relógio inteligente que conta os passos de uma caminhada.
 * O total de passos começa com o valor que o usuário já deu no dia e vai aumentando.
 * * * REQUISITOS DA CLASSE (ContadorPassos):
 * 1. Crie a classe 'ContadorPassos' fora da classe principal.
 * 2. Atributos PRIVADOS: 'usuario' (String) e 'totalPassos' (Integer).
 * 3. Crie o construtor para receber o 'usuario' e o 'totalPassos' inicial.
 * 4. Crie os GETTERS para ambos os atributos. (Sem Setters!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'caminhar':
 * public void caminhar(Integer novosPassos) -> Deve SOMAR os novosPassos ao 'totalPassos'.
*/
package POO;
import java.util.Scanner;

class ContadorPassos {
    private String usuario;
    private Integer totalPassos;   
    
    public ContadorPassos(String usuario, Integer totalPassos){
        this.usuario = usuario;
        this.totalPassos = totalPassos;
    }
    //getters
    public String getUsuario(){
        return this.usuario;
    }
    public Integer getTotalPassos(){
        return this.totalPassos;
    }
    //metodo
    public void caminhar(Integer novosPassos){
        this.totalPassos = this.totalPassos + novosPassos;
    }
}
 /* REQUISITOS DO MAIN (poo11):
 * 1. Peça o nome do usuário e quantos passos ele já deu hoje.
 * 2. Crie o objeto 'ContadorPassos'.
 * 3. O usuário começou a caminhar! Peça para digitar quantos NOVOS passos ele deu agora.
 * 4. Chame o método inteligente do objeto: objeto.caminhar(novos_passos_digitados);
 * 5. Exiba o total de passos atualizado na tela usando o GETTER.
 */
public class poo11{
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira o nome do usuario");
            String usuario = input.nextLine();
            System.out.println("Insira a quantidade de passos");
            Integer totalPassos = input.nextInt();

            ContadorPassos c = new ContadorPassos(usuario, totalPassos);

            System.out.println("Quantos passos novos voce deu?");
            Integer novosPassos = input.nextInt();
            c.caminhar(novosPassos);

            System.out.println("O usuario: " + c.getUsuario()+ " deu "+ c.getTotalPassos()+ " Passos");
        }
    }
}