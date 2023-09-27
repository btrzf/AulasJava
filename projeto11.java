import java.util.Scanner;

public class projeto11{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        
        for (int i=0; i < 9; i++) {
            System.out.println("Digite um numero");
            int numero = in.nextInt();
            
            if (numero % 2 == 0) {
                count ++;
            }
        }
        System.out.println("A quantidade de numeros pares: " + count);
        
    }
}