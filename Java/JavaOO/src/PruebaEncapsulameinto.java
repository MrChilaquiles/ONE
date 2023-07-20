public class PruebaEncapsulameinto {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(3);
        Cliente cliente = new Cliente();
        cliente.setNombre("Diego");
        cliente.setDocumento("fasdasda");
        cuenta.setTitular(cliente);
        System.out.println(cliente.getNombre());
        System.out.println(cliente.getDocumento());
        System.out.println(cuenta.getTitular().getNombre());
    }
}
