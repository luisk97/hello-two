
package javaapplication10;

public class Nodo {
    private Object  valor;
    private Nodo siguiente;
    
    public Nodo(Object valor){
        this.valor = valor;
    }
    
    public Object obtenerValor(){
        return valor;
    }

    public void enlazarSiguiente(Nodo n){
        siguiente = n;
    }
    
    public Nodo obtenerSuiguiente(){
        return siguiente;
    }
}
