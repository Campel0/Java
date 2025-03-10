import java.util.Scanner;

public class Exercicio2$6 {
    
    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double n1;

        System.out.print( "Entre com um valor: " );
        n1 = Double.parseDouble( scan.nextLine() );

        if( n1 > 20 ) // se o numero digitador for maior que 20 ele ira executar essa condição
        {
            double metade = n1 / 2; // ira dividir o numero por 2
            System.out.printf( "A metade de %.2f e %.2f", n1, metade );
        }
        else // se o numero for menor que 20 ele ira executar essa condição
        {
            double triplo = n1 * 3; // ira multiplicar o numero por 3
            System.out.printf( "O triplo de %.2f e %.2f", n1, triplo );
        }

        scan.close();

    }

}
