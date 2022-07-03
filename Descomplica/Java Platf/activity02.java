import java.util.Scanner;

public class atividade5 {
    
    public static void main(String[] args){
        int num1, num2; 

        Scanner read = new Scanner(System.in);
        System.out.printf("Escreva um numero: \n"); 
        num1 = read.nextInt(); 
        System.out.printf("Escreva um numero: \n"); 
        num2 = read.nextInt(); 

        if(num1 > num2){ 
            System.out.printf("O primeiro numero e maior \n"); 
        }else{ 
            System.out.printf("O segundo numero e maior \n"); 
        }

    }

}
