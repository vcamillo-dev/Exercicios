package POO;
import java.util.ArrayList;
import java.util.Scanner;

// 1. ESTE É O NOSSO MOLDE (A CLASSE)
class Candidato {
    String nome;
    double nota;

    // Construtor: serve para criar o candidato passando o nome e nota direto
    public Candidato(String nome, double nota) {
        this.nome = nome;
        this.nota = nota;
    }
}

public class poo1 {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {
            
            // 2. AGORA TEMOS UMA ÚNICA LISTA QUE GUARDA OBJETOS "CANDIDATO"
            ArrayList<Candidato> listaCandidatos = new ArrayList<>();

            int contador = 0;

            while ( contador < 2 ) {
                System.out.println("Insira o nome do cadidato");
                String nome = input.nextLine();
                
                System.out.println("Insira a nota do cadidato");
                String nota_texto = input.nextLine();
                Double nota_numero = Double.parseDouble(nota_texto);

                Candidato novoCandidato = new Candidato(nome, nota_numero);
                listaCandidatos.add(novoCandidato);
                
                contador ++;

            }

            for ( int i = 0; i < listaCandidatos.size(); i ++){
                System.out.println("Nome: " + listaCandidatos.get(i).nome);
                System.out.println("Nota: " + listaCandidatos.get(i).nota);
                
            }

            // REQUISITOS DO SEU PROGRAMA:
            // * 1. Crie um loop WHILE que rode exatamente 2 vezes.
            // * 2. Dentro do loop, peça o nome e a nota do candidato.
            // * 3. Para salvar na lista, você vai criar o objeto e adicioná-lo assim:
            //      Candidato c = new Candidato(nomeDigitado, notaDigitada);
            //      listaCandidatos.add(c);
            //
            // * 4. Fora do while, use um loop FOR normal para percorrer a lista.
            // * 5. Dentro do FOR, para exibir os dados de cada um, você fará:
            //      System.out.println("Nome: " + listaCandidatos.get(i).nome);
            //      System.out.println("Nota: " + listaCandidatos.get(i).nota);

        }
    }
}