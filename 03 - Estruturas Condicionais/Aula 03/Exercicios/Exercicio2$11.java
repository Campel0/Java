import java.util.Scanner;

public class Exercicio2$11 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        System.out.print( "Digite o primeiro ângulo: ");
        double a = scan.nextDouble();

        System.out.print( "Digite o segundo ângulo: ");
        double b = scan.nextDouble();

        System.out.print( "Digite o terceiro ângulo: ");
        double c = scan.nextDouble();

        double somaAngulos = a + b + c;

        // Verificação se os ângulos formam um triângulo.
        if ( somaAngulos == 180 ) {
            // Se essa condição for verdadeira, o programa continua para a classificação do triângulo.
            if ( a == 90 || b == 90 || c == 90 ) {
                System.out.println( "Triangulo RETANGULO" );
            } else if ( a > 90 || b > 90 || c > 90 ) {
                System.out.println( "Triangulo OBTUSANGULO" );
            } else {
                System.out.println( "Triangulo ACUTANGULO" );
            }
        } else {
            System.out.println( "As medidas fornecidas dos angulos nao representam um triangulo valido!");
        }

        scan.close();
    }
}

