package POO;

/*
 * QUESTÃO 79.5: STREAMING DE VÍDEO
 * * * CENÁRIO:
 * Um usuário possui um nome e o tipo de sua assinatura ("FREE" ou "PREMIUM").
 * Um filme possui um título e uma flag dizendo se ele é exclusivo para assinantes Premium.
 * O filme deve analisar o usuário e decidir se libera ou não o acesso.
 * * * REQUISITOS DA CLASSE 1 (UsuarioStreaming):
 * 1. Atributos PRIVADOS: 'nome' (String) e 'tipoAssinatura' (String).
 * 2. Construtor para receber ambos os atributos.
 * 3. GETTERS para ambos.
 * * * REQUISITOS DA CLASSE 2 (Filme):
 * 1. Atributos PRIVADOS: 'titulo' (String) e 'ehPremium' (boolean).
 * 2. Construtor para receber ambos.
 * 3. GETTERS para ambos.
 */
class UsuarioStreaming {

    private final String nome;
    private final String tipoAssinatura;

    public UsuarioStreaming(String nome, String tipoAssinatura) {
        this.nome = nome;
        this.tipoAssinatura = tipoAssinatura;
    }

    public String getNome() {
        return this.nome;
    }

    public String getTipoAssinatura() {
        return this.tipoAssinatura;
    }
}
class Filme {

    private final String titulo;
    private final boolean ehPremium;

    public Filme(String titulo, boolean ehPremium) {
        this.titulo = titulo;
        this.ehPremium = ehPremium;
    }
    public String getTitulo() {
        return this.titulo;
    }
    public Boolean getEhPremium() {
        return this.ehPremium;
    }
    /*
 * 4. MÉTODO DE NEGÓCIO 'autorizarAcesso' (ATENÇÃO: ele deve retornar um boolean!):
 * public boolean autorizarAcesso(UsuarioStreaming usuario) {
 * - REGRA 1: Se o filme NÃO for premium ('this.ehPremium == false'), qualquer um pode ver. 
 * Mostre: "Acesso liberado para [usuario.getNome()]: O filme [this.titulo] é grátis!"
 * e retorne 'true'.
 * - REGRA 2: Se o filme FOR premium, você deve checar a assinatura do usuário.
 * Se o 'tipoAssinatura' do usuário for igual a "PREMIUM" (Dica: use .equals("PREMIUM")),
 * Mostre: "Acesso PREMIUM autorizado para [usuario.getNome()] para assistir [this.titulo]."
 * e retorne 'true'.
 * - REGRA 3 (Bloqueio): Caso contrário, mostre: "Erro: O filme [this.titulo] é exclusivo para assinantes PREMIUM. [usuario.getNome()] precisa fazer um upgrade!"
 * e retorne 'false'. */
    public boolean autorizarAcesso(UsuarioStreaming usuario) {
        if (this.ehPremium == false) {
            System.out.println("Acesso liberado para " + usuario.getNome() + " o filme " + this.titulo + " e gratis ");
            return true;
        } else if (usuario.getTipoAssinatura().equals("PREMIUM")) {
            System.out.println("Acesso PREMIUM autorizado para " + usuario.getNome() + " para assistir " + this.titulo);
            return true;
        } else {
            System.out.println("ERRO: O " + this.titulo + "é exclusivo para assinantes PREMIUM" + usuario.getNome() + ", com isso é necessario fazer um upgrade");
            return false;
        }
    }
}
    /* REQUISITOS DO MAIN (poo29_5):
 * 1. Crie o Usuário 1: "Carlos", Assinatura: "FREE".
 * 2. Crie o Usuário 2: "Ana", Assinatura: "PREMIUM".
 * 3. Crie o Filme 1: "Documentário Espacial", Premium: false.
 * 4. Crie o Filme 2: "Vingadores 5", Premium: true.
 * 5. Teste os acessos no main:
 * - Faça o Carlos tentar assistir ao Filme 1.
 * - Faça o Carlos tentar assistir ao Filme 2.
 * - Faça a Ana tentar assistir ao Filme 2.
     */
    public class poo32 {

        public static void main(String[] arg) {
            UsuarioStreaming Carlos = new UsuarioStreaming("Carlos", "FREE");
            UsuarioStreaming Ana = new UsuarioStreaming("Ana", "PREMIUM");

            Filme Filme1 = new Filme("Documentario Espacial", false);
            Filme Filme2 = new Filme("Vingadores 5", true);

            Filme1.autorizarAcesso(Carlos);
            Filme2.autorizarAcesso(Carlos);
            Filme2.autorizarAcesso(Ana);
        }
    }