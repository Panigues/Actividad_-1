package cr.ac.tec;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {

    @Test
    void insertarLista() {
        Lista<Integer> Original = new Lista<>();
        Lista<Integer> PorAnexar = new Lista<>();
        Original.insertLast(1);
        Original.insertLast(2);
        Original.insertLast(3);
        Original.insertLast(4);
        PorAnexar.insertLast(5);
        PorAnexar.insertLast(6);
        PorAnexar.insertLast(7);
        PorAnexar.insertLast(8);
        Original.InsertarLista(PorAnexar);
        System.out.print("Insertar: ");
        assertAll(
                () -> assertEquals("1 2 3 4 5 6 7 8 ", Original.printN())

        );
    }

    @Test
    void sublist(){
        Lista<Integer> Original = new Lista<>();
        Original.insertLast(1);
        Original.insertLast(2);
        Original.insertLast(3);
        Original.insertLast(4);

        assertAll(
                () -> assertEquals("2 3 ", Original.Sublista(1, 3))
        );
    }

    @Test
    void invert(){
        Lista<Integer> Original = new Lista<>();
        Original.insertLast(1);
        Original.insertLast(2);
        Original.insertLast(3);
        Original.insertLast(4);

        assertAll(
                () -> assertEquals("4 3 2 1 ", Original.Invertir())
        );
    }



}
