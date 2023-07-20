public class testConection {
    public static void main(String[] args) throws Exception{
        /*Conection con = new Conection();
        try{
            con.leerDatos();
        } catch (IllegalStateException exception){
            System.out.println("Recibiendo exception");
            exception.printStackTrace();
        } finally {
            System.out.println("Ejecutando finally");
            con.cerrar();
        }*/
        try (Conection con = new Conection()){
            con.leerDatos();
        } catch (IllegalStateException exception){
            System.out.println("Ejecutando catch");
            exception.printStackTrace();
        }
    }
}
