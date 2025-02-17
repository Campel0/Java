import java.util.Scanner;

public class Exercicio1$26 {

    public static void main(String[] args) {
        
        //double celsius = 36.00;
        double celsius = 36.00;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com os graus em Celsius: " );
        celsius = Double.parseDouble( scan.nextLine() );

        double fahrenheit = 1.8 * celsius + 32;

        System.out.printf( "%.2f graus Celsius correspondem a %.2f graus Fahrenheit", celsius, fahrenheit );

        scan.close();

    }
    
}
