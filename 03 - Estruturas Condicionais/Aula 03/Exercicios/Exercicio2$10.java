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

        if( lado1 + lado2 > lado3 && lado1 + lado3 > lado2 && lado2 + lado3 > lado1 ) {
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.print("Triangulo EQUILATERO");
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.print("Triangulo ISOSCELES");
            } else {
                System.out.print("Triangulo ESCALENO");
            }
        }
        else{
                System.out.print( "As medidas fornecidas dos lados nao representam um triangulo valido!" );
            }


        scan.close();

    }

}
