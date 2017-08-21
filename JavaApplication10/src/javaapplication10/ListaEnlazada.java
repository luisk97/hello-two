package javaapplication10;

public class ListaEnlazada {
    
    private JsonStore cabeza;
    private int size;
    
    public ListaEnlazada(){
        cabeza = null;
        size = 0;
    }
    
    public void obtenerLista(){
        JsonStore temp = cabeza;
        if(cabeza == null){
            System.out.println("lista vacia");
        }else{
            for(int i = 0;i < size;i++){
                System.out.print(temp.obtenerValor()+", ");
                temp = temp.obtenerSuiguiente();
            }
            System.out.println("");
        }
    }
    
    public Object obtener(int index){
        int contador = 0;
        JsonStore temp = cabeza;
        while(contador < index){
            temp = temp.obtenerSuiguiente();
            contador++;
        }
        return temp.obtenerValor();
    }
    public Object obtenerAnterior(int index){
        JsonStore temp = cabeza;
        for(int i = 0;i< index;i++){
            temp = temp.obtenerSuiguiente();
        }
        return temp.obtenerAnterior().obtenerValor();
    }
    
    public Object obtenerUltimo(){
        if(cabeza == null){
            return "lista vacia";
        }else{
            JsonStore temp = cabeza;
            for(int i = 0;i < (size-1);i++){
                temp = temp.obtenerSuiguiente();
            }
            return temp.obtenerValor();
        } 
    }
    
    public void addPrimero(Object obj){
        if(cabeza==null){
            cabeza = new JsonStore(obj);
        }else{
            JsonStore temp = cabeza;
            JsonStore nuevo = new JsonStore(obj);
            nuevo.enlazarSiguiente(temp);
            cabeza = nuevo;
            cabeza.obtenerSuiguiente().enlazarAnterior(cabeza);
        }
        size++;
    }
    public void add(Object obj){
        if(cabeza == null){
            cabeza = new JsonStore(obj);
            size++;
        }else{
            JsonStore nuevo = new JsonStore(obj);
            JsonStore temp = cabeza;
            for(int i = 0;i<size;i++){
                if(temp.obtenerSuiguiente() != null){
                    temp = temp.obtenerSuiguiente();
                }else{
                    temp.enlazarSiguiente(nuevo);
                    size++;
                }
            }
        }
    }
    public void cortar(int index){
        JsonStore temp = cabeza;
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
            JsonStore temp = cabeza;
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
