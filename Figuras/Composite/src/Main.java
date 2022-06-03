public class Main {
    public static void main(String[] args) {
//        Rectangulo r1 = new Rectangulo(5,4);
//        Circulo c1 = new Circulo(1);
//        Circulo c2 = new Circulo(1);
//        Circulo c3 = new Circulo(1);
//
//        FiguraComposite vagon = new FiguraComposite();
//        vagon.addFigura(c1);
//        vagon.addFigura(c2);
//        vagon.addFigura(c3);
//        System.out.println(vagon.superficie());

        Rectangulo r2 = new Rectangulo(6,4);
        Circulo c4 = new Circulo(1);
        Circulo c5 = new Circulo(1);
        Triangulo t1 = new Triangulo(2,2);

        FiguraComposite loco = new FiguraComposite();
        loco.addFigura(r2);
        loco.addFigura(c4);
        loco.addFigura(c5);
        loco.addFigura(t1);

        System.out.println(loco.superficie());




    }
}
