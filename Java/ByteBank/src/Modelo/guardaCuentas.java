package Modelo;

public class guardaCuentas {
    Cuenta[] cuenta = new Cuenta[10];
    int indice = 0;
    public void adicionar(Cuenta cc) {
        cuenta[indice] = cc;
        indice++;
    }
    public Cuenta obtener(int indice){
        return cuenta[indice];
    }
}
