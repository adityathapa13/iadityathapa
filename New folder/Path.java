import java.math.*;
public class Path {
    public static void main(String[] args) {
        double a = 5;
        double b= 6;
        double c = a+b;
        double s = Math.pow(c, 2);
        double d = Math.pow(c, 3);
        double e = Math.pow(a, 2)+ Math.pow(b, 2);
        double f = Math.pow(a, 3)+ Math.pow(b, 3);
        System.out.println("square = "+s);
        System.out.println("square = "+d);
        System.out.println("cube   = "+e);
        System.out.println("cube   = "+f);
    }
    
}
