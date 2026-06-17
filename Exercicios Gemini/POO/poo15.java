package POO;

import java.util.Scanner;

/*
 * QUESTÃO 65: O GRAVADOR DE VÍDEO
 * * * CENÁRIO:
 * Vamos criar o sistema que controla o tempo de gravação de um vídeo no celular.
 * Todo vídeo começa com o tempo zerado (0 segundos).
 * * * REQUISITOS DA CLASSE (GravadorVideo):
 * 1. Crie a classe 'GravadorVideo' fora da classe principal.
 * 2. Atributos PRIVADOS: 'resolucao' (String - ex: "1080p") e 'segundosGravados' (Integer).
 * 3. Crie o construtor para receber APENAS a 'resolucao'. Dentro dele, defina
 * que o 'this.segundosGravados' começa valendo 0 direto.
 * 4. Crie os GETTERS para ambos os atributos (apenas return!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'gravar':
 * public void gravar(Integer tempo) -> Deve SOMAR o tempo aos 'segundosGravados'.
 */
class GravadorVideo {
    private String resolucao;
    private Integer segundosGravados;

    // construtor
    public GravadorVideo(String resolucao) {
        this.resolucao = resolucao;
        this.segundosGravados = 0;
    }

    // getters
    public String getResolucao() {
        return this.resolucao;
    }

    public Integer getSegundosGravados() {
        return this.segundosGravados;
    }

    // methods
    public void gravar(Integer tempo) {
        this.segundosGravados = this.segundosGravados + tempo;
    }
}

/*
 * REQUISITOS DO MAIN (poo15):
 * 1. Peça para o usuário digitar a resolução (ex: "4K").
 * 2. Crie o objeto 'GravadorVideo' passando apenas a resolução.
 * 3. Mostre o tempo inicial usando o GETTER para provar que começou com 0
 * segundos.
 * 4. Peça para o usuário digitar quantos segundos ele gravou agora.
 * 5. Chame o método 'gravar' passando esse valor.
 * 6. Exiba o tempo final de gravação usando o GETTER.
 */
public class poo15 {
    public static void main(String[] arg) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite a resolucao desejada");
            String resolucao = input.nextLine();
            GravadorVideo g = new GravadorVideo(resolucao);

            System.out.println("A resolucao escolhida foi: " + g.getResolucao() + " e o video sera gravado durante "
                    + g.getSegundosGravados());

            System.out.println("Quntos segundos ira durar a gravacao");
            Integer segundosGravados = input.nextInt();

            g.gravar(segundosGravados);

            System.out.println("A resolucao escolhida foi: " + g.getResolucao() + " e o video sera gravado durante "
                    + g.getSegundosGravados() + " Segundos");

        }
    }
}
