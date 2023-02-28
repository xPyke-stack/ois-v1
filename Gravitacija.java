import java.util.Scanner;

public class Gravitacija{
    public static void main(String[] args) {
        System.out.println("OIS!!!!!!!");
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();

        System.out.printf("%.2f", calculate(height));
    }
}