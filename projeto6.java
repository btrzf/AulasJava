import java.util.Scanner;

    public class projeto6 {
        public static void main(String args []) {
            Scanner in = new Scanner(System.in); 
            
            String nomeMaisNova = "o";
            int idadeMaisNova = 200;
        
            for (int i=1; i <=10; i++) {
                System.out.println("Digite seu nome");
                String nome = in.next(); in.nextLine();
                
                System.out.println("Digite sua idade");
                int idade = in.nextInt();
                
                if (idade < idadeMaisNova) {
                    nomeMaisNova = nome;
                    idadeMaisNova = idade ;
                }
            }
            
            System.out.println("O nome da pessoa mais nova é: " + nomeMaisNova + " a sua idade é: " + idadeMaisNova);
        }
    }