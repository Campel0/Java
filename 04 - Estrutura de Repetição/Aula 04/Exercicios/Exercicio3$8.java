import java.util.Scanner;

public class Exercicio3$8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Forneca um numero menor ou igual a zero: ");
        int numero = Integer.parseInt(scan.nextLine());

        if(numero > 0){
            System.out.println("Valor incorreto (positivo)");
        }
        else{
            for(int i = 0; i >= numero; i--) // Dificuldade no la
            {
                System.out.printf("%d ", i);
            }
        }

        scan.close();

    }
}
