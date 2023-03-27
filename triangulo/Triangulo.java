import java.lang.Math;
public class Triangulo {
    private double a; 
    private double b;
    private double c;

    public Triangulo(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    } 
    
    public void setA(Double a){
        this.a = a;
    }
    public void setB(Double b){
        this.b = b;
    }
    public void setC(Double c){
        this.c = c;
    }
    
    public double getA() {
        return this.a;
    }
    public double getB() {
        return this.b;
    }
    public double getC() {
        return this.c;
    }

    public double getArea() {
        double P = ((this.a + this.b + this.c)/2);
        double area  = Math.sqrt(P*(P-this.a)*(P-this.b)*(P-this.c));
        return area;
    }
}