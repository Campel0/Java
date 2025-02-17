import java.util.Scanner;

public class Exercicio2$16 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com um numero entre 1 e 3999: ");
        int numero = Integer.parseInt(scan.nextLine());
        int numeroOriginal = numero; // Guardando o valor original para a saída correta

        if (numero < 1 || numero > 3999) {
            System.out.print("Numero incorreto!");
        } else {
            String romano = "";

            // Milhares (1000 - 3000)
            if (numero >= 1000) {
                if (numero >= 3000) {
                    romano += "MMM";
                    numero -= 3000;
                } else if (numero >= 2000) {
                    romano += "MM";
                    numero -= 2000;
                } else if (numero >= 1000) {
                    romano += "M";
                    numero -= 1000;
                }
            }

            // Centenas (100 - 900)
            if (numero >= 900) {
                romano += "CM";
                numero -= 900;
            } else if (numero >= 500) {
                romano += "D";
                numero -= 500;
            } else if (numero >= 400) {
                romano += "CD";
                numero -= 400;
            } else if (numero >= 100) {
                if (numero >= 300) {
                    romano += "CCC";
                    numero -= 300;
                } else if (numero >= 200) {
                    romano += "CC";
                    numero -= 200;
                } else {
                    romano += "C";
                    numero -= 100;
                }
            }

            // Dezenas (10 - 90)
            if (numero >= 90) {
                romano += "XC";
                numero -= 90;
            } else if (numero >= 50) {
                romano += "L";
                numero -= 50;
            } else if (numero >= 40) {
                romano += "XL";
                numero -= 40;
            } else if (numero >= 10) {
                if (numero >= 30) {
                    romano += "XXX";
                    numero -= 30;
                } else if (numero >= 20) {
                    romano += "XX";
                    numero -= 20;
                } else {
                    romano += "X";
                    numero -= 10;
                }
            }

            // Unidades (1 - 9)
            if (numero == 9) {
                romano += "IX";
            } else if (numero >= 5) {
                romano += "V";
                if (numero == 6) romano += "I";
                else if (numero == 7) romano += "II";
                else if (numero == 8) romano += "III";
            } else if (numero == 4) {
                romano += "IV";
            } else if (numero >= 1) {
                if (numero == 3) romano += "III";
                else if (numero == 2) romano += "II";
                else if (numero == 1) romano += "I";
            }

            // Imprimir a saída correta com o número original
            System.out.printf("%d = %s\n", numeroOriginal, romano);
        }

        scan.close();
    }
}
