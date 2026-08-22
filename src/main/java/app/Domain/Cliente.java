package app.Domain;

public class Cliente extends Usuario{

    private String direccion;

    public Cliente(){
    }

    //CONSTRUCTOR QUE INICIA MIS DATOS
    public Cliente(int id, String nombre, String correo, String contrasena, String telefono,
                         boolean estado, String direccion)
    {
        super(id, nombre, correo, contrasena, telefono, estado);
        this.direccion = direccion;
    }

//setters and getters para usar datos protegidos

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String rol) {
        this.direccion = direccion;
    }

    //Methods
    @Override

    public void create(){
        super.create();
    }

    @Override

    public void selectAll(){
        super.selectAll();
    }

    @Override

    public void selectById(int id){
        super.selectById(id);
    }

    @Override
    public  void update(){

        super.update();
    }

    @Override

    public void deleteById(int id){
        super.deleteById(id);
    }


    private void seleccionarProductos(Producto p){

    }

    private void realizarPedido(Restaurante r){

    }

    private void pagarPedido(Pedido p,Pago pg){

    }

    private void verEstadoPedido(Pedido p){

    }

}
