package cr.ac.tec;

public class Lista<T> {
    private Nodo<T> head = null;
    private Nodo<T> tail = null;

    public boolean isEmpty() {
        return head == null;
    }


    /**
     * Insert at beginning
     */
    public void insert(T element) {
        Nodo<T> nuevo = new Nodo<T>(element);
        if (isEmpty()) {
            head = nuevo;
            tail = head;
        } else {
            nuevo.next = head;
            head.prev = nuevo;
            head = nuevo;
        }
    }

    public void insertLast(T element) {
        if (isEmpty()) {
            this.insert(element);
        } else {
            Nodo<T> nuevo = new Nodo<T>(element);
            tail.next = nuevo;
            nuevo.prev = tail;
            tail = nuevo;
        }
    }


    public void printN() {
        Nodo<T> current = head;
        while (current != null) {
            System.out.print(current.valor + " ");
            current = current.next;
        }
    }
    public void Invertir() {
        Nodo<T> current = tail;
        while (current != null) {
            System.out.print(current.valor + " ");
            current = current.prev;
        }
    }
    public void Sublista(int Star, int size) {
        Lista<Integer> nueva = new Lista<>();
        Nodo<T> current = head;
        int a = 0;
        while (a != Star) {
            a++;
            System.out.println();
            current = current.next;
        }
        while (a != size){
            a++;
            nueva.insertLast((Integer) current.valor);
            current = current.next;
        }
        nueva.printN();
    }
    public void InsertarLista(Lista<T> porAnexar){
        Nodo<T> current = tail;
        current.next = porAnexar.head;
        porAnexar.head = current;
        tail = porAnexar.tail;

    }




}


