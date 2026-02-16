package lista;
public class Nodo {
    private float dado;
    private Nodo proximo;

    public Nodo(float dado) {
        this.dado = dado;
        this.proximo = null;
    }

    public float getDado() {
        return dado;
    }

    public void setDado(float dado) {
        this.dado = dado;
    }

    public Nodo getProximo() {
        return proximo;
    }

    public void setProximo(Nodo proximo) {
        this.proximo = proximo;
    }
}
