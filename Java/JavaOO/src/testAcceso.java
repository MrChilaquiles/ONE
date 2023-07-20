public class testAcceso {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(1);
        cuenta.setAgencia(-22);
        cuenta.depositar(500);
        cuenta.retirar(300);
        System.out.println(cuenta.getSaldo());
        System.out.println(cuenta.getAgencia());
    }
}
