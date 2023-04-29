package dio.padroes.projeto.singleton;

// Lazy: Verifica se a instância é nula antes de instanciar
public class SingletonLazy {
    private static SingletonLazy instancia;

    // Garante que ninguém externamente pode instanciar o Singleton
    private SingletonLazy() {
        super();
    }

    // Expõe a instancia de maneira pública
    public static SingletonLazy getInstancia() {
        if (instancia == null) {
            instancia = new SingletonLazy();
        }
        return instancia;
    }
}
