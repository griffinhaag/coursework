package shapePack;

public class Rectangle extends Shape {
    public void printRectangle() {
        System.out.println("This is Rectangle. Subclass of Shape");
    }

    // Method to calculate the area of the rectangle
    public double calculateArea(double length, double breadth) {
        return length * breadth;
    }
}
