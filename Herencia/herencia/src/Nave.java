public class Nave extends Objeto {
    private double velocidad;
    private int vida;

    public Nave (int x, int y, char d, double vel){
        super(x, y, d);
        this.velocidad=vel;
    }
    @Override
    public void irA(int x, int y , char d){
        this.setDireccion(d);
        this.setPosy(y);
        this.setPosx(x);
    }

    public void girar(char d){
        this.setDireccion(d);
    }

    public void restaVida(int v){
        this.vida-=v;
    }
}
