import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cofre {
    private ArrayList<Moeda> moedas = new ArrayList<>();

    void add(Moeda m){
        moedas.add(m);
    }

   public double calcularTotal(){
        double total = 0;
        for(Moeda m: moedas){
            total+= m.getValor();
        }
        return total;
   }





}
