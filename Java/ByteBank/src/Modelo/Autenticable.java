package Modelo;

public interface Autenticable{
    public void setClave(String clave);
    public boolean inisiarSesion(String clave);
}
