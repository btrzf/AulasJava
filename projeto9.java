import java.util.Scanner;

public class projeto9{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de animais da loja");
        int quantAnimais = in.nextInt();
        
        int count1 = 0;
        int count2= 0;
        
        for (int i=0; i<quantAnimais; i++) {
            System.out.println("Digite 1 para gato ou digite 2 para cachorro");
            int tipoAnimal = in.nextInt(); 
        
            if (tipoAnimal == 1){
                count2 ++;
            } else if (tipoAnimal == 2){
                count1 ++;
            } else {
                System.out.println("Opçao invalida");
            }
        }
        
        System.out.println("********Relacao de gatos e cachorros da loja***********");
        System.out.println("A quantidade de cachorros: " + count1);
        System.out.println("A quantidade de gatos: " + count2);
        
    }
    }
