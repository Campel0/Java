import java.util.Scanner;

public class Exercicio2$3 {
    
    public static void main( String[] args) {
        Scanner scan = new Scanner( System.in );

        int n1;
        int n2;

        System.out.print( "Entre com um numero: " );
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com outro numero: ");
        n2 = Integer.parseInt( scan.nextLine() );

        if( n1 >= n2 ) // verifica se n1 é maior ou igual a n2 e coloca o numero maior entre eles primeiro
        {
            System.out.printf( "Ordem decrescente: %d >= %d", n1, n2 );
        }
        else{
            System.out.printf( "Ordem decrescente: %d >= %d", n2, n1);
        }

        scan.close();

    }
}
