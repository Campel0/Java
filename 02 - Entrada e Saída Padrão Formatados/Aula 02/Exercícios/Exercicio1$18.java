import java.util.Scanner;

public class Exercicio1$18 {

    public static void main(String[] args) {
        
        // double diagonalMaior = 12.25;
        // double diagonalMenor = 6.6;
        double diagonalMaior;
        double diagonalMenor;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com a diagonal maior: " );
        diagonalMaior = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a diagonal menor: " );
        diagonalMenor = Double.parseDouble( scan.nextLine() );

        double area = ( diagonalMaior * diagonalMenor ) / 2;

        System.out.printf( "Area = %.2f", area );

        scan.close();

    }
    
}
