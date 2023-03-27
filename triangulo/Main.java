public class Main {
    public static void main(String[] args) {
        Triangulo A = new Triangulo(3.0, 4.0, 5.0);
        Triangulo B = new Triangulo(7.5, 4.5, 4.02);
        /*System.out.println(A.getArea()); 
        System.out.println(B.getArea());*/
        System.out.printf("%.2f", A.getArea());
        System.out.printf("%.2f", B.getArea());
    }
}