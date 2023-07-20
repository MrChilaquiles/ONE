package Test;

import Modelo.Contador;
import Modelo.Funcionario;
import Modelo.Gerente;

public class testFuncionario {
    public static void main(String[] args) {
        Funcionario Roger = new Contador();
        Roger.setDocumento("sepaquedocumentoterngo123jjhj");
        Roger.setSalario(5000);
        Roger.setTipo(0);
        System.out.println(Roger.getSalario());
        System.out.println(Roger.getBonificacion());
        Gerente gerente = new Gerente();
        gerente.setSalario(6000);
        gerente.setTipo(1);
        gerente.setClave("estaEsLaClave");
        System.out.println(gerente.inisiarSesion("estaEsLaClave"));
        System.out.println(gerente.getBonificacion());
    }
}
