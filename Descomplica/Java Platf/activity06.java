import java.util.Scanner; 

public class atividade12 {
    
    public static void main(String[] args){ 

        String[] nomes;
        nomes = new String[5]; 
        double[] notas = new double[5]; 
        double soma = 0, media = 0; 
        int j = 1; 
        
        for(int i = 0; i < 5; i++){ 
            System.out.println("Entre com o nome do aluno(a) n " +(i +1)); 
            nomes[i] = new Scanner(System.in).nextLine();
            System.out.println("Entre com a nota do aluno(a) n " + (i + 1)); 
            notas[i] = new Scanner(System.in).nextDouble();
            soma = soma + notas[i];
            j = j + 1;  

        }
        media = soma/5;

        System.out.println("A media da turma e: " + media);

    }    

}
