import java.util.Scanner;

public class Exercicio1$10 {
    
    public static void main(String[] args) {
        
        // int baseMaior = 10;
        // int baseMenor = 6;
        // int altura = 5;
        int baseMaior;
        int baseMenor;
        int altura;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com a base maior: " );
        baseMaior = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com a base menor: " );
        baseMenor = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com a altura: " );
        altura = Integer.parseInt( scan.nextLine() );

        int areaTrapezio = ( ( baseMaior + baseMenor ) * altura ) / 2;

        System.out.printf( "Area = %d", areaTrapezio );

        scan.close();

    }

}
