import java.util.Scanner;

public class Quitanda {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();
        double valorMorangos, valorMacas, valorTotal;

        // Retorna o preço a ser pago pelo cliente:
        if (morangos <= 5) {
            valorMorangos = morangos * 2.5;
        } else {
            valorMorangos = morangos * 2.2;
        }

        if (macas <= 5) {
            valorMacas = macas * 1.8;
        } else {
            valorMacas = macas * 1.5;
        }

        // Aplica desconto:
        valorTotal = valorMacas + valorMorangos;

        if (morangos + macas > 8 || valorTotal > 25) {
            valorTotal -= valorTotal * 0.1;
        }

        System.out.println(valorTotal);
    }

}
