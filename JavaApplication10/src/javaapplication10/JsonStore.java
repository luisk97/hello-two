
package javaapplication10;

public class JsonStore {
    private Object valor;
    private JsonStore siguiente;
    private JsonStore anterior;
    
    public JsonStore(Object valor){
        this.valor = valor;
    }
    
    public Object obtenerValor(){
        return valor;
    }

    public void enlazarSiguiente(JsonStore n){
        siguiente = n;
    }
    
    public void enlazarAnterior(JsonStore a){
        anterior = a;
    }
    
    public JsonStore obtenerSuiguiente(){
        return siguiente;
    }
    
    public JsonStore obtenerAnterior(){
        return anterior;
    }
}
