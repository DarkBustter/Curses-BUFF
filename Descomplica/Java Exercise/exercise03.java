import java.util.Scanner;

public class entraESaida{ 
    
    
    public static void main(String[] args){ 
        
        float num1 = 0; 
        float num2 = 0; 
        float num3 = 0; 
        float resultSum; 
        float resultMedian; 
            
            
        Scanner read = new Scanner(System.in); 
        System.out.printf("Inform the first number : \n"); 
        num1 = read.nextInt(); 
        System.out.printf("Inform the first number : \n"); 
        num2 = read.nextInt(); 
        System.out.printf("Inform the first number : \n"); 
        num3 = read.nextInt(); 
        
        resultSum = num1 + num2 + num3;
        resultMedian = resultSum/3;
        
        System.out.println("Os numeros sao: "); 
        System.out.println("Primeiro: "); 
        System.out.println(num1);
        System.out.println("Segundo: "); 
        System.out.println(num2); 
        System.out.println("Terceiro: ");
        System.out.println(num3); 
        System.out.println("Resultado da Soma: ");
        System.out.println(resultSum); 
        System.out.println("Resultado da Media: ");
        System.out.println(resultMedian); 
         

    }
    
    
}
