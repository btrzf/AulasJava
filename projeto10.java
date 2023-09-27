import java.util.Scanner;

public class projeto10{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        int count1 = 0;
        int count2 = 0;
        
        System.out.println("Digite a quantidade de funcionarios na empresa");
        int quantFuncionarios= in.nextInt();
        
        for (int i=0; i<quantFuncionarios; i++) {
        
            System.out.println("Digite o nome do funcionario");
            String nomeFuncionario = in.next(); 
            in.nextLine();
        
            System.out.println("Digite seu tempo de serviço em meses");
            int tempoServico = in.nextInt();
            
            if (tempoServico > 12){
                System.out.println(nomeFuncionario + " tem direito a ferias");
                count1 ++;
            } else {
                System.out.println(nomeFuncionario + " nao tem direito a ferias");
                count2 ++;
            }
        }
        
        System.out.println("********Relacao funcionarios/ferias***********");
        System.out.println("A quantidade de funcionarios que possuem direito a ferias: " + count1);
        System.out.println("A quantidade de funcionarios que nao possuem direito a ferias: " + count2);
        
    }
}