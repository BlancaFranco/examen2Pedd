
package Parcial2A;

import Excepciones.EmptyList;
import Excepciones.NoSuchElement;
import Excepciones.WrongPosition;

/**
 * Main para probar las clases y los metodos creados
 * No modifique esta clase, excepto el nombre del paquete
 * @author Claudio Barua
 */
public class MainTest {
    DoubleLinkedList<String> lista;
    public MainTest() {
        lista = new DoubleLinkedList<>();
        int tam = 0;
        try {
            lista.insert("hola", 1);
            lista.insert("Chau", 2);
            lista.insert("que tal", 2);
            lista.insert("Holis", 1);
            //lista.insert("Algo", 0);
            lista.insert("Algo", 6);
        } catch (WrongPosition ex) {
            System.out.println(ex);
        }
        tam = lista.getSize();
        try{    
            for (int i = 1; i <= tam; i++) {
                System.out.println(lista.get(i));
            }
            System.out.println("Size: " + tam);
            System.out.println("Dato en la posicion1 ="+lista.get(1));
            
            System.out.println("Removiendo..");
            System.out.println("removiendo Holis->" +lista.remove("Holis"));
            System.out.println("removiendo perro->"+lista.remove("perro"));
        } catch (WrongPosition |  NoSuchElement | EmptyList ex) {
            System.out.println(ex);
        }
        System.out.println("Size: " + lista.getSize());
    }
    
    public static void main(String[] args) {
        new MainTest();
    }
}
