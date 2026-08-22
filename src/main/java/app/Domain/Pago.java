package app.Domain;

public class Pago {
    private int id;
    private double monto;
    private String metodo;

    //constructor parametro
    public Pago (int id, double monto, String metodo){
        this.id = id;
        this.monto = monto;
        this.metodo = metodo;
    }

    //getter and ,setter


    public int getId() {
        return id;
    }

    public double getMonto() {
        return monto;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    //methods
    public void realizarPedido(){

    }

    public void cambiarEstado(){

    }

    public void calcularEstado(){

    }

    public void generarQr(){

    }


}
