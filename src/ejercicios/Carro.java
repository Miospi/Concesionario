/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios;

/**
 *
 * @author miospi
 */
/*
Creamos la clase Carro y la ponemos publica
*/
public class Carro {
    
    /*
    Le asiganmos sus respectivos atrbutos, donde la marca es publica, el id y placa privados.
    */
    public String marca;
    private int id;
    private String placa;
    private int precio;
    
    /*
    Un Constructor es una función, método, etc, de las clases, la cual es llamada automáticamente
    cuando se crea un objeto de esa clase. Por ser métodos, los constructores también aceptan parámetros
    */

    /*
    Creamos un constructor que nos llamara cada uno de los atributos para luego reutilizarlos, almacenarlos,
    guardarlos, llamarlos e.t.c
    */
    public Carro(String marca, int id, String placa, int precio) {

        this.marca = marca;
        this.id = id;
        this.placa = placa;
        this.precio = precio;

    }

    /*
    Creamos un constructor vacio, esto es hobligatoria y se hace SIEMPRE, este sirve para poder crear 
    mas objetos de la clase es decir mas carros.
    */
    public Carro() {
    }
    
    /*
    A los atributos privados debemos crearles sus respectivos metodos get y set, para poder trabajar con ellos
    */

    /*
    get del id:
    lo volvemos publico le indicamos que es de tipo int y llamaos el get seguido del atributo con mayuscula inicial
    asi: getId 
    */
    public int getId() {
        
        /*
        aqui llamamos el id
        */
        return this.id;
    }

    /*
    El mismo procedimiento solo que con set, que es para guardar
    */
    public void setId(int id) {
        this.id = id;
    }
    
    
    /*
    Creamos el get y set de placa Recuerda get para obtener y set para guardar
    */
     public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }
    
    public int getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(int precio) {
        this.precio = precio;
    }
    /*
    toString es un metodo propio de java NetBeans, esta por defecto asi que para hacer uso de el debemos
    reescribir y para ello utilizamos el comando @Override
    */
    @Override
    
    /*
    Y creamos el metodo toString que consiste en mostrar todos los atributos de uno o varios objetos
    */
    
    /*
    pones public para hacer publico el metodo le decimos que nos retorna un String no nombramos con
    toString aca si no se puede el nombre que quieras ya que recuerda que toString ya es un metodo 
    predestinado, entre parentesis no le pasamos ningun parametro ya esto solo es cuando el usuario
    nos ingresa algun valor, y aca solo nos mostrara algo que ya esta guardado.
    */
    public String toString(){
        
        /*
        como la marca es publica la llamamos con 'this' esto se puede gracias al constructor que creamos
        en la linea 33, y como el id y la placa son privadas las llamamos con get, esto es posible gracias 
        a que ya cremaos los metodos get y set de estos atributos 
        */
        
        /*
        Creamos la variable String que nos guardara toda la informacion y la retornamos!
        */
        String resultado = "\n Marca:" +this.marca + "\n" + "\n ID:" + getId() + "\n" + "\n Placa:" + getPlaca() + "\n" + "\n Precio:$" + getPrecio() + "\n";
        return resultado;
         
        /*
        Finalmente para llamar el metodo en el main solo necesitamos unirlo con un punto asi: '.toString';
        */
        
    }
   
    }

   

    

