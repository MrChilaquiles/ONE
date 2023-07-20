package Modelo;

public class Administrador extends Funcionario implements Autenticable{
    private Util util;
    public Administrador(){
        this.util = new Util();
    }
    @Override
    public double getBonificacion(){
        return this.getSalario();
    }
    @Override
    public void setClave(String clave) {
        this.util.setClave(clave);
    }
    @Override
    public boolean inisiarSesion(String clave) {
        return this.util.iniciarSesion(clave);
    }
}
