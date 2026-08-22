package app.Domain;

public class Empleado extends Usuario{

    private String turno;

public Empleado(){
}

//CONSTRUCTOR QUE INICIA MIS DATOS
public Empleado(int id, String nombre, String correo, String contrasena, String telefono,
            boolean estado, String turno)
{
    super(id, nombre, correo, contrasena, telefono, estado);
    this.turno = turno;
}

//setters and getters para usar datos protegidos

    public String getTurno() {
        return turno;
}

    public void setTurno(String turno) {
        this.turno = turno;
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

    private void verPedidos(int id){

    }

}
