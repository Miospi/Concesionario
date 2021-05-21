/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

 /*
 Este es un programa muy basico hecho apartir de todo lo aprendido en la clase de programaciónI el proyecto es de un consecionario, 
 tiene unicamente cinco funciones para un super usuario y tres para el usuario promedio una clase, 
 y un metodo dentro de la clase, recuerda que la clase es 'Carro' esta dentro del paquete ejercicios donde 
 tambien se encuentra el main que es Ejercicios, osea este!

 */

 /*
 Para ingresar al super usuario se tendra un "codigo" el cual desbloqueara las cuatro funciones que se mostraran al 
 usuario por consola al correr el programa, el podra acceder a cada una de estas ingresando el numero respectivo de cada funcion, 
 (1) para consultar los carros que se han añadido previamente al arreglor por el super ususario, 
 (2) para agregar un carro, este lo agrega el super usuario por consola,
 ingresando los datos como: Marca/Modelo del vehiculo, ID, placa, precio. 
 (3) para buscar un carro, ya que en la clase 'Carro' se crearon 3 atributos antes dichos que son, marca, id y placa,precio, el usuario y super usuario
 puede consultar los atributos de un carro  por su placa,  
 (4) para buscar el carro atraves de la placa y poder sacarlo de el arreglo  
 (5) poder buscar carros atraves del rango de rangos de precio  
*/
package ejercicios;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author miospi
 */
