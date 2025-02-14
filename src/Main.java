public class Main {
    public static void main(String[] args) {

        Avaliacao estudante1 = new Avaliacao();
        Avaliacao estudante2 = new Avaliacao(7, 4 , 10);
        estudante1.nota1 = 7;
        estudante1.nota2 = 4;
        estudante1.nota3 = 10;

        System.out.println("Media aritmetica do Estudante1  " + estudante1.MediaAritmetica());
        System.out.println("Media aritmetica do Estudante2 " + estudante2.MediaAritmetica());
        System.out.println("/");

        Aluno a1 = new Aluno("Eduardo", "Engenharia de Software", new Avaliacao(9,10,3));
        a1.info();
        System.out.println("/");

        Conta c1 = new Conta(111, "Eduardo", 2000, 500);
        c1.info();
        c1.sacar(200);
        c1.deposito(500);
        c1.info();

        System.out.println("/");
        Conta c2 = new Conta(222, "Vinicius", 2000, 500);
        c2.transferir(c1, 2000);
        c1.info();
        System.out.println("//");
        c2.info();





































    }
}