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
    
    public void cortar(int index){
        Nodo temp = cabeza;
        for(int i = 0;i < (index-1);i++){
                temp = temp.obtenerSuiguiente();
        }
        temp.enlazarSiguiente(null);
        size = index;
    }
    
    public void eliminar(int indice){
        if(indice == 0){
            cabeza = cabeza.obtenerSuiguiente();
        }else{
            Nodo temp = cabeza;
            for(int i = 0;i < (indice-1);i++){
                temp = temp.obtenerSuiguiente();
            }
            temp.enlazarSiguiente(temp.obtenerSuiguiente().obtenerSuiguiente());
        }
        size--;
    }
    
    public void eliminarPrimero(){
        cabeza = cabeza.obtenerSuiguiente();
        size--;
    }
    
    public int size(){
        return size;
    }
    
    public boolean estaVacio(){
        return (cabeza==null);
    }
}
