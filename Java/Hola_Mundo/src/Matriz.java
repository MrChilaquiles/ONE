public class Matriz {

    public static void main(String[] args) {

        for (int fila = 0; fila <= 10; fila++){
            for (int col = 0; col < fila; col++){
                System.out.println("*");
            }
            System.out.println();
        }
    }
}