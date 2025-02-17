import java.util.Scanner;

public class Exercicio1$16 {

    public static void main(String[] args) {
        
        // double baseTriangulo = 10.5;
        // double alturaTriangulo = 5.75;
        double baseTriangulo;
        double alturaTriangulo;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com a base do triangulo: " );
        baseTriangulo = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a altura do triangulo: " );
        alturaTriangulo = Double.parseDouble( scan.nextLine() );

        double areaTriangulo = ( baseTriangulo * alturaTriangulo ) / 2.0;

        System.out.printf( "Area = %.2f", areaTriangulo );

        scan.close();

    }

}
