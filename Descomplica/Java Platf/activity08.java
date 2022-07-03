
import java.util.Scanner;

public class ddp{ 
    public static void main(String[] args){

        float num1; 
        float num2; 
        float num3;
        float resultSum; 
        float resultMedian; 

        Scanner read = new Scanner(System.in); 
        System.out.printf("Inform the first number: \n");
        num1 = read.nextInt(); 
        System.out.println("Inform the second number: \n");
        num2 = read.nextInt(); 
        System.out.println("Inform the thirth number: \n");
        num3 = read.nextInt();

        resultSum = num1 + num2 + num3; 
        resultMedian = resultSum/3;

        System.out.println("Os numeros sao: "); 




     }


}
