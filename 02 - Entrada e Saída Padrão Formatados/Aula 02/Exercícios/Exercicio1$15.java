import java.util.Scanner;

public class Exercicio1$15 {
    
    public static void main(String[] args) {
        
        // double ladoRetangulo = 5.5;
        // double alturaRetangulo = 9.5;
        double ladoRetangulo;
        double alturaRetangulo;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o lado do retangulo: " );
        ladoRetangulo = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com a altura do retangulo: " );
        alturaRetangulo = Double.parseDouble( scan.nextLine() );

        double perimetroRetangulo = ( 2 * ladoRetangulo ) + ( 2 * alturaRetangulo );
        double areaRetangulo = ladoRetangulo * alturaRetangulo;

        System.out.printf( "Perimetro = %.2f\n", perimetroRetangulo );
        System.out.printf( "Area = %.2f", areaRetangulo );

        scan.close();

    }

}
