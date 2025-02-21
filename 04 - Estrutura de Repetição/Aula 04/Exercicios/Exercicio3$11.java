import java.util.Scanner;

public class Exercicio3$11 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("N1: ");
        int n1 = Integer.parseInt(scan.nextLine());

        System.out.print("N2: ");
        int n2 = Integer.parseInt(scan.nextLine());

        if(n1 <= n2) // errei nos operadores de comparação
        {
            for(int i = n1; i <= n2; i++){
                System.out.print(i + " ");
            }
        }
        else
        {
            for(int i = n1; i >= n2; i--){
                System.out.print(i + " ");
            }
        }

        scan.close();

    }
}
