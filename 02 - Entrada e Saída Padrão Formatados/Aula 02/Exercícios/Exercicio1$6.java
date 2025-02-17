import java.util.Scanner;

public class Exercicio1$6 {

    public static void main( String[] args ){

        // int n1 = 7;
        // int n2 = 3;
        int n1;
        int n2;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com um numero: " );
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com outro numero: " );
        n2 = Integer.parseInt( scan.nextLine() );


        int soma = n1 + n2;
        int subtracao = n1 - n2;
        int multiplicacao = n1 * n2;
        int divisao = n1 / n2;

        System.out.printf( "%d + %d = %d\n", n1, n2, soma );
        System.out.printf( "%d - %d = %d\n", n1, n2, subtracao );
        System.out.printf( "%d * %d = %d\n", n1, n2, multiplicacao );
        System.out.printf( "%d / %d = %d\n", n1, n2, divisao );
    
        scan.close();
        
    }

}