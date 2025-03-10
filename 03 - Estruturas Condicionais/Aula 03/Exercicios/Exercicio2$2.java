import java.util.Scanner;

public class Exercicio2$2 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int n1;
        int n2;


        System.out.print( "Entre com um numero: ");
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com outro numero: " );
        n2 = Integer.parseInt( scan.nextLine() );

        if( n1 <= n2 ) // Verifica se n2 é maior ou igual que n1 e ordena o numero maior primeiro em forma crescente.
        {
            System.err.printf( "Ordem crescente: %d <= %d", n1, n2);
        }
        else{
            System.out.printf( "Ordem crescente: %d <= %d", n2, n1 );
        }

        scan.close();

    }
    
}
