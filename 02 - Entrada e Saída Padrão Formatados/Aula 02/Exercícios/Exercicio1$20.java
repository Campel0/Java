import java.util.Scanner;

public class Exercicio1$20 {

    public static void main(String[] args) {
        
        // int n1 = 5;
        // int n2 = 10;
        int n1;
        int n2;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com um numero: " );
        n1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com outro numero: " );
        n2 = Integer.parseInt( scan.nextLine() );

        int media = ( n1 + n2 ) / 2;

        System.out.printf( "Media aritmetica: %d", media );

        scan.close();

    }
    
}
