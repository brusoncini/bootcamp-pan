package desafios.de.codigo;

import java.util.Scanner;

public class FabricaDeCarros {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int custoFabrica = scan.nextInt();
        int porcentagemDistribuidor = scan.nextInt();
        int percentualImpostos = scan.nextInt();

        // Calcula a porcentagem do distribuidor e dos impostos:
        int distribuidor = (custoFabrica * porcentagemDistribuidor) / 100;
        int valorImpostos = (custoFabrica * percentualImpostos) / 100;
        int custoConsumidor = (custoFabrica + distribuidor + valorImpostos);

        System.out.println(custoConsumidor);
    }
}
