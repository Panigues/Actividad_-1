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


    public String printN() {
        Nodo<T> current = head;
        String allElements = "";
        while (current != null) {
            System.out.print(current.valor + " ");
            allElements = allElements + current.valor + " ";
            current = current.next;
        }
        return allElements;
    }
    public String Invertir() {
        Nodo<T> current = tail;
        String elements = "";
        while (current != null) {
            elements = elements + current.valor + " ";
            current = current.prev;
        }

        System.out.println("Invertida:" + elements);
        return elements;
    }
    public String Sublista(int Star, int size) {
        Lista<Integer> nueva = new Lista<>();
        Nodo<T> current = head;
        String elements = "";
        int a = 0;
        while (a != Star) {
            a++;
            current = current.next;
        }
        while (a != size){
            a++;
            nueva.insertLast((Integer) current.valor);
            elements = elements + current.valor + " ";
            current = current.next;
        }
        System.out.println("Sublista:" + elements);

        return elements;
    }
    public void InsertarLista(Lista<T> porAnexar){
        Nodo<T> current = tail;
        current.next = porAnexar.head;
        porAnexar.head = current;
        tail = porAnexar.tail;


    }




}


