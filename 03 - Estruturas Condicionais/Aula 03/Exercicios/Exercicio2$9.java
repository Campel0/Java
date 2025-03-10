import java.util.Scanner;

public class Exercicio2$9 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Entre com a quantidade de lados: ");
        int quantidadeLados = Integer.parseInt( scan.nextLine() );

        System.out.print("Entre com a medida do lado: ");
        double medidaLado = Double.parseDouble( scan.nextLine() );

        if (quantidadeLados == 3)  // O operador == é o jeito de vermos a igualdade de variaveis
        {
            double perimetro = medidaLado * 3; // executado se o perimetro digitado for igual a 3
            System.out.printf("TRIANGULO de perimetro %.2f%n", perimetro);
        }
        else if (quantidadeLados == 4) // executado se o perimetro digitado for igual a 4
        {
            double area = medidaLado * medidaLado;
            System.out.printf("QUADRADO de area %.2f%n", area);
        }
        else if (quantidadeLados == 5) // executado se o perimetro digitado for igual a 5
        {
            System.out.println("PENTAGONO");
        }
        else
        {
            System.out.println("Poligono nao identificado");
        }

        scan.close();
    }
}
