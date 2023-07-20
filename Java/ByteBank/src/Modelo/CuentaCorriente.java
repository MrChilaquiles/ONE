package Modelo;

public class CuentaCorriente extends Cuenta{
    public CuentaCorriente(int agencia, int numero){
        super(agencia, numero);
    }

    @Override
    public void depositar(double valor) {

    }

    @Override
    public void saca(double valor) {
        double comision = .2;
        super.saca(valor + comision);
    }
}
