package abstractTest1Pack;
import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter greeting: ");
        String greetInput = scanner.nextLine(); // Use nextLine() for full input

        // Pass greeting to the constructor
        XYZ xyz = new XYZ(greetInput);
        xyz.FOO();
        System.out.println(xyz.DAY());
    }
}
