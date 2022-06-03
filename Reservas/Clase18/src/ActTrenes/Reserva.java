package ActTrenes;

import java.util.ArrayList;

public class Reserva {
    private int codigo;
    private Estacion destino;
    private Estacion partida;
    private int cantPersonas;
    private ArrayList<Estacion> estaciones;
    private double precioBoleto=50;

    public Reserva(int codigo, Estacion destino, Estacion partida, int cantPersonas, ArrayList<Estacion> estaciones) {
        this.codigo = codigo;
        this.destino = destino;
        this.partida = partida;
        this.cantPersonas = cantPersonas;
        this.estaciones = estaciones;
        precioBoleto=50;
    }

    public double recaudacionReserva(int cantPersonas){
        double recaudacion = precioBoleto * cantPersonas;
        if (this.destino.isCabecera() && this.partida.isCabecera()){
            recaudacion = recaudacion * 0.80;
        }
        return recaudacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Estacion getDestino() {
        return destino;
    }

    public void setDestino(Estacion destino) {
        this.destino = destino;
    }

    public Estacion getPartida() {
        return partida;
    }

    public void setPartida(Estacion partida) {
        this.partida = partida;
    }

    public int getCantPersonas() {
        return cantPersonas;
    }

    public void setCantPersonas(int cantPersonas) {
        this.cantPersonas = cantPersonas;
    }

    public double getPrecioBoleto() {
        return precioBoleto;
    }

    public void setPrecioBoleto(double precioBoleto) {
        this.precioBoleto = precioBoleto;
    }
}
