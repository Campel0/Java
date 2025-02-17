import java.util.Scanner;

public class Exercicio1$25 {

    public static void main(String[] args) {
        
        //double fahrenheit = 125;
        double fahrenheit;

        Scanner scan = new Scanner( System.in);
        System.out.print( "Digite os graus em Fahrenheit: " );
        fahrenheit = Double.parseDouble( scan.nextLine() );

        double celsius = ( fahrenheit - 32 ) / 1.8;

        System.out.printf( "%.2f graus Fahrenheit correspondem a %.2f graus Celsius", fahrenheit, celsius );

        scan.close();

    }
    
}
