import java.util.Scanner;

public class Exercicio2$17 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int numero;

        System.out.println( "Entre com um valor inteiro: " );
        numero = Integer.parseInt( scan.nextLine() );

        switch ( numero ){
            case 2: System.out.printf( "O valor fornecido foi %d.", numero );
            break;

            case 4: System.out.printf( "O valor fornecido foi %d.", numero );
            break;

            case 6: System.out.printf( "O valor fornecido foi %d.", numero );
            break;

            case 8: System.out.printf( "O valor fornecido foi %d.", numero );
            break;

            default: System.out.println( "Valor invalido.");
            break;
        }

        scan.close();

    }
}
