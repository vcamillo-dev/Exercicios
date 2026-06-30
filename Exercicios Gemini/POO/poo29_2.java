package POO;
import java.util.Scanner;
/*
 * QUESTÃO 79.2: COMBATE DE RPG
 * * * CENÁRIO:
 * Vamos simular um ataque em um jogo de RPG. O método de ataque roda dentro do personagem 
 * que está BATENDO, e recebe como parâmetro o personagem que está DEFENDENDO (apanhando).
 * * * REQUISITOS DA CLASSE (PersonagemRPG):
 * 1. Crie a classe 'PersonagemRPG' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nome' (String), 'pontosVida' (Integer) e 'forcaAtaque' (Integer).
 * 3. Crie o construtor para receber os três atributos ('nome', 'pontosVida', 'forcaAtaque').
 * 4. Crie os GETTERS padrão para todos eles.
 * 5. Crie o MÉTODO DE NEGÓCIO 'atacar' (void):
 * public void atacar(PersonagemRPG oponente) {
 * - Pegue a 'this.forcaAtaque' (a força de quem está batendo).
 * - Subtraia esse valor dos 'pontosVida' do oponente! 
 * (Dica: oponente.pontosVida = oponente.pontosVida - this.forcaAtaque;)
 * - Mostre na tela: "[this.nome] atacou [oponente.getNome()] causando [this.forcaAtaque] de dano!"
*/
class PersonagemRPG {
    private final String nome;
    private Integer pontosVida;
    private final Integer forcaAtaque;

    public PersonagemRPG(String nome, Integer pontosVida, Integer forcaAtaque) {
        this.nome = nome;
        this.pontosVida = pontosVida;
        this.forcaAtaque = forcaAtaque;
    }
    public String getNome(){ return this.nome; }
    public Integer getPontosVida() { return this.pontosVida; }
    public Integer getForcaAtaque() { return this.forcaAtaque; }
    public void setPontosVida(Integer pontosVida) { this.pontosVida = pontosVida; }

    public void atacar(PersonagemRPG oponente){
        oponente.setPontosVida(oponente.getPontosVida() - this.forcaAtaque);
        System.out.println(this.nome + " atacou " + oponente.getNome() + " causando " + this.forcaAtaque + " de dano!");
    }
}
/*
REQUISITOS DO MAIN (poo29_2):
 * 1. Crie o PERSONAGEM 1 (Guerreiro) com Nome: "Thorin", Vida: 100, Força: 25.
 * 2. Crie o PERSONAGEM 2 (Monstro) com Nome: "Orc Grunt", Vida: 80, Força: 10.
 * 3. Mostre a vida inicial de ambos na tela usando os GETTERS.
 * 4. Faça o Thorin atacar o Orc chamando o método a partir do Thorin e passando o Orc como parâmetro.
 * Exemplo: guerreiro.atacar(monstro);
 * 5. Imprima a vida final de ambos para confirmar que a vida do Orc caiu de 80 para 55, e a do Thorin continuou em 100.
 */

public class poo29_2 {
    public static void main(String[] arg) {
        try(Scanner input = new Scanner(System.in)){
            PersonagemRPG guerreiro = new PersonagemRPG("Thorin",100,25);
            PersonagemRPG monstro = new PersonagemRPG("Grunt", 80, 10);

            System.out.println("A vida inicial do guerreiro é: " + guerreiro.getPontosVida());
            System.out.println("A vida inicial do monstro é: " + monstro.getPontosVida());

            guerreiro.atacar(monstro);

            System.out.println("A vida atual do guerreiro é: " + guerreiro.getPontosVida());
            System.out.println("A vida atual do monstro é: " + monstro.getPontosVida());            
            
        }        
    }
}