public class EjercicioS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //linea de codigo hobligatoria para pasar datos por consola
        Scanner entrada = new Scanner(System.in);
        int contraseña = 123;
        /*
         La clase HashSet crea conjunto de datos sin ningún orden 
         entre ellos. Para cargar datos o elementos a un HashSet se
         utiliza el método add(Object elemento).
         */
 /*
         Ya teniendo la clase 'Carro' lista con todos sus atributos, 
         constructores y metodos creamos un HashSet de 'carros' es decir 
         el arreglo que guardara todos los carros
         */
        HashSet<Carro> carros = new HashSet<Carro>();

        /*
         Para ingresar un carro al arreglo ponemos primero la clase a la que pertenece
         es decir 'Carro', el nombre que le daremos a ese carro, yo le puse 'c1' pero
         puede llamarse 'carro1', 'primer carro' como quieras, UN SOLO IGUAL porque vamos
         a asignar un valor, new porque vamos a crear algo nuevo volvemos a copiar la clase 
         a la que lo vamos a agregar, y entre parentesis ponemos los tres atributos que deben 
         llevar los carros, RECUERDA para variables String entre comillas dobles y para numeros
         sin comillas
         */
        Carro c1 = new Carro("Mustang", 123, "qwl1", 240000000);
        /*
         Ya creamos el carro que queremos ingresar, pero no lo hemos guardado en el arreglo, para ello
         vamos a utilizar el comando 'add', recuerda utilizar el punto para unir entre parentesis le
         pasamos lo que vamos a guardar, es decir todos los atributos juntos de carro que forman un objeto
         y en mi caso lo llame 'c1' y como siempre punto y coma
         */
        carros.add(c1);

        Carro c2 = new Carro("Clio", 456, "mhb753", 10000000);//creando
        carros.add(c2);//guardando
        Carro c3 = new Carro("Chevrolet", 123, "pwx476", 25000000);
        carros.add(c3);
        Carro c4 = new Carro("Stepway", 456, "mhb753", 35000000);
        carros.add(c4);
        Carro c5 = new Carro("TXL", 123, "pwx406", 190000000);
        carros.add(c5);
        Carro c6 = new Carro("Amarok", 1448, "kam093", 170000000);
        carros.add(c6);

        /*
         Creamos un contador de tipo numerico es decir int, yo lo llame menu y le dije que empezaria en 0.
         */
        int menu = -1;

        /*
         Creamos un while que nos permitira mostrarle al usuario el menu hasta que el decida como entrar
         */
        while (menu != 0) {
            System.out.println("\nIngrese la contraseña de Super usuario para acceder como administrador"
                    + "\n o digite 0 para acceder como usuario");
            menu = entrada.nextInt();
            switch (menu) {
                case 123:

                    System.out.println("Eres Admin");

                    int menu1 = -1;

                    while (menu1 != 0) {
                        /*
             Creamos un SOUT indicandole al usuario las opciones disponibles, para hacer un salto de linea 
             y que todo se vea mas organizado utilizamos eslach inverso y la letra n asi: '\n'. 
                         */
                        System.out.println("Ingrese (1) para consultar los carros\n "
                                + "Ingrese (2) para agregar un carro\n "
                                + "Ingrese (3) para buscar carro\n "
                                + "Ingrese(4) para elmininar un carros\n "
                                + "Ingrese (5) para busacar carro por rango de precio"
                                + "Ingrese (0) para salir");

                        /*
             Guardamos la opcion que nos ingrese el usuario en menu con la siguiente linea de codigo, esto
             solo es posible por la linea de codigo que ingresamos al principio la numero 40 mas especificamente
             esta: 'Scanner entrada = new Scanner(System.in);'.
                         */
 /*
             En P.O.O hay dos tipos de datos los primitivos y no primitivos, los primitivos son los que 
             estan con inicial en minuscula como int, float, long, y los no primitivo son los que si llevan
             la inicial en mayuscula como String, esta linea de codigo solo acepta tipo de datos no pprimitivos,
             asi que para convertilos simplemente ponemos un punto para unir y pasamos el tipo de dato en mayuscula.
                         */
 /*
             como cuando yo cree mi contador llamado 'menu' lo declare como un int vamos a poner '.nextInt();', si
             lo hubiera declarado como un float seria igual '.nextFloat();'. Si es un tivo de dato String no hay 
             necesidad de pasarlo ya que en si este dato es no primitivo asi que simplemente seria asi: '.next();'.
                         */
                        menu = entrada.nextInt();

                        /*
             Switch case es una estructura de control empleada en programación. Se utiliza para agilizar la toma 
             de decisiones múltiples; trabaja de la misma manera que lo harían sucesivos if , if else o until 
             anidados, así como combinaciones propias de determinados lenguajes de programación.
                         */
 /*
             ponemos 'switch' y entre parentesis le pasamoa el 'menu', que es el contador que almacena la opcion
             que nos ingreso el usuario por consola, y este se ira recorriendo todos los casos gracias al while 
             para ver a cual entra.
                         */
                        switch (menu) {

                            /*
                 Creamos los casos, que son la solucion de las opciones del menu, el numero de casos es 
                 equivalente al numero de opciones que le demos al usuario, a cada caso se le asigna un numero 
                 este numero debe ser concordante con la opcion que muestra el menu, obligatoriamente se pone
                 la palabra break  con punto y coma al final del caso, indicando que ahi finaliza, esto evita que
                 se creen blucles infinitos o con alguna secuencia inesperada, asi: 'break;'.
                             */
                            case 1:

                                /*
                     La opcion uno(1) es decir el caso uno(1) es para consultar toda la informacion, es decir los
                     carros que nosotros/autores ingresamos or consola, tambien entraran los que el usuario cree, 
                     pero recuerda que aun no utilizamos bases de datos, asi que es una memoria volatil, apenas 
                     se reinicie el programa los datos ingresados por consola es decir por el usuario se borraran.
                                 */
 /*
                     Como esta opcion solo tiene como funcion mostrar creamos un SOUT al que le ajuntamos, el 
                     arreglo que nos contiene todos los carros y lo unimos con el metodo que hara esto, el metodo,
                     toString lo explico en la clase
                                 */
                                System.out.println("informacion:" + carros.toString());
                                break;

                            case 2:

                                /*
                     Le damos al usuario las indicaciones para que ingrese los tres atributos necesarios para
                     crear un carro y lo gurdamos en variables del tipo correspondientes.
                                 */
                                System.out.println("ingrese la marca del carro");
                                String marca = entrada.next();

                                System.out.println("ingrese el id del carro");
                                int id = entrada.nextInt();

                                System.out.println("ingrese la placa del carro");
                                String placa = entrada.next();

                                System.out.println("Ingrese el precio del carro");
                                int precio = entrada.nextInt();

                                /*
                     creamos el objeto que es la union de todos los atributos, yo lo llame 'nuevo', es igual 
                     a lo que hicimos al principio en la linea 65
                                 */
                                Carro nuevo = new Carro(marca, id, placa, precio);

                                /*
                     Creamos un comprobante que nos ayudara a averiguar si el carro que nos ingreso el usuario
                     ya existe. 
                     El comprobante es de tipo boolean se le asigna un nombre y empieza en false
                                 */
                                boolean esta = false;

                                /*
                     Creamos un for ish al que llame 'vei' que nos va a recorrer todos los objetos guardados en el
                     arreglo carros perteneciente a clase Carro
                                 */
                                for (Carro vei : carros) {

                                    /*
                         comparamos si algunos de los objetos del arreglo es igual al carro ingresado por el 
                         usuario, 
                                     */
                                    if (vei.equals(nuevo)) {

                                        /*
                             si alguno de los objetos es igual al creado por el usuario, significa que ese carro
                             ya existe, asi que la bandera cambiara a verdadero/true, RECUERDA con un solo igual '=' 
                             porque estamos otorgando un valor si estuvieramos comparando serian dos.
                                         */
                                        esta = true;
                                    }

                                }

                                /*
                     afuera del for ish y del if para evitar bucles indeseados, comparamos el valor que tiene la 
                     bandera si la bandera esta en true, significa que el carro ya existe asi que no lo agregamos
                     y hacemos un SOUT indicando al usuario esto!
                                 */
                                if (esta == true) {

                                    System.out.println("El carro ya existe");
                                } else {

                                    /*
                         Pero si el comprobante no esta en true significa que no se encontro el carro, se 
                         agrega el objeto 'nuevo' que es como nombre el carro que ingreso el usuario 
                         con el comando add.
                         Tambien hacemos un SOUT indicandole al usuario que se guardo la informacion con exito.
                                     */
                                    carros.add(nuevo);
                                    System.out.println("El carro se ha agregado correctamente");
                                }
                                /*
                     Recuerda el 'break;' para terminar el caso!!!!
                                 */
                                break;

                            case 3:

                                /*
                     El tercer caso busca un carro especifico ya existente en el arreglo, y para esto lo buscaremos 
                     con la placa, asi que le pedimos al usuario que la ingrese.
                                 */
                                System.out.println("Ingrese la placa del carro que desea buscar");

                                /*
                     La guardamos en una bariable String ya que la placa puede contener tanto letras como numeros
                                 */
                                String buscar = entrada.next();

                                /*
                     Creamos una comprobante para la verificacion de la existencia del carro por la placa
                                 */
                                boolean existe = false;

                                /*
                     Creamos un for ish al que llame 'num' para recorrer el arreglo.
                                 */
                                for (Carro num : carros) {

                                    /*
                         Si te fijas en la clase Carro el atributo placa es privado, asi que para obtenerlo 
                         necesitamos llmamar el metodo 'get' que esta explicado es la clase 'Carro', como no
                         vamos a comparar numeros si no un objeto completo no podemos utilizar doble igual si no 
                         '.equals()' y entre los parentesis el objeto que vamos a comparar, si fuera una palabra
                         es igual solo que la palbra debe ir entre comillas dobles asi: '.equals("palabra")'
                                     */
 /*
                         Entonces c1on 'num' que es mi for ish que ya recorrio todo el arreglo de carros, lo 
                         unimos a la placa con punto y llamamos el metodo get para obtener el atributo 'placa'
                         que es privado RECUERDA siempre el atributo despues de get empieza con mayuscula!
                                     */
                                    if (num.getPlaca().equals(buscar)) {
                                        /*
                             Si se encontro la placa significa que el carro existe asi que hacemos un SOUT que nos
                             muestre el carro con el metodo toString explicado en la clase 'Carro'.
                                         */
                                        System.out.println("La informacion del carro es:" + num.toString());

                                        /*
                             Cambiamos el valor de la del comprobante a true indicando que si se encontro el carro
                                         */
                                        existe = true;
                                    }
                                }
                                /*
                     Al final del 'if' y del for ish creamos otro if por si del comprobante esta en false, si esto es asi 
                     es porque no se escontro la placa ingresada por el usuario, osea que el carro no existe!
                     Es muy importante hacer fuera del for ish para evitar errores.
                                 */
                                if (existe == false) {
                                    /*
                         Creamos un SOUT indicando al usuario que no se encontro el carro
                                     */
                                    System.out.println("No existe un carro con la placa ingresada");
                                }
                                break;

                            case 4:

                                System.out.println("ingrese  placa del carro que desea eliminar");

                                String xxx = entrada.next();

                                boolean plaquita = false;

                                for (Carro borrar : carros) {

                                    if (borrar.getPlaca().equals(xxx)) {

                                        plaquita = true;

                                        carros.remove(borrar);
                                        System.out.println("El carro se elimino con exito");

                                    }
                                }
                                if (plaquita == false) {
                                    System.out.println("no se puede eliminar algo que no esta");
                                }
                                break;
                            case 5:

                                JOptionPane.showMessageDialog(null, "Ingrese el rango de precio que desea buscar (Sin ceros)");
//                                System.out.println("Ingrese el rango de precio que desea buscar (Sin ceros)");

                                int valorMaximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor Maximo"));
                                //System.out.println("ingrese valor maximo");
//                                int valorMaximo = entrada.nextInt();
                                int valorMinimo = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor Minimo"));
                                //System.out.println("ingrese valor minimo");
//                                int valorMinimo = entrada.nextInt();

                                valorMinimo = valorMinimo * 1000000;

                                valorMaximo = valorMaximo * 1000000;
                                
                                
                                
                                for (Carro pe : carros) {

                                    if (pe.getPrecio() < valorMaximo && pe.getPrecio() > valorMinimo) {

                                        JOptionPane.showMessageDialog(null, "Carros en rango de precio:  \n" + pe.marca + ": $" + pe.getPrecio());
                                        //System.out.println("Carros en rango de precio:  \n" + pe.marca + pe.getPrecio());
                                        
                                    } else {
                                        if (pe.getPrecio() > valorMaximo && pe.getPrecio() < valorMinimo);
                                        JOptionPane.showMessageDialog(null, "No hay carros disponibles");
                                        // System.out.println("No hay carro disponible");

                                    }

                                }

                                break;

                        }

                    }

                case 0:
                    int menu2 = -1;

                    //  Se usa while´porque no se sabe cuantas veces se repita el menu 
                    while (menu2 != 0) {
                        System.out.println("Ingrese 1 para consultar Carros" + "\n Ingrese (2) para Buscar" + "\n Ingrese (3) para buscar rangos de precios" + "\n Ingrese (0) para salir");
                        menu2 = entrada.nextInt();
                        switch (menu2) {
                            case 1:
                                System.out.println("informacion:" + carros.toString());
                                break;

                            case 2:

                                /*
                     El tercer caso busca un carro especifico ya existente en el arreglo, y para esto lo buscaremos 
                     con la placa, asi que le pedimos al usuario que la ingrese.
                                 */
                                System.out.println("Ingrese la placa del carro que desea buscar");

                                /*
                     La guardamos en una bariable String ya que la placa puede contener tanto letras como numeros
                                 */
                                String buscar = entrada.next();

                                /*
                     Creamos una bandera para la verificacion de la existencia del carro por la placa
                                 */
                                boolean existe = false;

                                /*
                     Creamos un for ish al que llame 'num' para recorrer el arreglo.
                                 */
                                for (Carro num : carros) {

                                    /*
                         Si te fijas en la clase Carro el atributo placa es privado, asi que para obtenerlo 
                         necesitamos llmamar el metodo 'get' que esta explicado es la clase 'Carro', como no
                         vamos a comparar numeros si no un objeto completo no podemos utilizar doble igual si no 
                         '.equals()' y entre los parentesis el objeto que vamos a comparar, si fuera una palabra
                         es igual solo que la palbra debe ir entre comillas dobles asi: '.equals("palabra")'
                                     */
 /*
                         Entonces c1on 'num' que es mi for ish que ya recorrio todo el arreglo de carros, lo 
                         unimos a la placa con punto y llamamos el metodo get para obtener el atributo 'placa'
                         que es privado RECUERDA siempre el atributo despues de get empieza con mayuscula!
                                     */
                                    if (num.getPlaca().equals(buscar)) {
                                        /*
                             Si se encontro la placa significa que el carro existe asi que hacemos un SOUT que nos
                             muestre el carro con el metodo toString explicado en la clase 'Carro'.
                                         */
                                        System.out.println("La informacion del carro es:" + num.toString());

                                        /*
                             Cambiamos el valor de la bandera a true indicando que si se encontro el carro
                                         */
                                        existe = true;
                                    }
                                }
                                /*
                     Al final del 'if' y del for ish creamos otro if por si la bandera esta en false, si esto es asi 
                     es porque no se escontro la placa ingresada por el usuario, osea que el carro no existe!
                     Es muy importante hacer fuera del for ish para evitar errores.
                                 */
                                if (existe == false) {
                                    /*
                         Creamos un SOUT indicando al usuario que no se encontro el carro
                                     */
                                    System.out.println("No existe un carro con la placa ingresada");
                                }
                                break;

                            case 3:

                                JOptionPane.showMessageDialog(null, "Ingrese el rango de precio que desea buscar (Sin ceros)");
//                                System.out.println("Ingrese el rango de precio que desea buscar (Sin ceros)");

                                int valorMaximo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor Maximo"));
                                //                              System.out.println("ingrese valor maximo");
//                                int valorMaximo = entrada.nextInt();
//                                int valorMinimo = Integer.parseInt(JOptionPane.showInputDialog("ingrese valor Minimo"));
                                //                              System.out.println("ingrese valor minimo");
//                                int valorMinimo = entrada.nextInt();
                            int valorMinimo = 1;

                                valorMaximo = valorMaximo * 1000000 + 1000000;

                                for (Carro pe : carros) {

                                    if (pe.getPrecio() < valorMaximo && pe.getPrecio() > valorMinimo) {

                                        JOptionPane.showMessageDialog(null, "Carros en rango de precio:  \n" + pe.marca + ": $" + pe.getPrecio());
                                        //System.out.println("Carros en rango de precio:  \n" + pe.marca + pe.getPrecio());

                                    }
//                                    else{ 
//                                        if ( pe.getPrecio()> valorMaximo && pe.getPrecio() < valorMinimo);
//                                        JOptionPane.showMessageDialog(null, "No hay carros disponibles");
//                                       // System.out.println("No hay carro disponible");
//                                        
//                                    
//                                    } 
                                    if (pe.getPrecio() > valorMaximo && pe.getPrecio() < valorMinimo);
                                    JOptionPane.showMessageDialog(null, "No hay carros disponibles");
                                    // System.out.println("No hay carro disponible");
                                }

                                break;


                        }
                    }
            }
        }
    }
}
