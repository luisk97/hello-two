package javaapplication10;
import java.util.Scanner;
public class JavaApplication10 {

    public static void main(String[] args) {
        int opcion;
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        ListaEnlazada lista = new ListaEnlazada();
        for(int i = 0;i<6;i++){
            lista.add(i);
        }
        lista.obtenerLista();
        
        do{
            System.out.println("         Menu");
            System.out.println("Elija una opcion:");
            System.out.println("0-Agregar un elemento a la lista.");
            System.out.println("1-Agregar un elemento como el primero a la lista.");
            System.out.println("2-Obtener el ultimo objeto.");
            System.out.println("3-Obtener un objeto especifico.");
            System.out.println("4-Eliminar un objeto especifico.");
            System.out.println("5-Eliminar el primer objeto");
            System.out.println("6-Verificar si esta vacia.");
            System.out.println("7-Ver el tamaño de la lista");
            System.out.println("8-Ver lista");
            System.out.println("9-Salir");
            lista.obtenerLista();
            opcion = s.nextInt();
            switch(opcion){
                case 0:{
                    Object x;
                    System.out.println("Introdusca el objeto");
                    x = s.next();
                    lista.add(x);
                    break;
                }
                case 1:{
                    Object x;
                    System.out.println("Introdusca el objeto");
                    x = s.next();
                    lista.addPrimero(x);
                    break;
                }
                case 2:{
                    System.out.println(lista.obtenerUltimo());
                    break;
                }
                case 3:{
                    int x;
                    System.out.println("Introdusca el indice del objeto que desea");
                    x = s.nextInt();
                    System.out.println(lista.obtener(x));
                    break;
                }
                case 4:{
                    int x;
                    System.out.println("Introdusca el indice de objet  que desea eliminar");
                    x = s.nextInt();
                    lista.eliminar(x);
                    break;
                }
                case 5:{
                    lista.eliminarPrimero();
                    System.out.println("listo");
                    break;
                }
                case 6:{
                    System.out.println("Esta vacia: "+lista.estaVacio());
                    break;
                }
                case 7:{
                    System.out.println("El tamaño de la lista es: "+lista.size());
                    break;
                }
                case 8:{
                    lista.obtenerLista();
                    break;
                }
                case 9:{
                    flag = false;
                    break;
                }
                default:{
                    
                }
            }
        }while(flag);
        System.out.println("Adios");
        
    }
    
}
