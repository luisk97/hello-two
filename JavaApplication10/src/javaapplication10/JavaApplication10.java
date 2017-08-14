package javaapplication10;

public class JavaApplication10 {

    public static void main(String[] args) {
        Nodo primer = new Nodo("ejemplo");
        Nodo segundo = new Nodo(45);
        Nodo tercer = new Nodo("hola");
        
        primer.enlazarSiguiente(segundo);
        primer.obtenerSuiguiente().enlazarSiguiente(tercer);
        
        System.out.println(primer.obtenerSuiguiente().obtenerSuiguiente().obtenerValor());
        
    }
    
}
