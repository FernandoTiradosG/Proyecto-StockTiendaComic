package main;

import Vista.Tienda;
import bbdd.Conexion;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Conexion.conectar();
        
        Tienda tienda = new Tienda();
    }
    
}
