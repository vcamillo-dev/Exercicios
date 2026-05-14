/*
 * QUESTÃO 36: SISTEMA DE LOGIN SIMPLIFICADO
 * * 1. Crie um ArrayList<String> chamado "usuarios" e adicione:
 * "admin", "gerente", "vendedor".
 * * 2. Crie um ArrayList<String> chamado "senhas" e adicione:
 * "123", "456", "789" (na mesma ordem dos usuários).
 * * 3. Peça para o usuário digitar o seu NOME de usuário.
 * * 4. Use um loop FOR para encontrar o índice desse usuário.
 * * 5. SE o usuário existir:
 * - Peça para ele digitar a SENHA.
 * - Verifique se a senha digitada é igual à senha que está no mesmo índice 
 * na lista de "senhas".
 * - Se for igual, exiba: "Acesso Permitido!".
 * - Se for diferente, exiba: "Senha Incorreta!".
 * * 6. SENÃO (se o usuário não existir):
 * - Exiba "Usuário não encontrado!".
 */
import java.util.Scanner;
import java.util.ArrayList;

public class Exercicio36 {
    public static void main(String[] arg){
    try (Scanner input = new Scanner(System.in)) {

    ArrayList<String> usuarios = new ArrayList<>();

    usuarios.add("admin");
    usuarios.add("gerente");
    usuarios.add("vendedor");

    ArrayList<String> senhas = new ArrayList<>();

    senhas.add("123");
    senhas.add("456");
    senhas.add("789");

    boolean continuarPedindo = true;

    while (continuarPedindo) {
        System.out.println("Digite Seu cargo na empresa");
        String cargo = input.nextLine();

    int cargo_encontrado = -1;

    for (int i = 0; i <usuarios.size(); i++){
        if ( usuarios.get(i).equalsIgnoreCase(cargo) ){
            cargo_encontrado = i;
            break;
        }
    }

    if ( cargo_encontrado !=-1 ) {
        System.out.println("Insira a senha para o cargo escolhido");
        String senha_digitada = input.nextLine();
        if ( senha_digitada.equals(senhas.get(cargo_encontrado)) ){
            System.out.println("Acesso Permitido");
        } else {
            System.out.println("Senha incorreta");
        }


    }

    }

    }
}

}
