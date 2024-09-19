package userinfo;
import java.util.Scanner;

public class LabTwo {

    static class User {
    	
        // Private fields to store the user's name, age, and hobby
        private String name;
        private int age;
        private String hobby;

        // 2. Constructor that accepts name and age
        public User(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 3. Method Overloading

        // Method to display name and age
        public void displayInfo() {
            System.out.println("Name: " + name + ", Age: " + age);
        }

        // Overloaded method to display name, age, and hobby
        public void displayInfo(String hobby) {
            this.hobby = hobby;
            System.out.println("Name: " + name + ", Age: " + age + ", Hobby: " + hobby);
        }

        // Overloaded method to display years until retirement
        public void displayInfo(int yearsUntilRetirement) {
            System.out.println(name + " will retire in " + yearsUntilRetirement + " years.");
        }
    }

    public static void main(String[] args) {
        // 4. Input and Output
        Scanner scanner = new Scanner(System.in);


        System.out.print("Enter your name: ");
        String name = scanner.nextLine();


        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the leftover newline


        System.out.print("Enter your hobby: ");
        String hobby = scanner.nextLine();

        // Creating an instance of the User class
        User user = new User(name, age);

        // Calling displayInfo to show the user's name and age
        user.displayInfo();

        // Calling displayInfo to show the user's name, age, and hobby
        user.displayInfo(hobby);

        // 5. Calculating years to retirement
        int retirementAge = 65;
        int yearsUntilRetirement = retirementAge - age;

        // Call displayInfo to show how many years until the user retires
        user.displayInfo(yearsUntilRetirement);

        // Closing the scanner to prevent resource leaks
        scanner.close();
    }
}
