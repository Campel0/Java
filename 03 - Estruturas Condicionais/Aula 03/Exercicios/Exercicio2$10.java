import java.util.Scanner;

public class Exercicio2$10 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double lado1;
        double lado2;
        double lado3;

        System.out.print( "a: " );
        lado1 = Double.parseDouble( scan.nextLine() );

        System.out.print( "b: " );
        lado2 = Double.parseDouble( scan.nextLine() );

        System.out.print( "c: " );
        lado3 = Double.parseDouble( scan.nextLine() );

        // Primeiro, verificamos se os três lados formam um triângulo válido.
        // A condição é baseada na desigualdade triangular, que diz que a soma de dois lados
        // deve ser sempre maior que o terceiro lado.
        if( lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 )
        {
            // Se for um triângulo válido, agora verificamos o tipo de triângulo:

            // Se todos os três lados são iguais, então o triângulo é EQUILÁTERO
            if (lado1 == lado2 && lado2 == lado3)
            {
                System.out.print("Triangulo EQUILATERO");
            }
            // Se apenas dois lados são iguais, então o triângulo é ISÓSCELES
            else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3)
            // o operador || é usado para se caso uma entrada for verdadeira ele ira retornar verdadeiro
            {
                System.out.print("Triangulo ISOSCELES");
            }
            // Se todos os lados são diferentes, então o triângulo é ESCALENO
            else
            {
                System.out.print("Triangulo ESCALENO");
            }
        }
        else
        {
            // Se a condição inicial não for atendida, então os valores fornecidos
            // não formam um triângulo válido
            System.out.print( "As medidas fornecidas dos lados nao representam um triangulo valido!" );
        }



        scan.close();

    }

}
