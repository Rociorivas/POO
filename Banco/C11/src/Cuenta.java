public abstract class Cuenta {
    private Double saldo;
    private Cliente cliente;

    public Cuenta(Double saldo, Cliente cliente) {
        this.saldo = saldo;
        this.cliente = cliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




    public void depositarEfectivo(Double saldo) {
     this.saldo += saldo;

    }

    public abstract void extraerEfectivo(Double monto);

    @Override
    public String toString() {
        return "Cuenta{" +
                "saldo=" + saldo +
                ", cliente=" + cliente +
                '}';
    }
}
