package POO;
import java.util.Scanner;
/*
 * QUESTÃO 64: O TANQUE DE COMBUSTÍVEL
 * * * CENÁRIO:
 * Vamos criar o sistema que controla o combustível no tanque de um carro. 
 * Todo carro sai da concessionária com o tanque completamente VAZIO (0 litros).
 * * * REQUISITOS DA CLASSE (TanqueCarro):
 * 1. Crie a classe 'TanqueCarro' fora da classe principal.
 * 2. Atributos PRIVADOS: 'modelo' (String) e 'litrosAtuais' (Double).
 * 3. Crie o construtor para receber APENAS o 'modelo'. Lá dentro, defina que 
 * o 'this.litrosAtuais' começa valendo 0.0 direto (sem receber do parâmetro).
 * 4. Crie os GETTERS para ambos os atributos (lembre-se: apenas return!).
 * 5. Crie o MÉTODO DE NEGÓCIO 'abastecer':
 * public void abastecer(Double quantidadeLitros) -> Deve SOMAR os litros ao 'litrosAtuais'.
*/
class TanqueCarro {
    private String modelo;
    private Double litrosAtuais;
    
    //construtor
    public TanqueCarro (String modelo){
        this.modelo = modelo;
        this.litrosAtuais = 0.0;
    }
    //getters
    public String getModelo(){
        return this.modelo;
    }
    public Double getLitrosAtuais(){
        return this.litrosAtuais;
    }
    //methods
    public void abastecer(Double quantidadeLitros){
        this.litrosAtuais = this.litrosAtuais + quantidadeLitros;
    }
}
/*REQUISITOS DO MAIN (poo14):
 * 1. Peça para o usuário digitar o modelo do carro (ex: "Fusca") e crie o objeto.
 * 2. Mostre o status inicial do tanque usando o GETTER para provar que ele nasceu com 0.0 litros.
 * 3. Peça para o usuário digitar quantos litros deseja abastecer.
 * 4. Chame o método 'abastecer' passando o valor digitado.
 * 5. Exiba a quantidade de combustível final usando o GETTER
*/
public class poo14{
    public static void main(String[] arg){
        try( Scanner input = new Scanner(System.in)){
            System.out.println("Digite o modelo do carro");
            String modelo = input.nextLine();
            TanqueCarro t = new TanqueCarro(modelo);

            System.out.println("O carro " + t.getModelo() + " Possui "+ t.getLitrosAtuais() + " No tanque no momento");

            System.out.println("Quantos litros você deseja abastecer");
            String litros_texto = input.nextLine();
            Double litros_numero = Double.parseDouble(litros_texto);

            t.abastecer(litros_numero);

            System.out.println("O carro " + t.getModelo()+ " Possui "+ t.getLitrosAtuais() + " no tanque");

        }
    }
}
