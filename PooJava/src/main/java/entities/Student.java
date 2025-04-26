package entities;
public class Student {

    private double nota1;
    private double nota2;
    private double nota3;

    public Student(){

    }
    public void setNota1(double nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(double nota3) {
        this.nota3 = nota3;
    }

    public double resultado() {
        return nota1 + nota2 + nota3;
    }

    public boolean aprovacao() {
        return resultado() > 60;

    }
    public  double pontosfaltantes(){
        double faltantes = 0;
        if (!aprovacao()){
            faltantes = 100 -resultado();
        }
        return faltantes;
    }

    @Override
    public String toString() {
        return String.format("Final grade: " + resultado() + "\n"+
               String.format ((aprovacao())? "Pass": ("Failed\n" + "Missing " +pontosfaltantes() + " points")));
    }
}
