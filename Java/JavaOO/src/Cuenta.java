public class Cuenta {
    private double saldo;
    private int agencia;
    private int numero;
    Cliente titular;
    private static int total = 0;
    public Cuenta(int agencia){
        if (agencia <= 0){
            System.out.println("No se permite 0");
            this.agencia = 1;
        } else {
            this.agencia = agencia;
        }
        total++;
        System.out.println("Total de cuentas: " + total);
    }
    public void depositar(double valor){
        this.saldo += valor;
    }
    public boolean retirar(double valor){
        if (this.saldo >= valor) {
            this.saldo -= valor;
            return true;
        }
        return false;
    }
    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.saldo -= valor;
            cuenta.depositar(valor);
            return true;
        }
        return false;
    }
    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setAgencia(int agencia){//EL constructor nos obliga a dar los parametros requeridos y asi nos debemos de dar una idea de que set o get necesitamos dependiendo de nuestro proyecto
        if (agencia > 0){
            this.agencia = agencia;
        } else {
            System.out.println("No estan permitidos valores negativos");
        }
    }

    public int getAgencia() {
        return agencia;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public Cliente getTitular() {
        return titular;
    }
}
