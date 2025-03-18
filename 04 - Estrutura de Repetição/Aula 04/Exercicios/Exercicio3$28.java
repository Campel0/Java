import java.util.Scanner;

public class Exercicio3$28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Entrada do saldo
        double saldo;
        System.out.print("Digite o saldo inicial: ");
        saldo = Double.parseDouble(scan.nextLine());

        // menu de opção
        System.out.print("Operacoes:\n");
        System.out.print("    1) Deposito;\n");
        System.out.print("    2) Saque;\n");
        System.out.print("    3) Fim;\n");

        while (true) {

            // escolha da opção
            System.out.print("Operacao desejada: ");
            int operacao = Integer.parseInt(scan.nextLine());

            // se a opção for 3 sera o fim do programa
            if (operacao == 3) {
                break;
            }
            // deposita se a opção for 1
            else if (operacao == 1) {
                System.out.print("Valor a depositar: ");
                double  deposito = Double.parseDouble(scan.nextLine());
                saldo += deposito; // atualiza a variavel
            }
            // faz o saque se a opção for 2
            else if (operacao == 2) {
                System.out.print("Valor a saque: ");
                double saque = Double.parseDouble(scan.nextLine());
                saldo -= saque; // atualiza a variavel
            }
            else{
                System.out.print("Operacao invalida.");
                continue;
            }

        }

        System.out.printf("Saldo final: R$%.2f\n", saldo);

        if (saldo == 0) {
            System.out.println("Sem saldo.");
        }
        else if (saldo < 0) {
            System.out.println("Conta devedora.");
        }
        else {
            System.out.println("Conta preferencial.");
        }

    }
}
