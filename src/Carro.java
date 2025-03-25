public class Carro implements  Imprimivel {
    String marca;
    String cor;
    int portas;
    public Carro(String marca, String cor, int portas) {
        this.marca = marca;
        this.cor = cor;
        this.portas = portas;
    }
    @Override
    public void Imprimir() {
        System.out.println("Carro: " + marca + " Cor: " + cor + " Portas: " + portas);
    }
}
