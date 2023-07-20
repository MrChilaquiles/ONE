package Modelo;

public class SistemaInterno {
    private String clave = "12345";
    public boolean autentica(Autenticable gerente){
        boolean puedelogear = gerente.inisiarSesion(clave);
        if (puedelogear){
            System.out.println("Login exitoso");
            return true;
        } else {
            System.out.println("Error login");
            return false;
        }
    }
}
