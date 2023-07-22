package Test;

public class testString {
    public static void main(String[] args) {
        String nombre = "Alura";
        System.out.println("Antes de replace: " + nombre);
        nombre = nombre.replace("A","a");
        nombre = nombre.concat(" esta bien");
        nombre = nombre.toUpperCase();
        nombre = nombre.toLowerCase();
        char letra = nombre.charAt(4);
        int index = nombre.indexOf("e");
        printLine("Despues de replace: " + nombre);
        printLine("Caracter encontrado: " + letra);
        printLine("Indice encontrado: " + index);
    }
    public static void printLine(Object valor){
        System.out.println(valor.toString());
    }
}
