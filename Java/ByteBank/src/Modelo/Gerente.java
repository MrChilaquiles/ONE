package Modelo;

public class Gerente extends Funcionario implements Autenticable {
    private Util util;
    public Gerente(){
        this.util = new Util();
    }
    @Override
    public double getBonificacion() {
        return super.getSalario() + this.getBonificacion()*.05;// Super nos ayuda a acceder a los metedos de la clase superior
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
