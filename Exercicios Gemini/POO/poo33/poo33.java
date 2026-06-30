package POO;
/*
 * QUESTÃO 79.6: SISTEMA DE PEDÁGIO AUTOMÁTICO
 * * * CENÁRIO:
 * Um veículo possui uma identificação de placa e um saldo de dinheiro em sua tag de viagem.
 * Uma cabine de pedágio possui uma tarifa fixa cobrada por eixos e um caixa para acumular o dinheiro arrecadado.
 * O pedágio precisa processar o veículo e decidir se a cancela abre ou permanece fechada.
 * * * REQUISITOS DA CLASSE 1 (Veiculo):
 * 1. Atributos privados: placa, saldoTag.
 * 2. Construtor padrão para os dois atributos.
 * 3. Encapsulamento completo (Getters e Setters necessários).
 */
class Veiculo {
    private String placa;
    private Double saldo;

    public Veiculo(String placa, Double saldo) {
        this.placa = placa;
        this.saldo = saldo;
    }
    public String getPlaca() {
        return this.placa;
    }
    public Double getSaldo() {
        return this.saldo;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }
}
/*REQUISITOS DA CLASSE 2 (CabinePedagio):
 * 1. Atributos privados: tarifaFixa, totalArrecadado.
 * 2. Construtor que recebe apenas a tarifaFixa (o totalArrecadado sempre deve começar em zero).
 * 3. Getters para ambos os atributos.
 * 4. MÉTODO DE NEGÓCIO: Crie um método que processe a passagem do veículo.
 * - Se o veículo não tiver saldo suficiente para pagar a tarifa, exiba uma mensagem de bloqueio e impeça a passagem.
 * - Se o veículo tiver saldo suficiente, desconte a tarifa do saldo dele, mude o total arrecadado da cabine somando o valor recebido e exiba uma mensagem de sucesso com a placa liberada.*/
class CabinePedagio {
    private final Integer tarifaFixa;
    private Double totalArrecadado;

    public CabinePedagio (Integer tarifaFixa){
        this.tarifaFixa = tarifaFixa;
        this.totalArrecadado = 0.0;
    }
    public Integer getTarifaFixa(){
        return this.tarifaFixa;
    }
    public Double getTotalArrecadado(){
        return this.totalArrecadado;
    }
    public void PassagemVeiculo(Veiculo carroPassando){
        if (carroPassando.getSaldo() < this.tarifaFixa){
            System.out.println("Saldo insuficiente. Saldo atual de: " + carroPassando.getSaldo());
        } else {
            carroPassando.setSaldo(carroPassando.getSaldo() - this.tarifaFixa);
            this.totalArrecadado += this.tarifaFixa;
            System.out.println("Veículo " + carroPassando.getPlaca() + " liberado. Tarifa cobrada: " + this.tarifaFixa);
        }
    }
}
/*REQUISITOS DO MAIN (poo29_6):
 * 1. Instancie o Veículo 1: Placa "ABC-1234", Saldo: 15.00.
 * 2. Instancie o Veículo 2: Placa "XYZ-9999", Saldo: 50.00.
 * 3. Instancie a CabinePedagio com uma tarifa de 22.00.
 * 4. Faça o Veículo 1 tentar passar pelo pedágio.
 * 5. Faça o Veículo 2 tentar passar pelo pedágio.
 * 6. Imprima na tela o saldo final de cada veículo e o faturamento total da cabine.
 */
public class poo33 {
    public static void main(String[] arg) {
        Veiculo  Veiculo1 = new Veiculo("ABC-1234",15.00);
        Veiculo  Veiculo2 = new Veiculo("XYZ-456",50.00);

        CabinePedagio pedagio = new CabinePedagio(22);

        pedagio.PassagemVeiculo(Veiculo1);
        pedagio.PassagemVeiculo(Veiculo2);

        System.out.println("O saldo final da cabine ficou em:" + pedagio.getTotalArrecadado() );
        System.out.println("O saldo final do veiculo1 ficou:" + Veiculo1.getSaldo());
        System.out.println("O saldo final do veiculo2 ficou:" + Veiculo2.getSaldo());
    }

}

