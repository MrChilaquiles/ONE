package Test;

import Modelo.Cuenta;
import Modelo.CuentaCorriente;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class testOrLis {
    public static void main(String[] args) {
        Cuenta cc1 = new CuentaCorriente(1332,3);
        cc1.depositar(332.0);
        Cuenta cc2 = new CuentaCorriente(2,2);
        cc2.depositar(132.0);
        Cuenta cc3 = new CuentaCorriente(1,43);
        cc3.depositar(345.0);
        Cuenta cc4 = new CuentaCorriente(132,433);
        cc4.depositar(456.0);

        List<Cuenta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);
        //Antes de ordenar
        System.out.println("Antes de ordenar");
        for (Cuenta cuenta : lista){ //Por cada cuenta en la lista imprime cuenta
            System.out.println(cuenta);
        }
        //Ordenar las cuentas
        Comparator<Cuenta> comparator = new OrdenarPorNdeCuenta();
        lista.sort(comparator);
        System.out.println("Despues de la comparacion");
        for (Cuenta cuenta : lista){ //Por cada cuenta en la lista imprime cuenta
            System.out.println(cuenta);
        }
    }
    public static class OrdenarPorNdeCuenta implements Comparator<Cuenta> {
        @Override
        public int compare(Cuenta o1, Cuenta o2) {
            /**if (o1.getNumero() == o2.getNumero()) { //Forma basica
                return 0;
            } else if (o1.getNumero() > o2.getNumero()) {
                return 1;
            } else {
                return -1;
            }**/
            return Integer.compare(o1.getNumero(), o2.getNumero()); //Forma Wrapper
        }
    }
    public static class OrdenarPorNdeTitular implements Comparator<Cuenta>{

        @Override
        public int compare(Cuenta o1, Cuenta o2) {
            return o1.getTitular().getNombre().compareTo(o2.getTitular().getNombre());
        }
    }
}


