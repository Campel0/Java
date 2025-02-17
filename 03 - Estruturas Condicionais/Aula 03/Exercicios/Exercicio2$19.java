import java.util.Scanner;

public class Exercicio2$19 {

    public static void main( String[] args ) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Escolha uma operacao de acordo com o menu:");
        System.out.println("    C) Celsius -> Fahrenheit;");
        System.out.println("    F) Fahrenheit -> Celsius.");

        char opcao = scan.next().charAt(0);
        System.out.printf("Opcao: %c\n", opcao);

        double temperatura;

        switch (opcao) {
            case 'C':
                System.out.println("Entre com a temperatura em graus Celsius: ");
                temperatura = scan.nextDouble();
                System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit",
                        temperatura, (1.8 * temperatura + 32)); // calculo de graus em Fahrenheit
                break;

            case 'F':
                System.out.println("Entre com a temperatura em graus Fahrenheit: ");
                temperatura = scan.nextDouble();
                System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius",
                        temperatura, ((temperatura - 32) / 1.8)); // calculo de graus em Celsius
                break;

            default:
                System.out.println("Opcao invalida!");
                break;
        }
    }
}
