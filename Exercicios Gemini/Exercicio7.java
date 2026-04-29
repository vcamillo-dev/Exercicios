// Exiba apenas os números pares entre 1 e 10.
// Saída esperada:
// 2
// 4
// 6
// 8
// 10

public class Exercicio7 {
    public static void main(String[] args){
        for(int i = 1 ; i < 11 ; i=i+1)
            if(i % 2 == 0)
                System.out.println(i);

    }
    
}
