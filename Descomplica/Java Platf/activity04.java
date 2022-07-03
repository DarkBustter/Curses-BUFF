import java.util.Scanner; 

public class atividade10{ 

    public static void main(String[] args){ 

        int multi = 1;
        int i, num = 0; 

        Scanner read = new Scanner(System.in); 

        for(i = 0; i < 6; i++){ 
            System.out.println("Write a number of the type interger to multiplication: "); 
            num = read.nextInt(); 
            multi = multi + num; 

        }
        System.out.print("Resut of the multiplication "); 
        System.out.println(multi); 
    }


}
