import java.util.Scanner;

public class Exercicio1$19 {

    public static void main( String[] args ) {
        
        double pi = 3.141592;
        double raio;
        //double raio = 10.5;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o valor do raio do circulo: " );
        raio = Double.parseDouble( scan.nextLine() );

        double diametro = 2 * raio;
        double circunferencia = 2 * pi * raio;
        double area = pi * ( raio * raio );

        System.out.printf( "Diametro = %.2f\n", diametro );
        System.out.printf( "Circunferencia = %.2f\n", circunferencia );
        System.out.printf( "Area = %.2f", area );

        scan.close();

    }
    
}
