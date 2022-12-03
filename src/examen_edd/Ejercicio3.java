package examen_edd;

/*Realice una función que permita imprimir todos los valores de una lista enlazada simple,
    pero con un orden invertido, realizando su recorrido en forma recursiva desde el ultimo
    nodo ingresado hasta L. Por ejemplo: una lista con elementos A, B, C, D, E debería 
    imprimirse e este sentido: E, D, C, B, A.*/
class Nodo {

    int dato;
    Nodo sig;

    public Nodo(int dato) {
        this.dato = dato;
        this.sig = null;
        
    }
}

public class Ejercicio3 {

    private static Nodo Agregar(Nodo L, int dato) {
        Nodo nd = new Nodo(dato);
        nd.sig = L;
        return nd;
    }

    static void ImprimirLista(Nodo L) {
        Nodo nd = L;
        while (nd != null) {
            System.out.print(nd.dato + " - ");
            nd = nd.sig;
        }
        System.out.println("null");
    }

    static Nodo Inverso(Nodo L) {
        Nodo Prin;
        Nodo N;
        if (L == null) {
            return L;
        }
        Prin = L;
        N = Prin.sig;
        if (N == null) {
            return L;

        }
        N = Inverso(N);
       Prin.sig.sig = Prin;
        Prin.sig = null;
        L = N;

        return L;
    }

    public static void main(String[] args) {
        int[] it = {2, 4, 6, 8, 10, };
        Nodo L = null;
        for (int i = it.length - 1; i >= 0; i--) {
            L = Agregar(L, it[i]);
        }
        L = Inverso(L);
        ImprimirLista(L);
    }
    
}
