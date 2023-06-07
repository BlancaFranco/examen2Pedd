/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2A;

/**
 *
 * @author fpuna
 */
public class Node<T>{
    private T dato;
    private Node sigte;
    private Node anterior;

    public Node(T dato) {
        this.dato = dato;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Node getSigte() {
        return sigte;
    }

    public void setSigte(Node sigte) {
        this.sigte = sigte;
    }

    public Node getAnterior() {
        return anterior;
    }

    public void setAnterior(Node anterior) {
        this.anterior = anterior;
    }
    
      
    
    
    
}
