package javaapplication10;

public class ListaEnlazada {
    
    private Nodo cabeza;
    private int size;
    
    public ListaEnlazada(){
        cabeza = null;
        size = 0;
    }
    
    public Object obtener(int index){
        int contador = 0;
        Nodo temp = cabeza;
        while(contador < index){
            temp = temp.obtenerSuiguiente();
            contador++;
        }
        return temp.obtenerValor();
    }
    
    public Object obtenerUltimo(){
        if(cabeza == null){
            return "lista vacia";
        }else{
            Nodo temp = cabeza;
            for(int i = 0;i < (size-1);i++){
                temp = temp.obtenerSuiguiente();
            }
            return temp.obtenerValor();
        } 
    }
    
    public void addPrimero(Object obj){
        if(cabeza==null){
            cabeza = new Nodo(obj);
        }else{
            Nodo temp = cabeza;
            Nodo nuevo = new Nodo(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
        }
        size++;
    }
    
    public int size(){
        return size;
    }
    
    public boolean estaVacio(){
        return (cabeza==null);
    }
}
