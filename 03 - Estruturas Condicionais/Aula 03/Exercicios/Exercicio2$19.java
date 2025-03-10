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
            // Se a opção for 'C', converte de Celsius para Fahrenheit
            case 'C':
                // Solicita a temperatura em Celsius ao usuário
                System.out.println("Entre com a temperatura em graus Celsius: ");
                temperatura = scan.nextDouble();  // Lê o valor da temperatura em Celsius

                // Realiza a conversão de Celsius para Fahrenheit e exibe o resultado
                System.out.printf("%.2f graus Celsius correspondem a %.2f graus Fahrenheit", temperatura, (1.8 * temperatura + 32));
                // Fórmula de conversão: (Celsius * 1.8) + 32
                break;

            // Se a opção for 'F', converte de Fahrenheit para Celsius
            case 'F':
                // Solicita a temperatura em Fahrenheit ao usuário
                System.out.println("Entre com a temperatura em graus Fahrenheit: ");
                temperatura = scan.nextDouble();  // Lê o valor da temperatura em Fahrenheit

                // Realiza a conversão de Fahrenheit para Celsius e exibe o resultado
                System.out.printf("%.2f graus Fahrenheit correspondem a %.2f graus Celsius", temperatura, ((temperatura - 32) / 1.8));
                // Fórmula de conversão: (Fahrenheit - 32) / 1.8
                break;

            // Caso a opção não seja 'C' ou 'F', exibe uma mensagem de erro
            default:
                System.out.println("Opcao invalida!");  // Exibe "Opção inválida!" para entradas incorretas
                break;
        }

    }
}
