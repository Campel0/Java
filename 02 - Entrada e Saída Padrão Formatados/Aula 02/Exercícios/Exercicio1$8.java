import java.util.Scanner;

public class Exercicio1$8 {
    
    public static void main( String[] args){

        // int ladoRetangulo = 5;
        // int alturaRetangulo = 10;
        int ladoRetangulo;
        int alturaRetangulo;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Digite o lado do retangulo: " );
        ladoRetangulo = Integer.parseInt( scan.nextLine() );

        System.out.print( "Digite a altura do retangulo: " );
        alturaRetangulo = Integer.parseInt( scan.nextLine() );

        int perimetroRetangulo = ( 2 * ladoRetangulo ) + ( 2 * alturaRetangulo );
        int areaRetangulo = ladoRetangulo * alturaRetangulo;

        System.out.printf( "Perimetro = %d\n", perimetroRetangulo );
        System.out.printf( "Area = %d", areaRetangulo );

        scan.close();

    }

}
