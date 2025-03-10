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

        // Verificação se os ângulos formam um triângulo válido.
// A soma dos ângulos internos de qualquer triângulo sempre deve ser igual a 180 graus.
        if ( somaAngulos == 180 ) {

            // Se a soma for 180, classificamos o triângulo com base nos ângulos:

            // Se pelo menos um dos ângulos for exatamente 90 graus, o triângulo é RETÂNGULO.
            if ( a == 90 || b == 90 || c == 90 )
            {
                System.out.println( "Triangulo RETANGULO" );
            }
            // Se algum ângulo for maior que 90 graus, o triângulo é OBTUSÂNGULO.
            else if ( a > 90 || b > 90 || c > 90 )
            {
                System.out.println( "Triangulo OBTUSANGULO" );
            }
            // Se todos os ângulos forem menores que 90 graus, o triângulo é ACUTÂNGULO.
            else
            {
                System.out.println( "Triangulo ACUTANGULO" );
            }
        }
        else
        {
            // Se a soma dos ângulos não for 180 graus, não é possível formar um triângulo válido.
            System.out.println( "As medidas fornecidas dos angulos nao representam um triangulo valido!" );
        }

        scan.close();
    }
}

