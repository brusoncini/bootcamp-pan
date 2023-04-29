package dio.padroes.projeto.singleton;

// Lazy Holder: encapsula a instancia em uma classe interna (holder)
public class SingletonLazyHolder {

    private static class Holder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder();
    }

    // Garante que ninguém externamente pode instanciar o Singleton
    private SingletonLazyHolder() {
        super();
    }

    // Expõe a instancia de maneira pública
    public static SingletonLazyHolder getInstancia() {
        return Holder.instancia;
    }
}
