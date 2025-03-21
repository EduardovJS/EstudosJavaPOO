public class Autor {
    private String nome;
    private String email;
    private String nacionalidade;

    public Autor(String nome, String email, String nacionalidade){
       this.nome = nome;
       this.email = email;
       this.nacionalidade = nacionalidade;
    }

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }

    public String getNacionalidade(){
        return nacionalidade;
    }
    public void setNacionalidade(String email){
        this.nacionalidade = email;
    }

    void info(){
        System.out.println("Nome Autor: " + nome);
        System.out.println("Nacionalidade: " + nacionalidade);
        System.out.println("Email: " + email);
    }
}
