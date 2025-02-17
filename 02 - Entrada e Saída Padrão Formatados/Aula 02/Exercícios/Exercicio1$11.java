import java.util.Scanner;

public class Exercicio1$11 {
    
    public static void main(String[] args) {
        
        // int diagonalMaior = 12;
        // int diagonalMenor = 6;
        int diagonalMaior;
        int diagonalMenor;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com a diagonal maior: " );
        diagonalMaior = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com a diagonal menor: " );
        diagonalMenor = Integer.parseInt( scan.nextLine() );

        int area = ( diagonalMaior * diagonalMenor ) / 2;

        System.out.printf( "Area = %d", area );

        scan.close();

    }

}
