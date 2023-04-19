package desafios.de.codigo;

import java.io.IOException;
import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        double A = leitor.nextDouble();
        double B = leitor.nextDouble();
        double C = leitor.nextDouble();
        double soma;

        // verifica se é triangulo:
        if (A + B > C && A + C > B && B + C > A) {
            soma = A + B + C;
            System.out.println("Perimetro = " + soma);

        } else {
            // calcula a área:
            soma = ((A + B) * C) / 2;
            System.out.println("Area = " + soma);

        }
    }
}
