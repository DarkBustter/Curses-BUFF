import java.util.Scanner; 

public class ativiadade09 {
    public static void  main(String[] args){ 

        Scanner read = new Scanner(System.in); 
        int i; 
        int sum; 
        int num; 

        sum = 0; 
        i = 1; 

        while(i < 5){ 
            System.out.println("Write the number of type to the sum: "); 
            num = read.nextInt();
            sum = sum + num;
            i = i + 1;  
        }
        System.out.printf("Result of the sum: ", sum) ;

    }
}
