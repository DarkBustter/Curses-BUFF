import java.util.Scanner;

public class atividade11{
    
    public static void main(String[] args){ 
        int multi = 1; 
        int i = 1; 
        int num = 0; 

        Scanner read = new Scanner(System.in); 

        do{ 
            System.out.println("Write a number of the type interger to multiplication: "); 
            num = read.nextInt(); 
            multi = multi * num; 
            i = i + 1;

        }while(i <= 5);
        System.out.printf("Result of the multiplication"); 
        System.out.println(multi); 

    }




}
