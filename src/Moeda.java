public class Moeda
{
    private double valor;
    private String nome;

    public Moeda(String nome, double valor){
        this.nome = nome;
        this.valor = valor;
    }
    public String getNome(){
        return nome;
    }
    public double getValor(){
        return valor;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setValor(double valor){
        this.valor = valor;
    }





}
