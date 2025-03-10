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

        // Declara a variável 'opcao' para armazenar o caractere escolhido pelo usuário
        char opcao;

        // Lê a opção escolhida pelo usuário e armazena como caractere
        opcao = scan.next().charAt(0);  // scan.next() lê uma string e .charAt(0) pega o primeiro caractere dessa string

        // Exibe a operação que o usuário escolheu
        System.out.printf( "Operacao: %c\n", opcao );

        // Estrutura switch para realizar a operação escolhida
        switch ( opcao ) {
            // Se a opção for '+', realiza a soma
            case '+':
                System.out.printf( "%.2f + %.2f = %.2f", n1, n2, ( n1 + n2 ) );
                break;  // Finaliza o switch após a operação

            // Se a opção for '-', realiza a subtração
            case '-':
                // Calcula a subtração
                double subtracao = n1 - n2;
                System.out.printf( "%.2f - %.2f = %.2f", n1, n2, subtracao );
                break;

            // Se a opção for '*', realiza a multiplicação
            case '*':
                // Calcula a multiplicação
                double multiplicacao = n1 * n2;
                System.out.printf( "%.2f * %.2f = %.2f", n1, n2, multiplicacao );
                break;

            // Se a opção for '/', realiza a divisão
            case '/':
                // Calcula a divisão
                double divisao = n1 / n2;
                System.out.printf( "%.2f / %.2f = %.2f", n1, n2, divisao );
                break;

            // Se a opção não for reconhecida, exibe uma mensagem de erro
            default:
                System.out.println( "Opcao invalida!" );
        }



    }

}
