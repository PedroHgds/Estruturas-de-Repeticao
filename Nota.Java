import java.util.Scanner;

public class Nota{
    public static void main(String[]args) {
        Scanner scan = new Scanner(System.In);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();
        
        while(noya<0 | nota>10){
            System.out.println("Nota Inválida ! Digite novamente: ");
            nota = scan.NextInt();

        }

        
    }
    
}