import java.util.Scanner;

public class Exercicio3$21 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Altura: ");
        int altura = scan.nextInt();

        if (altura > 0){
            for (int i = 1; i <= altura; i++){
                for (int j = 0; j < altura - i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
        else if (altura < 0){

            altura = -altura;

            for (int i = altura; i >= 1; i--){
                for (int j = 0; j < altura - i; j++){
                    System.out.print(" ");
                }
                for (int j = 0; j < (2 * i - 1); j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
