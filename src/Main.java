public class Main {
    public static void main(String[] args) {
        Cofre c = new Cofre();
        c.add(new Moeda("Euro", 0.5));
        c.add(new Moeda("Euro", 1));
        System.out.println("Total  de moedas: " + c.calcularTotal());
    }
}