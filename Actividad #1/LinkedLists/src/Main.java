import cr.ac.tec.Lista;


public class Main {
    public static void main(String[] args) {
        // creacion de las listas
        Lista<Integer> Original = new Lista<>();
        Lista<Integer> PorAnexar = new Lista<>();
        Original.insert(1);
        Original.insertLast(2);
        Original.insertLast(3);
        Original.insertLast(4);
        PorAnexar.insert(5);
        PorAnexar.insertLast(6);
        PorAnexar.insertLast(7);
        PorAnexar.insertLast(8);
        // Metodo 1
        System.out.println("original");
        Original.printN();
        System.out.println("PorAnexar");
        PorAnexar.printN();
        System.out.println("Original unido con PorAnexar");
        Original.InsertarLista();
        System.out.println();
        // Metodo 2
        System.out.println("Nueva contiene:");
        Original.Sublista(1, 3);
        System.out.println();
        // Metodo 3
        System.out.println("Orden normal de original");
        Original.printN();
        System.out.println("Orden invertido de original");
        Original.Invertir();
    }
}
