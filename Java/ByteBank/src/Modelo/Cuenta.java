package Modelo;

/**
 * @version 1.0
 * @author RGGA2000
 */
public abstract class Cuenta {
    /*  public          visible en cualquier paquete
        default         visible en la clase y en cualquier otro miembro del mismo paquete y para cualquier hijo
        protected       visible en la clase y en cualquier otro miembro del mismo paquete
        private         visible solo en clase
     */
    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular = new Cliente();
    private static int total = 0;

    /**
     * Instancia una cuenta usando agencia y numero como parametros
     * @param agencia
     * @param numero
     */
    public Cuenta(int agencia, int numero){
        this.agencia = agencia;
        this.numero = numero;
        Cuenta.total ++;
    }
    public abstract void depositar(double valor);
    /**
     * Este metodo retira dinero de la cuenta y si ocurre un error devulve una excepcion
     * @param valor
     */
    public void saca(double valor){
        if (this.saldo < valor) {
            throw new SaldoInsuficienteException("No tienes saldo");
        }
        this.saldo -= valor;
    }
    public boolean transferir(double valor, Cuenta cuenta){
        if (this.saldo >= valor){
            this.saca(valor);
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
