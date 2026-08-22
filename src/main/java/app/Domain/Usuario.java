package app.Domain;

public class Usuario {

    //Definimos las variables que usaremos en la plantilla Usuario//

    private int id;
    private String nombre;
    private String correo;
    private String contrasena;
    private String telefono;
    private boolean estado;

    //--------------------------------------------------

    //CONSTRUCTOR
    public Usuario() {

    }

    //CONSTRUCTOR QUE INICIA MIS DATOS
    public Usuario(int id, String nombre, String correo, String contrasena, String telefono, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.correo = correo;
        this.contrasena = contrasena;
        this.telefono = telefono;
        this.estado = estado;
    }

    //setters and getters para usar datos protegidos

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

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    //Methods

    public void create(){

    };
    public void selectAll(){

    }
    public void selectById(int id){

    }
    public void update(){

    }
    public void deleteById(int id){

    }

    private void selectState(int id){

    }


    //-------------------------------------------------
}
