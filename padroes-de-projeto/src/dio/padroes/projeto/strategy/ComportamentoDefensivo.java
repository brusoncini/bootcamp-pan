package dio.padroes.projeto.strategy;

public class ComportamentoDefensivo implements Comportamento {

    @Override
    public void mover() {
        System.out.println("O robô está se afastando de você desfensivamente...");
    }
}
