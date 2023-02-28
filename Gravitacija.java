import java.util.Scanner;

public class Gravitacija{
    
    static final double M = 5.972e24;
    static final double R = 6.371e6;
    static final double C = 6.674e-11;

    public static void main(String[] args) {
        System.out.println("OIS!!!!!!!");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        System.out.printf("%.2f", gravitationalAcceleration(height));
    }
    
    private static double calculate(double height){
        return (C * M)/Math.pow(R + height,2);
    }
}