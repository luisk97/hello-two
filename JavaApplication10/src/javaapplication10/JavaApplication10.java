package javaapplication10;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;
public class JavaApplication10 {

    public static void main(String[] args) throws Exception{
        
//        ListaEnlazadaDoble lista = new ListaEnlazadaDoble();
//        lista.add("j1");
//        lista.add("j2");
//        lista.add("j3");
//        lista.add("j4");
//        lista.add("j5");
//        lista.obtener(0).obtenerLista().add("D1");
//        lista.obtenerLista();
//        lista.obtener(0).obtenerLista().obtener(0).obtenerLista().addAtributo("ced", "entero", "clave", "si");
//        
//        FileOutputStream out = new FileOutputStream("Jsons.txt");
//        ObjectOutputStream salida = new ObjectOutputStream(out);
//        
//        salida.writeObject(lista);
//        salida.flush();
        
        
        
//        lista.obtenerLista();
//        lista.obtener(0).obtenerLista().obtenerLista();
//        System.out.println(lista.obtener(0).obtenerLista().obtener(0).obtenerNombre());
//        lista.obtener(0).obtenerLista().obtener(0).obtenerLista().verAtributos();
//        lista.obtener(0).obtenerLista().obtener(0).obtenerLista().obtenerAtributo(0).verCaracteristicas();
        
        
        
//        lista.obtenerPorValor("j3").obtenerLista().add("D1");
//        lista.obtenerPorValor("j3").obtenerLista().obtener(0).obtenerLista().addAtributo("Cedula", "cadena", "llavePrimaria", "si");
//        
//        
//        FileOutputStream out = new FileOutputStream("Jsons.txt");
//        ObjectOutputStream salida = new ObjectOutputStream(out);
        





        ObjectInputStream leer = new ObjectInputStream(new FileInputStream("Jsons.txt"));
        ListaEnlazadaDoble lista = (ListaEnlazadaDoble) leer.readObject();
        
        int opcion;
        Menu menu = new Menu();
        boolean flag = true;
        Scanner s = new Scanner(System.in);
        do{
            menu.imprimirMenu("la Aplicacion", "JsonStore");
            lista.obtenerLista();
            opcion = s.nextInt();
            switch(opcion){
                case 1:{
                    String nom;
                    System.out.println("Introdusca el nombre del Store");
                    nom = s.next();
                    lista.add(nom);
                    break;
                }
                case 2:{
                    int ind;
                    System.out.println("Introdusca el indice donde desea insertarlo:");
                    ind = s.nextInt();
                    if(ind<(lista.size()-1)){
                        System.out.println("Ingrese el nombre del JsonStore");
                        String nom;
                        nom=s.next();
                        lista.insertar(ind,nom); 
                    }else{
                        if(ind==(lista.size()-1)){
                            System.out.println("Ingrese el nombre del JsonStore");
                            String nom;
                            nom=s.next();
                            lista.add(nom);
                        }else{
                        System.out.println("Indice fuera de rango.");
                        }
                    }
                    break;
                }
                case 3:{
                    int ind;
                    JsonStore obtenido;
                    System.out.println("Introdusca el indice del JsonStore que desea");
                    ind = s.nextInt();
                    obtenido = lista.obtener(ind);
                    boolean flag2 = true;
                    do{
                    menu.imprimirMenu(obtenido.obtenerNombre(),"DocumntoJson");
                    ind = s.nextInt();
                    switch(ind){
                        case 1:{
                            String nom;
                            System.out.println("Introdusca el nombre del Documento");
                            nom = s.next();
                            obtenido.obtenerLista().add(nom);
                            break;
                        }
                        case 2:{
                            String nom;
                            System.out.println("Introdusca el nombre del Documento");
                            nom = s.next();
                            obtenido.obtenerLista().addPrimero(nom);
                            break;
                        }
                        case 3:{
                            int indice;
                            DocumentoJson doc;
                            System.out.println("Introdusca el indice del documento que desea: ");
                            indice = s.nextInt();
                            doc = obtenido.obtenerLista().obtener(indice);
                            boolean flag3 = true;
                            do{
                                System.out.println("        Menu de "+doc.obtenerNombre());
                                System.out.println("1-Definir atributo.");
                                System.out.println("2-Ver atributos.");
                                System.out.println("3-Obtener atributo ");
                                System.out.println("4-Salir");
                                ind=s.nextInt();
                                switch(ind){
                                    case 1:{
                                        System.out.println("Introduca el nombre del atributo: ");
                                        String nom = s.next();
                                        System.out.println("Introdusca el tipo de atributo: ");
                                        Object tipo = s.next();
                                        System.out.println("Introdusca el tipo especial: ");
                                        Object tipoEsp = s.next();
                                        System.out.println("Es requerido si o no:");
                                        String requerido = s.next();
                                        doc.obtenerLista().addAtributo(nom,tipo,tipoEsp,requerido);
                                        break;
                                    }
                                    case 2:{
                                        doc.obtenerLista().verAtributos();
                                        break;
                                    }
                                    case 3:{
                                        System.out.println("Introdusca el indice de atributo: ");
                                        ind = s.nextInt();
                                        ObjetoJson obj = doc.obtenerLista().obtenerAtributo(ind);
                                        obj.verCaracteristicas();
                                        break;
                                    }
                                    case 4:{
                                        flag3 = false;
                                    }
                                }
                            }while(flag3);
                            break;
                        }
                        case 4:{
                            System.out.println(obtenido.obtenerLista().obtenerUltimo());
                            break;
                        }
                        case 5:{
                            obtenido.verLista();
                            break;
                        }
                        case 6:{
                            flag2 = false;
                        }
                        default:{
                            
                        }
                    }
                    }while(flag2);
                    break;
                }
                case 4:{
                    System.out.println(lista.obtenerUltimo());
                    break;
                }
                case 5:{
                    int x;
                    System.out.println("Introdusca el indice de objet  que desea eliminar");
                    x = s.nextInt();
                    lista.eliminar(x);
                    break;
                }
                case 6:{
                    lista.eliminarPrimero();
                    System.out.println("listo");
                    break;
                }
                case 7:{
                    System.out.println("Esta vacia: "+lista.estaVacio());
                    break;
                }
                case 8:{
                    System.out.println("El tamaño de la lista es: "+lista.size());
                    break;
                }
                case 9:{
                    lista.obtenerLista();
                    break;
                }
                case 10:{
                    FileOutputStream out = new FileOutputStream("Jsons.txt");
                    ObjectOutputStream salida = new ObjectOutputStream(out);

                    salida.writeObject(lista);
                    salida.flush();
                }
                case 11:{
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
