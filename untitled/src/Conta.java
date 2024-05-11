public class Conta {
    private int numero;
    private String agencia;
    private String cliente;
    private double saldo;

    public Conta(int numero, String agencia, String cliente, double saldo) {
        this.numero = numero;
        this.agencia = agencia;
        this.cliente = cliente;
        this.saldo = saldo;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public int getNumero() {
        return this.numero;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public String getCliente() {
        return this.cliente;
    }
}
