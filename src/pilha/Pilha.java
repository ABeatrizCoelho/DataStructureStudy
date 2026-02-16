package pilha;
public class Pilha {

    private Integer[] elementos;
    private int topo;

    public void tamanho(int valor){
        elementos = new Integer[valor];
        topo = -1; // pilha começa vazia
    }

    public void empilhar(int valor){

        if (topo == elementos.length - 1) {
            System.out.println("Pilha cheia!");
            return;
        }

        topo++;
        elementos[topo] = valor;
    }

    public Integer desempilhar(){

        if (topo == -1) {
            System.out.println("Pilha vazia!");
            return null;
        }

        Integer valor = elementos[topo];
        elementos[topo] = null;
        topo--;

        return valor;
    }

    public void imprimir(){

        if (topo == -1) {
            System.out.println("[ ]");
            return;
        }

        String pilha = "[ ";

        for (int i = 0; i <= topo; i++) {
            pilha += elementos[i] + " , ";
        }

        pilha = pilha.substring(0, pilha.lastIndexOf(" , "));
        pilha += " ]";

        System.out.println(pilha);
    }
}
