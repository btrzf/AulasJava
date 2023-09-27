import java.util.Scanner;

public class projeto12{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int count = 0;
        for (int i=0; i < 20; i++) {
            System.out.println("Digite um numero");
            double numero = in.nextDouble();
        
            if (numero > 8) {
                count++;
            }
        }
        System.out.println("A quantidade de numeros maiores que 8 foi: " + count);
        
        //Escreva um algoritmo que leia 20 números do usuário e exiba quantos números são maiores do que 8. 
    }
}