import java.util.Scanner;

public class Exercicio2$18 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double n1;
        double n2;

        System.out.println( "N1: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.println( "N2: " );
        n2 = Double.parseDouble( scan.nextLine() );

        System.out.print( "Escolha uma operacao de acordo com o menu:\n" );

        System.out.println( "+) Adicao;\n" );
        System.out.println( "-) Subtracao;\n" );
        System.out.println( "*) Multiplicacao;\n" );
        System.out.println( "/) Divisao.\n" );

        char opcao;

        opcao = scan.next().charAt(0);

        System.out.printf( "Operacao: %c\n", opcao );

        switch ( opcao ) {
            case '+':
            System.out.printf( "%.2f + %.2f = %.2f", n1, n2, ( n1 + n2 ) );
            break;

            case '-': double subtracao = n1 - n2;
            System.out.printf( "%.2f - %.2f = %.2f", n1, n2, ( n1 - n2 ) );
            break;

            case '*': double multiplicacao = n1 * n2;
            System.out.printf( "%.2f * %.2f = %.2f", n1, n2, ( n1 * n2 ) );
            break;

            case '/': double divisao = n1 / n2;
            System.out.printf( "%.2f / %.2f = %.2f", n1, n2, ( n1 / n2 ) );
            break;

            default: System.out.println( "Opcao invalida!" );
        }


    }

}
