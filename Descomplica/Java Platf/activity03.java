import java.util.Scanner;

public class atividade6{
    
    public static void main(String[] args){ 

        Scanner inputed = new Scanner(System.in); 
        int OP; 
        float num = 0, result; 

        System.out.println("Opcoes:"); 
        System.out.println("1 - Calcular o sobro do numero"); 
        System.out.println("2 - Calcular o triplo do numero"); 
        System.out.println("Escolha uma opcao: ");
        OP = inputed.nextInt(); 
        System.out.println("Digite um numero: "); 
        num = inputed.nextFloat(); 

        switch(OP){ 
            case 1: 
                result = num * 2;
                System.out.println("Dobro" + result);
                break; 
            
            case 2: 
                result = num * 3; 
                System.out.println("Triplo: " + result);
                break; 

        }

    }

}
