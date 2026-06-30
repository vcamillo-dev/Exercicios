package POO;
/*
 * QUESTÃO 79.3: O COMBATE DE RPG (PARTE 2 - REGRAS DE SOBREVIVÊNCIA)
 * * * * CENÁRIO:
 * No nosso exercício anterior (poo29_2), os personagens podiam continuar lutando mesmo se a vida 
 * deles fizesse menos sentido lógico. Em um jogo de verdade, personagens mortos não podem atacar 
 * e não podemos atacar um oponente que já foi derrotado. Vamos implementar essas regras de validação.
 * * * * REQUISITOS DA CLASSE (PersonagemRPG):
 * 1. Crie a classe 'PersonagemRPG' fora da classe principal.
 * 2. Atributos PRIVADOS: 'nome' (String), 'pontosVida' (Integer) e 'forcaAtaque' (Integer).
 * 3. Crie o construtor padrão para receber os três atributos ('nome', 'pontosVida', 'forcaAtaque').
 * 4. Crie os GETTERS padrão para todos eles.
 * 5. Modifique o MÉTODO DE NEGÓCIO 'atacar' (void):
 * public void atacar(PersonagemRPG oponente) {
 * - SE a vida de quem está tentando bater (this.pontosVida) for menor ou igual a 0:
 * Não faça nada e mostre: "Erro: [this.nome] está morto e não pode atacar!"
 * 
 * - SENÃO, SE a vida do oponente (oponente.pontosVida) for menor ou igual a 0:
 * Não faça nada e mostre: "Erro: [oponente.getNome()] já está derrotado!"
 * - SENÃO (se ambos estiverem vivos):
 * Subtraia a 'this.forcaAtaque' dos 'pontosVida' do oponente.
 * Mostre a mensagem: "[this.nome] atacou [oponente.getNome()] causando [this.forcaAtaque] de dano!"
 * 
 * * * CHECA MORTE: Logo após aplicar o dano, faça um novo 'if' interno: se a vida do oponente 
 * agora for menor ou igual a 0, mostre também: "[oponente.getNome()] foi derrotado!"
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
    public String getNome() {return this.nome;}
    public Integer getPontosVida() {return this.pontosVida;}
    public Integer getForcaAtaque() { return this.forcaAtaque;}

    public void atacar(PersonagemRPG oponente){
        if ( this.pontosVida <= 0){
            System.out.println("Erro: " + this.nome + " está morto e não pode atacar!");
        }else if (oponente.pontosVida <=0 ){
            System.out.println("Erro: " + oponente.getNome() + " já está derrotado!");
        }else {
            oponente.pontosVida = oponente.pontosVida - this.forcaAtaque;
            System.out.println(this.nome + " atacou " + oponente.getNome() + " causando " + this.forcaAtaque + " de dano!");
        }
        if(oponente.pontosVida <=0 ){
            System.out.println(oponente.getNome() + " foi derrotado!");
        }
    }    
}
/*
 * REQUISITOS DO MAIN (poo29_3):
 * 1. Crie o arquivo e a classe principal com o nome 'poo29_3'.
 * 2. No main, instancie os dois personagens com os seguintes status:
 * - Guerreiro: Nome: "Thorin", Vida: 50, Força: 30.
 * - Monstro: Nome: "Orc Grunt", Vida: 40, Força: 10.
 * 3. Chame o método 'guerreiro.atacar(monstro);' pela PRIMEIRA vez.
 * 4. Chame o método 'guerreiro.atacar(monstro);' pela SEGUNDA vez.
 * 5. Chame o método 'guerreiro.atacar(monstro);' pela TERCEIRA vez.
 * 6. Imprima a vida final de ambos usando os getters para confirmar os valores
 * na tela.
 */
public class poo30 {
    public static void main(String[] arg){
    PersonagemRPG guerreiro = new PersonagemRPG("Thorin", 50, 30);
    PersonagemRPG monstro = new PersonagemRPG("Orc Grunt", 40, 10);
    
    guerreiro.atacar(monstro);
    guerreiro.atacar(monstro);
    guerreiro.atacar(monstro);

    System.out.println("A vida do guerreiro final é " + guerreiro.getPontosVida() + " e do monstro é " + monstro.getPontosVida());
    }   
}
