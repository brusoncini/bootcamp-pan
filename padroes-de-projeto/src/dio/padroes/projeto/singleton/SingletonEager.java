package dio.padroes.projeto.singleton;

// Eager: instancia direto sem verificação
public class  SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    // Garante que ninguém externamente pode instanciar o Singleton
    private SingletonEager() {
        super();
    }

    // Expõe a instancia de maneira pública
    public static SingletonEager getInstancia() {
        return instancia;
    }
}
