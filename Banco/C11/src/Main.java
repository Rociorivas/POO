public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente(25, "Arroyo", "34102587", "20-4156456-9");

        Cuenta cuenta1 = new CuentaCorriente(25.35, cliente, 45646.50);
        Cuenta cuenta2 = new CajaDeAhorro(25.35, cliente, 0.25);

        System.out.println(cuenta1.toString());
        cuenta1.depositarEfectivo(522.06);
        System.out.println(cuenta1.toString());




    }
}
