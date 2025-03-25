public abstract class Computador {
    int gbMemoria;
    int numProcessadores;
    abstract double calculaValor();

    public Computador(int gbMemoria, int numProcessadores) {
        this.gbMemoria = gbMemoria;
        this.numProcessadores = numProcessadores;
    }
}
