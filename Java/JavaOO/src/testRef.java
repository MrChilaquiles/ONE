public class testRef {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("41234234");
        diego.setTelefono("3319415606");
        Cuenta cuentaDiego = new Cuenta(1);
        cuentaDiego.setAgencia(1);
        cuentaDiego.titular = diego;
        cuentaDiego.titular.setNombre("Diego");
        System.out.println(cuentaDiego.titular.getNombre());
    }
}