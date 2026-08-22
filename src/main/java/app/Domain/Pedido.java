package app.Domain;

public class Pedido {
    private int id ;
    private String estado;
    private String fecha;


    //Constructor con parametros
    public Pedido (int id, String estado, String fecha){
        this.id = id;
        this.estado = estado;
        this.fecha = fecha;
    }




    //Methodost

    public void realizarPedido(){

    }

    public void cambiarEstado(String estado){
     this.estado = estado;
    }

    public void calcularTotal(){

    }

    public void generarQr(){

    }

   //SETTS GETTS


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
}
