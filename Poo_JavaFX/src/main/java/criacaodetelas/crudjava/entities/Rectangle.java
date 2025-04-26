package criacaodetelas.crudjava.entities;

public class Rectangle {
    private double x;
    private  double y;

    public  Rectangle(){

    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public  double area(){
        return x * y;
    }
    public double Perimeter(){
        return 2*(x + y);
    }
    public double diagonal(){
        return Math.sqrt((x*x) + (y*y));
    }

    @Override
    public String toString() {
        return String.format("Area: %.2f \n",area())+
                String.format("Perimeter: %.2f \n",Perimeter())+
                String.format("Diagonal: %.2f", diagonal());
    }


}
