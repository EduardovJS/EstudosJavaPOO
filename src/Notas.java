public class Notas {
    private double nota1;
    private  double nota2;

    void setNota1(double nota){
        if(nota == 0 || nota>10){
            System.out.println("Nota inválida");
            return;
        }
        nota1 = nota;
    }

    void setNota2(double nota){
        if(nota == 0 || nota>10){
            System.out.println("Nota inválida");
            return;
        }
        nota2 = nota;
    }

    double getNota1(){
        return nota1;
    }

    double getNota2(){
        return nota2;
    }


     void resultado(){
       double media = (nota1+ nota2) /2;
       if(media < 4) {
          System.out.println("Reprovado");
       } else if(media < 7) {
           System.out.println("Exame Final");
       }
       else{
           System.out.println("Aprovado");
       }
    }





}
