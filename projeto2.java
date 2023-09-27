import java.util.Scanner;

    public class projeto2 {
        public static void main(String args []) {
            Scanner in = new Scanner(System.in); 
            
            int i = 0;
            int soma = 0;
            
            do {
                soma += i;
                i++;
            } while (i <= 15);
            System.out.println(soma);
    }
    }


