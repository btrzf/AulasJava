import java.util.Scanner;

public class projeto7{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bem vindo ao catalogo de filmes disponiveis no cinema!");
        
        System.out.println("/n Pressione [1] para Barbie, [2] para Narnia, [3] para Harry Potter ou [4] para Besouro Azul");
        int filme = in.nextInt();
        
        switch (filme) {
            case 1: 
                System.out.println("Voce escolheu o filme Barbie, temos quatro sessoes disponiveis: ");
                System.out.println("Sessao: 10h00 am");
                System.out.println("Sessao: 13h00 pm");
                System.out.println("Sessao: 13h00 pm");
                System.out.println("Sessao: 22h00 pm");
            break;
            
            case 2:
                System.out.println("Voce escolheu o filme Narnia, temos cinco sessoes disponiveis: ");
                System.out.println("Sessao: 09h00 am");
                System.out.println("Sessao: 14h10 pm");
                System.out.println("Sessao: 16h45 pm");
                System.out.println("Sessao: 22h00 pm");
            break;
            
            case 3:
                System.out.println("Voce escolheu o filme Harry Potter, temos cinco sessoes disponiveis: ");
                System.out.println("Sessao: 08h10 am");
                System.out.println("Sessao: 10h15 am");
                System.out.println("Sessao: 15h10 pm");
                System.out.println("Sessao: 18h30 pm");
                System.out.println("Sessao: 22h00 pm");
            break;
            
            case 4:
                System.out.println("Voce escolheu o filme Besouro Azul, temos tres sessoes disponiveis: ");
                System.out.println("Sessao: 10h15 am");
                System.out.println("Sessao: 15h10 pm");
                System.out.println("Sessao: 20h00 pm");
            break;
            
            default:
                System.out.println("Opçao invalida!");
        }
        
    }
}


        
       

        
        
        