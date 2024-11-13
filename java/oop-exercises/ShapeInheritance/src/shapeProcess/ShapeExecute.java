package shapeProcess;

import shapePack.Square;
import shapePack.SemiCircle;
import java.util.Scanner;

public class ShapeExecute {
    public static void main(String[] args) {
        Square square = new Square();
        SemiCircle semicircle = new SemiCircle();

        // Display hierarchy using square object
        square.printShape();
        square.printRectangle();
        square.printSquare();

        Scanner scanner = new Scanner(System.in);

        // Calculate area of Square
        System.out.println("\nArea of Square");
        System.out.print("Enter the measure of a side: ");
        double side = scanner.nextDouble();
        System.out.println("RESULT: Area of Square= " + square.calculateArea(side));

        // Calculate area of Rectangle
        System.out.println("\nArea of Rectangle:");
        System.out.print("Enter the measure of length: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the measure of breadth: ");
        double breadth = scanner.nextDouble();
        System.out.println("RESULT: Area of Rectangle= " + square.calculateArea(length, breadth));

        System.out.println("\n----");

        // Display hierarchy using semicircle object
        semicircle.printShape();
        semicircle.printSemiCircle();
        semicircle.printCircle();

        scanner.close();
    }
}
