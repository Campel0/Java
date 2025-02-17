import java.util.Scanner;

public class Exercicio1$12 {
    
    public static void main(String[] args) {
        
        // double n1 = 153.4671;
        double n1;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com um numero real: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.printf( "%.6f\n", n1 );
        System.out.printf( "%.2f\n", n1 );
        System.out.printf( "%.3f\n", n1 );

        scan.close();

    }

}
