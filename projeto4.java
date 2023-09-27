import java.util.Scanner;

    public class projeto4 {
        public static void main(String args []) {
            Scanner in = new Scanner(System.in); 
            
            System.out.println("Digite o primeiro número");
            double numero1 = in.nextDouble();
            
            System.out.println("Digite o segundo número");
            double numero2 = in.nextDouble();
            
            System.out.println("*********Calculadora*********");
            System.out.println("Digite [1] para somar os números");
            System.out.println("Digite [2] para subtrair os números");
            System.out.println("Digite [3] para multiplicar os números");
            System.out.println("Digite [4] para dividir os números");
            
            int operacoes = in.nextInt(); 
            
            double soma = (numero1 + numero2);
            double subtracao = (numero1 - numero2);
            double multiplicacao = (numero1 * numero2);
            double divisao = (numero1 / numero2);
        
            switch (operacoes) {
                
                case 1:
                    System.out.println("O resultado da soma entre os números é: " + soma);
                break;
                
                case 2:
                    System.out.println("O resultado da subtracao entre os números é: " + subtracao);
                break;
                
                case 3:
                    System.out.println("O resultado da multiplicação entre os números é: " + multiplicacao);
                break;
                
                case 4:
                    System.out.println("O resultado da divisão entre os números é: " + divisao);
                break;
                
                default:
                     System.out.println("Opção inválida");
                
            }
        }
    }