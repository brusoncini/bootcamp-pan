package dio.padroes.projeto.strategy;

public class TesteStrategy {
    public static void main(String[] args) {

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        // atribui um comportamento
        robo.setComportamento(normal);
        // Move o robô de acordo com o comportamento
        robo.mover();
        robo.mover();

        // atribui um comportamento
        robo.setComportamento(defensivo);
        // Move o robô de acordo com o comportamento
        robo.mover();

        // atribui um comportamento
        robo.setComportamento(agressivo);
        // Move o robô de acordo com o comportamento
        robo.mover();
        robo.mover();
        robo.mover();
    }
}
