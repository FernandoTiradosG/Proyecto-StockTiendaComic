package Modelo;

public class Comic {
    private int ID;
    private String nombre;
    private String heroe;
    private String autores;
    private String editorial;
    private double precio;
    private int cantidad;
    
    public Comic(int ID, String nombre, String heroe, String autores, String editorial, double precio, int cantidad){
        this.ID = ID;
        this.nombre = nombre;
        this.heroe = heroe;
        this.precio = precio;
        this.autores = autores;
        this.editorial = editorial;
        this.cantidad = cantidad;
    }
    
    public Comic(int ID, String nombre, String heroe, String autores, String editorial, double precio){
        this.ID = ID;
        this.nombre = nombre;
        this.heroe = heroe;
        this.precio = precio;
        this.autores = autores;
        this.editorial = editorial;
        this.cantidad = 1;
    }
    
    public int getID(){
        return this.ID;
    }

    public void setID(int newID){
        this.ID = newID;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String newNombre){
        this.nombre = newNombre;
    }
    
    public String getHeroe(){
        return this.heroe;
    }

    public void setHeroe(String newHeroe){
        this.heroe = newHeroe;
    }
    
    public String getautores(){
        return this.autores;
    }

    public void setAutores(String newAutores){
        this.autores = newAutores;
    }
    
    public String getEditorial(){
        return this.editorial;
    }

    public void setEditorial(String newEditorial){
        this.editorial = newEditorial;
    }
    
    public double getPrecio(){
        return this.precio;
    }

    public void setPrecio(double newPrecio){
        this.precio = newPrecio;
    }
    
    public int getCantidad(){
        return this.cantidad;
    }

    public void setCantidad(int newCantidad){
        this.cantidad = newCantidad;
    }
}
