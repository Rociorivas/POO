public class Circulo implements Figura{
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double superficie() {
        return Math.PI*Math.pow(radio, 2);
    }
}
