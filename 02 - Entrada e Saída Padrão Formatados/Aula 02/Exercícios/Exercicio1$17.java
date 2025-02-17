import java.util.Scanner;

public class Exercicio1$17 {

    public static void main(String[] args) {
        
        // double baseMaior = 10.5;
        // double baseMenor = 6.25;
        // double altura = 6.75;
        double baseMaior;
        double baseMenor;
        double altura;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com a base maior: " );
        baseMaior = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a base menor: " );
        baseMenor = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a altura: " );
        altura = Double.parseDouble( scan.nextLine() );

        double areaTrapezio = ( ( baseMaior + baseMenor ) * altura ) / 2.0;

        System.out.printf( "Area = %.2f", areaTrapezio );

        scan.close();

    }
    
}
