import java.util.Scanner;

public class Exercicio1$9 {
    
    public static void main(String[] args) {
        
        // int baseTriangulo = 10;
        // int alturaTriangulo = 5;
        int baseTriangulo;
        int alturaTriangulo;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre a base do triangulo: " );
        baseTriangulo = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com a altura do triangulo: " );
        alturaTriangulo = Integer.parseInt( scan.nextLine() );
        
        int areaTriangulo = ( baseTriangulo * alturaTriangulo ) / 2;

        System.out.printf( "Area = %d", areaTriangulo );

        scan.close();

    }

}
