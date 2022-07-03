
public class atividade14 {
    
    public static void main(String[] args){ 

        int numbers[][] = new int[3][2]; 
        int sum = 1;

        for(int i = 0; i <= 3; i++){ 
            for(int j = 0; j <= 2; j ++){ 
                sum = sum + 2; 
                numbers[j][i] = sum; 
            }
        }
        for(int i = 0; i <= 3; i++){
            for(int j = 0; j <= 2; j++){
                System.out.println("Valores para a linha " + (i + 1) + " e para a coluna " + (j + 1) + ": "); 
                System.out.println(numbers[i][j]);
            }
            System.out.println("Fim da Execucao");

        }
        
    }

}
