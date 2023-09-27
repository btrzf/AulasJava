import java.util.Scanner;

public class projeto8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        
        System.out.println("*****Calculadora de media*****");

        double notaGeo1,notaGeo2, notaGeo3;
        double notaMat1, notaMat2,notaMat3;
        double socioNota1, socioNota2, socioNota3;
        double notaQui1, notaQui2, notaQui3;
        double notaHis1, notaHis2, notaHis3, notaHis4;
        
        double mediaGeo, mediaMat, mediaSocio, mediaQui, mediaFis;
        
        for(int i=0;i<4;i++){        
        System.out.print ("Digite a primeira nota de geografia: ");
        notaGeo1 = in.nextDouble();
        
        System.out.print ("Digite a segunda nota de geografia: ");
        notaGeo2 = in.nextDouble();
        
        System.out.print ("Digite a terceira nota de geografia: ");
        notaGeo3= in.nextDouble();
        
        mediaGeo = (notaGeo1 + notaGeo2 + notaGeo3)/3;
        
            if(mediaGeo>=7 && mediaGeo<=10){
                System.out.println ("Aluno aprovado");
                System.out.println("Sua media foi de: " + mediaGeo);
            }else{
                System.out.println ("Aluno reprovado");
                System.out.println("Sua media foi de: " + mediaGeo);
        }
        
        System.out.println("**********************************");
        
        System.out.print ("Digite a primeira nota de matemática: ");
        notaMat1 = in.nextDouble();
        
        System.out.print ("Digite a segunda nota de matemática: ");
        notaMat2 = in.nextDouble();
        
        System.out.print ("Digite a terceira nota de matemática: ");
        notaMat3 = in.nextDouble();
        
        mediaMat = (notaMat1+notaMat2+notaMat3)/3;
        
            if(mediaMat>=7 && mediaMat<=10){
             System.out.println ("Aluno aprovado");          
             System.out.println("Sua media foi de: " + mediaMat);
            }else{
            System.out.println ("Aluno reprovado");   
            System.out.println("Sua media foi de: " + mediaMat);
        }
    
        System.out.println("**********************************");
        
        System.out.print ("Digite a primeira nota de sociologia: ");
        socioNota1 = in.nextDouble();
        
        System.out.print ("Digite a segunda nota de sociologia: ");
        socioNota2 = in.nextDouble();
        
        System.out.print ("Digite a terceira nota de sociologia: ");
        socioNota3 = in.nextDouble();
        
        mediaSocio = (socioNota1+socioNota2+socioNota3)/3;
        
            if(mediaSocio>=7 && mediaSocio<=10){
            System.out.println ("Aluno aprovado");  
            System.out.println("Sua media foi de: " + mediaSocio);
            }else{
            System.out.println ("Aluno aprovado");  
            System.out.println("Sua media foi de: " + mediaSocio);
        }
        
        System.out.println("**********************************");
        
        System.out.print ("Digite a primeira nota de química: ");
        notaQui1 = in.nextDouble();
        
        System.out.print ("Digite a segunda nota de química: ");
        notaQui2 = in.nextDouble();
        
        System.out.print ("Digite a terceira nota de química: ");
        notaQui3 = in.nextDouble();
        
        mediaQui = (notaQui1+notaQui2+notaQui3)/3;
        
            if(mediaQui>=7 && mediaQui<=10){
              System.out.println ("Aluno aprovado");  
              System.out.println("Sua media foi de: " + mediaQui);
            }else{
                System.out.println ("Aluno reprovado");  
                System.out.println("Sua media foi de: " + mediaQui);
        }
         
        System.out.println("**********************************");
        
        System.out.print ("Digite a primeira nota de historia: ");
        notaHis1 = in.nextDouble();
        
        System.out.print ("Digite a segunda nota de historia: ");
        notaHis2 = in.nextDouble();
        
        System.out.print ("Digite a terceira nota de historia: ");
        notaHis3 = in.nextDouble();
        
        mediaFis = (notaHis1+notaHis2+notaHis3)/3;
        
            if(mediaFis>=7 && mediaFis<=10){
            System.out.println ("Aluno aprovado"); 
            System.out.println("Sua media foi de: " + mediaFis);
            }else{
            System.out.println ("Aluno reprovado");  
            System.out.println("Sua media foi de: " + mediaFis);
        }
        System.out.println("**********************************");
}
}
}
    

