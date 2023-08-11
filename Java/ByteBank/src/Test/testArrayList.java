package Test;

import Modelo.Cuenta;
import Modelo.CuentaCorriente;
import java.util.ArrayList;

public class testArrayList {
    public static void main(String[] args) {
        ArrayList<Cuenta> lista = new ArrayList(); // <> Fuerza el array a que acepte solo un tipo de objeto
        Cuenta cc = new CuentaCorriente(12,34);
        Cuenta cc2 = new CuentaCorriente(124,334);
        Cuenta cc3 = new CuentaCorriente(12,34);
        // El array evalua conforme a las referencias, por eso se crea dos veces la mis ma cuenta
        lista.add(cc);
        lista.add(cc2);
        Cuenta obtenerCuenta = (Cuenta) lista.get(0); // El catch sirve para determinar un ipo de objeto
        System.out.println(obtenerCuenta);
        for (int i = 0; i < lista.size(); i++){
            System.out.println(lista.get(i));
        }
        // Por cada cuenta en la lista imprime cuenta
        for (Cuenta cuenta : lista){
            System.out.println(cuenta);
        }
        boolean contiene = lista.contains(cc);
        // Se compara por referencia
        if (contiene) {
            System.out.println("Si, es igual (equals)");
        }
        // Se compara por valares
        if (cc.esIgual(cc3)) {
            System.out.println("Si, son iguales");
        }
    }
}
