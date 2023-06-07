/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Parcial2A;

import Excepciones.EmptyList;
import Excepciones.NoSuchElement;
import Excepciones.WrongPosition;


/**
 *
 * Blanca Franco
 */
public class DoubleLinkedList<T> {
    private Node<T> primero, ultimo;
    private int longitud = 0;

    public DoubleLinkedList() {
    }
    
    public void insert(T dato, int pos) throws WrongPosition{
        if(pos < -1 || pos > longitud+1) throw new WrongPosition("Posicion dede estar entre 1 y "+ (longitud+1));
        Node<T> nuevo = new Node(dato);
        if(primero == null)
            primero = ultimo = nuevo;
        
        Node<T> temp = primero;
        if(pos == 1){
            primero.setAnterior(nuevo);
            nuevo.setSigte(primero);
            primero = nuevo;   
            
        }
        else{
            for(int i = 1; i< pos-1; i++){
                temp= temp.getSigte();
            }
            
            nuevo.setSigte(temp.getSigte()); //el siguiente de nuevo apunta al nodo actual que esta el pos
            temp.getSigte().setAnterior(nuevo);
            nuevo.setAnterior(temp);
            temp.setSigte(nuevo);
 
        }
        longitud++;
    }
    public int remove(T dato) throws NoSuchElement,EmptyList{
        if(longitud ==0) throw new EmptyList();
        Node<T> aux = primero;
        for(int i = 1; i<=longitud; i++){
            if(aux.getDato().toString().equals(dato.toString())){
                if(i==1) {
                    primero = primero.getSigte();
                    if(longitud==1) primero= ultimo = null;
                    else primero.setAnterior(null);
                }
                else {
                    Node<T> temp = aux.getAnterior();
                    temp.setSigte(aux.getSigte());
                    if(aux.getSigte()==null) //ultimo
                        ultimo = temp;
                    else
                        aux.getSigte().setAnterior(temp);
                }
                longitud--;
                return i;
            }
            aux = aux.getSigte();    
        }
           throw new NoSuchElement();
    }
    
    public T get(int pos) throws WrongPosition {
        if(pos < -1 || pos > longitud) throw new WrongPosition();
        
        Node<T> aux= primero;
        for(int i = 1; i<pos; i++){
            aux=aux.getSigte();
            
        }
        return aux.getDato();
    }
    
    public int getSize(){
        return longitud;
    }
}