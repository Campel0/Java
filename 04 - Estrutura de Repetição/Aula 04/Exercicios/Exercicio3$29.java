import java.util.Scanner;

public class Exercicio3$29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //int contador = 0;

        while (true) {
            System.out.print("N1: ");
            int n1 = Integer.parseInt(scan.nextLine());

            int n2;
            while(true) {
                System.out.print("N2: ");
                n2 = Integer.parseInt(scan.nextLine());

                if (n2 == 0) {
                    System.out.println("Não existe divisao inteira por zero!");
                    System.out.print("Entre novamente com N2: ");
                }
                else{
                    break;
                }
            }
            System.out.printf("%d / %d = %d\n", n1, n2, n1 / n2);
            //contador++;

            System.out.print("Voce deseja realizar outro calculo? (S/N): ");
            String resposta = scan.nextLine().trim().toUpperCase();

            if (resposta.equals("N")){
                break;
            }
        }

        scan.close();
    }
}
