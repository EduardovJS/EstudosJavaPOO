public class Conta {
    public int numero;
    public String titular;
    public double saldo;
    public double limite;

    public Conta(){}

    public Conta(int numero, String titular, double saldo, double limite){
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limite = limite;
    }

    public boolean sacar (double valor){
        if(valor >  limite || valor > saldo || valor <=0){
            return false;
        }
        saldo -= valor;
        return true;
    }
    public boolean deposito (double valor){
        if(valor <= 0) {
            return false;
        }
        saldo += valor;
        return true;
    }
    public boolean transferir (Conta contadestino, double valor){
        if(this.saldo >= valor){
            this.saldo -= valor;
            contadestino.saldo += valor;
            return true;
        } else{
            return false;
        }
    }


    void info(){
        System.out.println("Numero da conta: " + numero);
        System.out.println("Titular da conta: " + titular);
        System.out.println("Saldo da conta: " + saldo);
        System.out.println("Limite da conta: " + limite);
    }




}
