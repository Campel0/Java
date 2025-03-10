import java.util.Scanner;

public class Exercicio2$17 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        int numero;

        System.out.println( "Entre com um valor inteiro: " );
        numero = Integer.parseInt( scan.nextLine() );

        // Estrutura switch para verificar o valor da variável 'numero'
        switch ( numero )
        {
            // Se o número for 2, exibe a mensagem correspondente
            case 2:
                System.out.printf( "O valor fornecido foi %d.", numero );
                break; // Interrompe o switch após executar este caso

            // Se o número for 4, exibe a mensagem correspondente
            case 4:
                System.out.printf( "O valor fornecido foi %d.", numero );
                break;

            // Se o número for 6, exibe a mensagem correspondente
            case 6:
                System.out.printf( "O valor fornecido foi %d.", numero );
                break;

            // Se o número for 8, exibe a mensagem correspondente
            case 8:
                System.out.printf( "O valor fornecido foi %d.", numero );
                break;

            // Caso o valor não seja 2, 4, 6 ou 8, entra no 'default'
            default:
                System.out.println( "Valor invalido." );
                break; // Finaliza o switch
        }

        scan.close();

    }
}
