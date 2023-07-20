package Test;

import Modelo.Contador;
import Modelo.Funcionario;
import Modelo.Gerente;
import Modelo.controlBonificacion;

public class testRef {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        Gerente jimena = new Gerente();
        Contador alex = new Contador();
        alex.setSalario(5000);
        diego.setSalario(2000);
        jimena.setSalario(10000);
        controlBonificacion controlBonificacion = new controlBonificacion();
        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alex);
    }
}
