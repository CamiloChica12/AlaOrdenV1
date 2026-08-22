package app.Domain;

public class Producto {
    private int id;
    private String nombre;
    private String precio;
    private boolean disponible;

    //constructor parametro
    public Producto (int id, String nombre, String precio, boolean Disponible ){
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.disponible = disponible;

    }
    //getter and setter


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }


    //Methodos

    public void create(){

    }

    public void selectAll(){


    }

    public void selectById(int Id){


    }

    public void Update(){


    }

    public void Deleted(int id){


    }




}



