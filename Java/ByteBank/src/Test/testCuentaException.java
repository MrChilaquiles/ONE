package Test;

import Modelo.Cuenta;
import Modelo.CuentaAhorros;

public class testCuentaException {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123,23322);
        cuenta.depositar(300);
        cuenta.saca(310);
    }
}
