public class Aluno {
    public String nome;
    public String curso;
    Avaliacao avaliacao;

    public Aluno(){}

    public Aluno(String nome, String curso, Avaliacao avaliacao){
        this.nome = nome;
        this.curso = curso;
        this.avaliacao = avaliacao;
    }

    void info(){
        System.out.println("Nome: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Media A: " + avaliacao.MediaAritmetica());
        System.out.println("Media P: " + avaliacao.MediaPonderada());
    }


}
