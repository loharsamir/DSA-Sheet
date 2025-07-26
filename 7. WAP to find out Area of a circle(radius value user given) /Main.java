import java.util.Scanner;

public class Main {
    public static double calculateArea(double radius) {
       return Math.PI*radius*radius;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the radius of the circle: ");
        double radius = sc.nextDouble();

        double area = calculateArea(radius);
        System.out.println("Area of the circle: " + area);
    }
}