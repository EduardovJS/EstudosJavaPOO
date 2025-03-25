public class Pessoa implements  Imprimivel{
    String nome;
    String cpf;
    public Pessoa(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }
    @Override
    public void Imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("Cpf: " + cpf);
    }
}
