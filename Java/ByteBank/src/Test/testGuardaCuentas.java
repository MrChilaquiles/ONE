package Test;
import Modelo.Cuenta;
import Modelo.CuentaCorriente;
import Modelo.guardaCuentas;
public class testGuardaCuentas {
    public static void main(String[] args) {
        guardaCuentas guardaCuentas = new guardaCuentas();
        Cuenta cc = new CuentaCorriente(11, 23);
        guardaCuentas.adicionar(cc);
        Cuenta cc2 = new CuentaCorriente(13, 234);
        guardaCuentas.adicionar(cc2);
        guardaCuentas.obtener(1);
        System.out.println(guardaCuentas.obtener(0));
        System.out.println(guardaCuentas.obtener(1));
    }
}
