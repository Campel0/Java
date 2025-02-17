import java.util.Scanner;

public class Exercicio1$13 {

    public static void main(String[] args) {
        
        // double n1 = 7.5;
        // double n2 = 3.5;
        double n1;
        double n2;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com um numero decimal: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com outro numero decimal: " );
        n2 = Double.parseDouble( scan.nextLine() );


        double soma = n1 + n2;
        double subtracao = n1 - n2;
        double multiplicacao = n1 * n2;
        double divisao = n1 / n2;

        System.out.printf( "%.2f + %.2f = %.2f\n", n1, n2, soma );
        System.out.printf( "%.2f - %.2f = %.2f\n", n1, n2, subtracao );
        System.out.printf( "%.2f * %.2f = %.2f\n", n1, n2, multiplicacao );
        System.out.printf( "%.2f / %.2f = %.2f\n", n1, n2, divisao );

        scan.close();

    }

}