package app.Domain;

public class Administrador extends Usuario{

    private String rol;

    public Administrador(){
    }

    //CONSTRUCTOR QUE INICIA MIS DATOS
    public Administrador(int id, String nombre, String correo, String contrasena, String telefono,
                         boolean estado, String rol)
    {
        super(id, nombre, correo, contrasena, telefono, estado);
        this.rol = rol;
    }

//setters and getters para usar datos protegidos

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
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

    private void gestionarRestaurantes(Restaurante r){

    }

    private void gestionarProductos(Restaurante r, Producto p){

    }

    private void verReportePagos(){

    }

}
