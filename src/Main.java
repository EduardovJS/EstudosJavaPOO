public class Main {
    public static void main(String[] args) {
        Desktop compA = new Desktop(8,4,600);
        Notebook compB = new Notebook(8, 4, 15);

        System.out.println("Valor: " + compA.calculaValor());
        System.out.println("Valor: " + compB.calculaValor());
    }
}