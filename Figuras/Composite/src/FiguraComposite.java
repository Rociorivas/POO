import java.util.*;

public class FiguraComposite implements Figura {
    private List<Figura> componentes;

    public FiguraComposite(){
        componentes = new ArrayList<>();
    }

    public void addFigura(Figura f){
        componentes.add(f);
    }


    @Override
    public double superficie() {
        double resultado = 0;
        for (Figura figura : componentes){
            resultado += figura.superficie();
        }
        return resultado;
    }
}
