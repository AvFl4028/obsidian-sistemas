public class Cajero {
    private double saldo;

    public Cajero(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double saldo) {
        if (saldo > 0)
            this.saldo += saldo;
    }

    public void retirar(double saldo) throws SaldoInsuficienteException {
        if (saldo > this.saldo)
            throw new SaldoInsuficienteException("El saldo es insuficiente");
        this.saldo -= saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
