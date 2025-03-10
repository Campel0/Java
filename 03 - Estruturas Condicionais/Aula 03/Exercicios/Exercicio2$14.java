import java.util.Scanner;

public class Exercicio2$14 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner( System.in );

        double peso;
        double altura;

        System.out.print( "Entre com seu peso em quilogramas: " );
        peso = Double.parseDouble( scan.nextLine() );

        System.out.print( "Entre com sua altura em metros: " );
        altura = Double.parseDouble( scan.nextLine() );

        double imc = peso / ( altura * altura );

        System.out.printf( "IMC: %.2f\n", imc );

        // Condições para cada valor do IMC
        if ( imc < 17.0 ){
            System.out.print( "Voce esta muito abaixo do peso ideal!" );
        }
            // usamos o operador E para verificar se as duas entradas são verdadeiras
            else if ( 17.0 <= imc && imc < 18.5 ){
                System.out.print( "Voce esta abaixo do peso ideal!" );
        }
            else if ( 18.5 <= imc && imc < 25.0 ){
                System.out.print( "Parabens! Voce esta em seu peso normal!" );
        }
            else if ( 25.0 <= imc && imc < 30.0){
                System.out.print( "Atencao, voce esta acima de seu peso (sobrepeso)!" );
        }
            else if ( 30.0 <= imc && imc < 35.0){
                System.out.print( "Cuidado! Obesidade grau I!" );
        }
            else if ( 35.0 <= imc && imc < 40.0){
                System.out.print( "Cuidado! Obesidade grau II!" );
        }
        else{
            System.out.print( "Muito cuidado!!! Obesidade grau III!" );
        }

        scan.close();

    }

}
