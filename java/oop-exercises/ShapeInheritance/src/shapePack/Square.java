package shapePack;

public class Square extends Rectangle {
    public void printSquare() {
        System.out.println("This is Square. Subclass of Rectangle");
    }

    // Overridden method to calculate the area of the square
    public double calculateArea(double side) {
        return side * side;
    }
}
