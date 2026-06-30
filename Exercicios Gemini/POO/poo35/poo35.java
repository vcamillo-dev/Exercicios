package POO;

/*QUESTÃO 79.8: ALUGUEL DE PATINETE ELETRÔNICO
 * * * CENÁRIO:
 * Um usuário possui um nome e o saldo de créditos no aplicativo.
 * Um patinete possui um código de identificação e o valor do aluguel por minuto.
 * O patinete deve processar uma viagem realizada pelo usuário, calcular o custo, cobrar do saldo e liberar ou não a viagem.
REQUISITOS DA CLASSE 1 (UsuarioPatinete):
 * 1. Atributos Privados:
 * - nome (Tipo: String)
 * - saldoCreditos (Tipo: Double)
 * 2. Construtor: Recebe ambos os atributos por parâmetro.
 * 3. Encapsulamento: Getters e Setters completos para ambos.*/
class UsuarioPatinete {

    private String nome;
    private Double saldoCreditos;

    public UsuarioPatinete(String nome, Double saldoCreditos) {
        this.nome = nome;
        this.saldoCreditos = saldoCreditos;
    }

    public String getNome() {
        return this.nome;
    }

    public Double getSaldoCreditos() {
        return this.saldoCreditos;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSaldoCreditos(Double saldoCreditos) {
        this.saldoCreditos = saldoCreditos;
    }
}

/*REQUISITOS DA CLASSE 2 (Patinete):
 * 1. Atributos Privados:
 * - codigo (Tipo: String)
 * - valorPorMinuto (Tipo: Double)
 * 2. Construtor: Recebe ambos os atributos por parâmetro.
 * 3. Encapsulamento: Getters para todos. Não crie Setters aqui.
 * 4. Método de Negócio (finalizarViagem):
 * - Tipo de retorno do método: void
 * 
 * - Parâmetros que o método recebe: Um objeto da classe UsuarioPatinete E os minutosUtilizados (Tipo: Integer).
 * - Lógica: Calcule o custo total da viagem (minutosUtilizados multiplicado pelo valorPorMinuto).
 * - Regra 1: Se o saldoCreditos do usuário for menor que o custo total, exiba mensagem de erro dizendo que o saldo 
 * é insuficiente e a viagem foi bloqueada.
 * - Regra 2: Se o usuário tiver saldo suficiente, desconte o custo total do saldo dele e exiba uma mensagem de 
 * sucesso mostrando o código do patinete, o custo da corrida e o nome do usuário.*/
class Patinete {

    private String codigo;
    private Double valorPorMinuto;

    public Patinete(String codigo, Double valorPorMinuto) {
        this.codigo = codigo;
        this.valorPorMinuto = valorPorMinuto;
    }

    public String getCodigo() {
        return this.codigo;
    }

    public Double getValorPorMinuto() {
        return this.valorPorMinuto;
    }

    public void finalizarViagem(UsuarioPatinete usuario, Integer minutosUtilizados) {
        Double CustoTotal = minutosUtilizados * this.valorPorMinuto;

        if (usuario.getSaldoCreditos() < CustoTotal) {
            System.out.println("Saldo insuficiente. Viagem bloqueada.");
        } else {
            usuario.setSaldoCreditos(usuario.getSaldoCreditos() - CustoTotal);
            System.out.println("O patinete: " + this.codigo + " foi liberado para: " + usuario.getNome() + " no valor de: R$" + CustoTotal);
        }
    }
}
/*REQUISITOS DO MAIN (poo35):
 * 1. Instancie o Usuário: "Amanda", Saldo Inicial: 15.00.
 * 2. Instancie o Patinete: Código "PAT-99", Valor por Minuto: 0.50.
 * 3. No main, faça a Amanda realizar uma viagem de 40 minutos nesse patinete (isso deve estourar o saldo dela).
 * 4. No main, faça a Amanda realizar uma viagem curta de 10 minutos no mesmo patinete (isso deve ser aprovado).
 * 5. Exiba na tela o saldo final da Amanda após as tentativas usando os métodos corretos.
 */
public class poo35 {

    public static void main(String[] args) {
        UsuarioPatinete Amanda = new UsuarioPatinete("Amanda", 15.00);
        Patinete pat_99 = new Patinete("PAT-99", 0.50);

        pat_99.finalizarViagem(Amanda, 40);
    }
}
