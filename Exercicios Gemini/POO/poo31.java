package POO;

/* QUESTÃO 79.4: ESTAÇÃO DE RECARGA ELÉTRICA
 * * * CENÁRIO:
 * Uma estação de recarga possui uma quantidade de energia disponível em kWh.
 * Um carro elétrico possui uma bateria com uma carga atual e uma capacidade máxima.
 * A estação deve transferir a energia para o carro, respeitando os limites de ambos.
 * * * REQUISITOS DA CLASSE 1 (CarroEletrico):
 * 1. Atributos PRIVADOS: 'modelo' (String), 'cargaAtual' (Double), 'capacidadeMaxima' (Double).
 * 2. Construtor para receber os três atributos.
 * 3. GETTERS para todos eles.
*  4. SETTER apenas para a 'cargaAtual' (você vai precisar dele para alterar a carga do carro de fora da classe!).
*/
class CarroEletrico {
    private String modelo;
    private Double cargaAtual;
    private Double capacidadeMaxima;
    
    public CarroEletrico(String modelo, Double cargaAtual, Double capacidadeMaxima){
        this.modelo = modelo;
        this.cargaAtual = cargaAtual;
        this.capacidadeMaxima = capacidadeMaxima;
    }
    public String getModelo(){ return this.modelo; }
    public Double getCargaAtual(){ return this.cargaAtual; }
    public Double getCapacidadeMaxima() { return this.capacidadeMaxima ;}

    public void setCargaAtual(Double cargaAtual){ this.cargaAtual = cargaAtual;}
}
/* REQUISITOS DA CLASSE 2 (EstacaoRecarga):
 * 1. Atributos PRIVADOS: 'nomePosto' (String) e 'energiaDisponivelKwh' (Double).
 * 2. Construtor para receber ambos os atributos.
 * 3. GETTERS padrão para ambos.
 * 4. MÉTODO DE NEGÓCIO 'carregarCarro' (void):
 * public void carregarCarro(CarroEletrico carro, Double quantidadeKwh) {
 * - REGRA 1: Se a quantidadeKwh pedida for maior do que a estação tem disponível, barra o carregamento com aviso de falta de energia no posto.
 * - REGRA 2: Se o carro já estiver com a carga atual igual ou maior que a capacidade máxima, barra o carregamento
 *  avisando que a bateria já está cheia.
 * - REGRA 3 (Sucesso): Se passar nas validações, subtraia a energia da estação e some a energia na carga atual 
 * do carro (use o setter do carro aqui!).
 * Atenção: Se a nova carga ultrapassar a capacidade máxima do carro, limite a carga atual do carro ao seu máximo.
 * Exiba uma mensagem de sucesso informando o modelo do carro e quanta energia a estação tem agora.
*/
class EstacaoRecarga {
    private String nomePosto;
    private Double energiaDisponivelKwh;

    public EstacaoRecarga(String nomePosto, Double energiaDisponivelKwh){
        this.nomePosto = nomePosto;
        this.energiaDisponivelKwh = energiaDisponivelKwh;
    }
    public String getNomePosto(){ return this.nomePosto; }
    public Double getEnergiaDisponivelKwh(){ return this.energiaDisponivelKwh; }

    public void carregarCarro(CarroEletrico carro, Double quantidadeKwh){
        // Regra 1: Posto tem energia?
        if (quantidadeKwh > this.energiaDisponivelKwh){
            System.out.println("Falta de energia no posto");
            
        // Regra 2: O carro já está cheio? (Corrigido!)
        } else if (carro.getCargaAtual() >= carro.getCapacidadeMaxima()){
            System.out.println("A bateria já está cheia");
            
        // Regra 3: Sucesso!
        } else {
            this.energiaDisponivelKwh = this.energiaDisponivelKwh - quantidadeKwh;
            Double novaCarga = carro.getCargaAtual() + quantidadeKwh;
            
            // Se passar do limite, a gente poda o excesso
            if (novaCarga > carro.getCapacidadeMaxima()){
                novaCarga = carro.getCapacidadeMaxima();
            }

            // INDEPENDENTE de ter estourado ou não o limite, atualiza o carro e avisa!
            carro.setCargaAtual(novaCarga);
            System.out.println("Recarga feita com sucesso no " + carro.getModelo());
        }
    }
}


/* REQUISITOS DO MAIN (poo29_4):
 * 1. Crie um CarroEletrico: "Model Y", Carga Atual: 20.0, Capacidade Máxima: 75.0.
 * 2. Crie uma EstacaoRecarga: "EletroPosto Central", Energia Disponível: 100.0.
 * 3. No main, faça a estação tentar carregar o carro passando 40.0 kWh.
 * 4. No main, faça a estação tentar carregar o mesmo carro passando mais 30.0 kWh (veja a Regra 3 agir para não estourar o limite da bateria!).
 * 5. Imprima o status final da estação e do carro usando os getters.
 */
public class poo31 {
    public static void main(String[] arg){
        CarroEletrico carro = new CarroEletrico("Model Y", 20.0, 75.0);
        EstacaoRecarga posto = new EstacaoRecarga("EletroPosto", 100.0);

        posto.carregarCarro(carro, 40.0);
        posto.carregarCarro(carro, 30.0);

        System.out.println("O carro agora está com " + carro.getCargaAtual());
        System.out.println("A estação está com " + posto.getEnergiaDisponivelKwh());

    }    
}
