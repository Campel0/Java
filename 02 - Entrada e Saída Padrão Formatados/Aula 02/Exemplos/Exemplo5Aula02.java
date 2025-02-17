import java.util.Scanner;

public class Exemplo5Aula02 {
    
    public static void main(String[] args) {
        
        int numero1;
        int numero2;
        int resultado;

        Scanner scan = new Scanner( System.in );
        System.out.print( "Entre com um numero: " );
        numero1 = Integer.parseInt( scan.nextLine() );

        System.out.print( "Entre com outro numero: " );
        numero2 = Integer.parseInt( scan.nextLine() );

        resultado = numero1 + numero2;

        System.out.printf( "%d + %d = %d\n", numero1, numero2, resultado);

        scan.close();

    }

}
