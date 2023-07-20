public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(2);
        miCuenta.setSaldo(300);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());
        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());
        //Nueva cuenta
        Cuenta cuentaEsme = new Cuenta(1);
        cuentaEsme.depositar(1000);
        cuentaEsme.transferir(400,miCuenta);
        System.out.println(cuentaEsme.getSaldo());
        System.out.println(miCuenta.getSaldo());
    }
}
