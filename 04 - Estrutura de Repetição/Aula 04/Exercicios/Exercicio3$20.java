// mpressão de Padrão com Espaços e Loop For

public class Exercicio3$20 {
    public static void main(String[] args) {

        // Parte superior do padrão
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Parte inferior do padrão
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Parte superior do padrão invertido
        for (int i = 1; i <= 5; i++){
            for (int j = 0; j < 5 - i; j++){
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();

        // Parte inferior do padrão invertido
        for (int i = 5; i >= 1; i--){
            for (int j = 1; j <= 5 - i; j++){
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
