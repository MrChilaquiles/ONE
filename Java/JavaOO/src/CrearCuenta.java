public class CrearCuenta {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(1);
        primeraCuenta.setSaldo(1000);
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(1);
        segundaCuenta.setSaldo(500);
        System.out.println(segundaCuenta.getSaldo());
    }
}
