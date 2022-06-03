public class CajaDeAhorro extends Cuenta {
    private Double tasaInteres;

    public CajaDeAhorro(Double saldo, Cliente cliente, Double tasaInteres) {
        super(saldo, cliente);
        this.tasaInteres = tasaInteres;
    }

    public Double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(Double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }



    @Override
    public void extraerEfectivo(Double monto) {

        if (getSaldo() - monto >= 0) {
            setSaldo(getSaldo() - monto);
        }
    }
    public Double cobrarInteres(){
        return getSaldo()*tasaInteres;
    }

    @Override
    public String toString() {
        return  "CajaDeAhorro{" + super.toString() +
                "tasaInteres=" + tasaInteres +
                '}';
    }
}
