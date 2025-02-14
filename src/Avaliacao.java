public class Avaliacao {
    public double nota1;
    public double nota2;
    public double nota3;

    Avaliacao(){

    }

    public Avaliacao(double nota1, double nota2, double nota3){
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }
    public  double MediaAritmetica(){
        return (nota1 + nota2 + nota3) / 3;
    }
    public  double MediaPonderada(){
        return (nota1 * 2  + nota2 * 3 + nota3 * 4) / 9;
    }
}
