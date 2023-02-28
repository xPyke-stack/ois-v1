import java.util.Scanner;

public class Gravitacija{
    
    static final double M = 5.972e24;
    static final double R = 6.371e6;
    static final double C = 6.674e-11;

    private static double calculate(int height){
        return (C * M)/Math.pow(R + height,2);
    }
}