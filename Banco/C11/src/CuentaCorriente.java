public class CuentaCorriente extends Cuenta {
    private Double montoAutorizado;

    public CuentaCorriente(Double saldo, Cliente cliente, Double montoAutorizado) {
        super(saldo, cliente);
        this.montoAutorizado = montoAutorizado;
    }

    public Double getMontoAutorizado() {
        return montoAutorizado;
    }

    public void setMontoAutorizado(Double montoAutorizado) {
        this.montoAutorizado = montoAutorizado;
    }

    @Override
    public void extraerEfectivo(Double monto) {
        if(getSaldo()-monto >= 0){
            setSaldo(getSaldo()-monto);
        } else if(getSaldo()+montoAutorizado-monto >= 0){

            montoAutorizado = getSaldo()+montoAutorizado - monto;
            setSaldo(0.0);

        }
    }

    @Override
    public String toString() {
        return super.toString() + montoAutorizado;
    }
}
