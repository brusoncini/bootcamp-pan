package dio.padroes.projeto.facade;

public class TesteFacade {

    public static void main(String[] args) {
        // teste de integração com os subsistemas de exemplo
        Facade facade = new Facade();
        facade.migrarCliente("Bruna", "12345678");
    }
}
