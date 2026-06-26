package POO;
import java.util.Scanner;
/*
 * QUESTÃO 78: A MÁQUINA DE CAFÉ AUTOMÁTICA
 * * * CENÁRIO:
 * Vamos criar o sistema de uma máquina de café de escritório. Ela armazena uma quantidade 
 * de água em mililitros (ml). Cada copo de café consome uma quantidade fixa de água.
 * * * REQUISITOS DA CLASSE (MaquinaCafe):
 * 1. Crie a classe 'MaquinaCafe' fora da classe principal.
 * 2. Atributos PRIVADOS: 'localizacao' (String) e 'conteudoAguaMl' (Integer).
 * 3. Crie o construtor para receber a 'localizacao'. A máquina sempre começa cheia com 1000 ml de água.
 * 4. Crie os GETTERS padrão para ambos.
 * 5. Crie o MÉTODO DE NEGÓCIO 'fazerCafe' (void):
 * public void fazerCafe(Integer mlConsumidos) {
 * - SE 'this.conteudoAguaMl' for MAIOR ou IGUAL ao 'mlConsumidos':
 * Subtraia 'mlConsumidos' do seu 'this.conteudoAguaMl'.
 * Mostre na tela: "Café quentinho saindo! Foram usados [X]ml de água."
 * - SENÃO:
 * Mostre na tela: "Erro: Água insuficiente. Por favor, reabasteça a máquina."
*/
class MaquinaCafe{
    private String localizacao;
    private Integer conteudoAguaMl;

    public MaquinaCafe(String localizacao){
        this.localizacao = localizacao;
        this.conteudoAguaMl = 1000;
    }
    public String getLocalizacao(){
        return this.localizacao;
    }
    public Integer getConteudoAguaMl(){
        return this.conteudoAguaMl;
    }
    public void fazerCafe(Integer mlConsumidos){
        if ( this.conteudoAguaMl>= mlConsumidos){
            this.conteudoAguaMl = this.conteudoAguaMl - mlConsumidos;
            System.out.println("Café quentinho saindo! Foram usandos " + mlConsumidos+ "ml" + "de água");
        } else {
            System.out.println("Erro: Quantidade insuficiente de água. Reabasteça a máquina");
        }
    }
}
/*REQUISITOS DO MAIN (poo28):
 * 1. Peça a localização da máquina (ex: "Cozinha 3º Andar") e crie o objeto.
 * 2. Chame o método 'fazerCafe' passando o valor fixo de 300 (simulando um café grande).
 * 3. Chame o método 'fazerCafe' passando o valor fixo de 800 (simulando outro café grande). 
 * (O sistema deve barrar essa segunda tentativa, pois só restaram 700ml!).
 * 4. Imprima a quantidade de água restante na máquina usando o seu getter.
 */
public class poo28 {
    public static void main(String[] arg){
        try(Scanner input = new Scanner(System.in)){
            System.out.println("Insira a localizacao da maquina");
            String localizacao = input.nextLine();

            System.out.println("A cafeteira possui por padrao 1000ml de água");

            MaquinaCafe m = new MaquinaCafe(localizacao);
            m.fazerCafe(300);
            m.fazerCafe(800);

            System.out.println("A quantidade de água restante na maquina é : " + m.getConteudoAguaMl());

        }
    }
    
}
