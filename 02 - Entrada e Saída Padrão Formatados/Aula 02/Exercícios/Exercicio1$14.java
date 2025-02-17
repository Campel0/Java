import java.util.Scanner;

public class Exercicio1$14 {

    public static void main(String[] args) {
        
        // double lado = 5.5;
        double lado;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com o lado: " );
        lado = Double.parseDouble( scan.nextLine() );

        double area = lado * lado;
        double perimetro = 4 * lado;

        System.out.printf( "Perimetro = %.2f\n", perimetro );
        System.out.printf( "Area = %.2f", area );

        scan.close();

    }
    
}
