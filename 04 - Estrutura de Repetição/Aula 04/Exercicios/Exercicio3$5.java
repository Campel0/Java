import java.util.Scanner;

public class Exercicio3$5 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Forneca um numero maior ou igual a zero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero < 0)
        {
            System.out.print("Valor incorreto (negativo)");
        }
        else{
            for(int i = 0; i <= numero; i++){
                System.out.printf("%d ", i);
            }
        }

        scan.close();

    }
}
