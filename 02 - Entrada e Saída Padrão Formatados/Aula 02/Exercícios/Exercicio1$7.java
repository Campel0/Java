import java.util.Scanner;

public class Exercicio1$7 {
    
    public static void main(String[] args ) {
        
        // int lado = 5;
        int lado;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Digite o tamanho do lado: " );
        lado = Integer.parseInt( scan.nextLine() );

        int area = lado * lado;
        int perimetro = 4 * lado;

        System.out.printf( "Perimetro = %d\n", perimetro );
        System.out.printf( "Area = %d", area );

        scan.close();

    }

}
