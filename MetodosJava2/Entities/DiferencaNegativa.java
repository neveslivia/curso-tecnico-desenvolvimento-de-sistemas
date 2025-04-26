package entities;

public class DiferencaNegativa {
    public int num1;
    public int num2;

    public DiferencaNegativa() {

    }

    public int diferenca(){
       return  num1-num2;
    }
    public int negativa(){
        if (diferenca()<0){
            System.out.println("A diferença entre os números é negativa!");

        }else {
            System.out.println("A diferença dos números é positiva!");
        }


        return 0;
    }

    @Override
    public String toString() {
        return
                String.format(String.valueOf(negativa()));
    }
}
