package desafios.de.codigo;

import java.io.IOException;
import java.util.Scanner;

public class PositivosEMedia {
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int cont = 0;
        double valoresPositivos = 0;

        for (int i = 0; i < 6; i++) {
            double x = leitor.nextDouble();

            if (x > 0) {
                valoresPositivos += x;
                cont++;
            }
        }

        double media = valoresPositivos / cont;

        System.out.println(cont + " valores positivos");
        System.out.println(String.format("%.1f", media));

    }
}
