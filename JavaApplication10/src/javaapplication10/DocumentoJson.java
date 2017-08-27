package javaapplication10;

public class DocumentoJson {
    private String nombre;
    private ListaEnlazada lista;
    //private Object valor;
    private DocumentoJson siguiente;
    private DocumentoJson anterior;
    
    public DocumentoJson(String nombre,ListaEnlazada lista){
        this.nombre = nombre;
        this.lista = lista;
    }
    
//    public Object obtenerValor(){
//        return valor;
//    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public void enlazarSiguiente(DocumentoJson n){
        siguiente = n;
    }
    
    public void enlazarAnterior(DocumentoJson a){
        anterior = a;
    }
    
    public DocumentoJson obtenerSuiguiente(){
        return siguiente;
    }
    
    public DocumentoJson obtenerAnterior(){
        return anterior;
    }
    
    public ListaEnlazada obtenerLista(){
        return lista;
    }
}
