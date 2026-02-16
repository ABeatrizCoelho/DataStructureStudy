package lista;
public class ListaEncadeada {

    private Nodo primeiro;
    
    public void adicionarNoInicio(float valor) {
        Nodo novoNodo = new Nodo(valor);
        novoNodo.setProximo(primeiro);
        primeiro = novoNodo;
    }

    public void adicionarNoFinal(float valor) {
        Nodo novoNodo = new Nodo(valor);

        if (primeiro == null) {
            primeiro = novoNodo;
        } else {
            Nodo atual = primeiro;

            while (atual.getProximo() != null) {
                atual = atual.getProximo();
            }

            atual.setProximo(novoNodo);
        }
    }

    public void removerPrimeiroNodo() {
        if (primeiro != null) {
            primeiro = primeiro.getProximo();
        }
    }

    public void imprimir() {
        Nodo atual = primeiro;

        while (atual != null) {
            System.out.print(atual.getDado() + " -> ");
            atual = atual.getProximo();
        }

        System.out.println("null");
    }
}
