package Test;

import Modelo.CuentaAhorros;
import Modelo.CuentaCorriente;

public class testCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = new CuentaCorriente(1,12);
        CuentaAhorros ca = new CuentaAhorros(2,34);
        cc.depositar(2000);
        cc.transferir(1000,ca);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
