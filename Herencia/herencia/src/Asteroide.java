public class Asteroide extends Objeto{
    private int lesion;

    public Asteroide (int x, int y, char dir, int lesion){
        super(x, y, dir);
        this.lesion=lesion;
    }

    @Override
    public void irA(int x, int y , char d){
        this.setDireccion(d);
        this.setPosy(y);
        this.setPosx(x);
    }
}
