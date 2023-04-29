package dio.padroes.projeto.strategy;

public class Robo {

    // Comportamento padrão do robô
    private Comportamento comportamento;

    // Muda o comportamento do robô
    public void setComportamento(Comportamento comportamento) {
        this.comportamento = comportamento;
    }

    public void mover() {
        comportamento.mover();
    }
}
