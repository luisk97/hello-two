package javaapplication10;

public class JavaApplication10 {

    public static void main(String[] args) {
        ListaEnlazada lista = new ListaEnlazada();
        
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Ultimo elemento: "+lista.obtenerUltimo());
        
        lista.addPrimero(6);
        lista.addPrimero(5);
        lista.addPrimero(4);
        lista.addPrimero(3);
        lista.addPrimero(2);
        lista.addPrimero(1);
        
        lista.cortar(3);
         
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Primer elemento: "+lista.obtener(0));
        System.out.println("indice 2: "+lista.obtener(2));
        System.out.println("Ultimo elemento: "+lista.obtenerUltimo());
        System.out.println("Esta vacia: "+lista.estaVacio());
        System.out.println("Tamaño: "+lista.size());
    }
    
}
