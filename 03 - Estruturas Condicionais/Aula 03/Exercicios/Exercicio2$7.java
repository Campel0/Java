import java.util.Scanner;

public class Exercicio2$7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner( System.in );

        double n1;
        double n2;

        System.out.print( "Entre com um numero: " );
        n1 = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com outro numero: " );
        n2 = Double.parseDouble( scan.nextLine() );

        if( n1 + n2 >= 10) // se caso a soma de n1 e n2 for maior ou igual a 10 irá executar o print
        {
            System.out.printf( "Os numeros fornecidos foram %.2f e %.2f", n1, n2 ); // primeiro print
        }
        else // senão caso a soma de n1 e n2 for menor que 10 ira executar a condição
        {
            double subtracao = n1 - n2; // subtração entre n1 e n2 de acordo com a condição
            System.out.printf( "A subtracao entre %.2f e %.2f e igual a %.2f", n1, n2, subtracao ); // print na tela
        }

        scan.close();

    }
    
}
