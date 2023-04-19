package desafios.de.codigo;

import java.util.Scanner;

public class SomaHComN {
    public static void main(String[] Args) {
        Scanner sc = new Scanner(System.in);

        double h = 0;
        double n = sc.nextDouble();

        for (int i = 1; i <= n; i++) {
            // Calcula o valor de H, de forma que resulte na soma dos termos:
            h = h + (double)1/i;
        }

        // Imprime a soma dos termos, considerando um resultado com duas casas decimais:
        System.out.println(Math.round(h));
    }
}