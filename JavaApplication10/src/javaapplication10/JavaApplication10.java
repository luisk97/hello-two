package javaapplication10;

public class JavaApplication10 {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Ultimo elemento: "+lista.obtenerUltimo());
        
        lista.addPrimero("Luis K");
        lista.addPrimero(100);
        lista.addPrimero("hola que pex");
        lista.addPrimero(3);
         
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Primer elemento: "+lista.obtener(0));
        System.out.println("Ultimo elemento: "+lista.obtenerUltimo());
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Tamaño: "+lista.size());
    }
    
}
