package abstraction3;

import java.util.Scanner;

public class Utility {
    private Scanner scanner = new Scanner(System.in);

    // Prompt user if they have a name for the animal
    public String checkForName(String animalType) {
        System.out.print("Do you have a name for " + animalType + "? (Y/N): ");
        String response = scanner.nextLine().trim().toLowerCase();
        if (response.equals("y")) {
            System.out.print("Enter the name: ");
            return scanner.nextLine().trim();
        }
        return null;
    }

    // Create a Lion object based on the name
    public Lion getLionObject(String lionName) {
        if (lionName == null) {
            return new Lion();
        } else {
            return new Lion(lionName);
        }
    }

    // Create a Giraffe object based on the name
    public Giraffe getGiraffeObject(String giraffeName) {
        if (giraffeName == null) {
            return new Giraffe();
        } else {
            return new Giraffe(giraffeName);
        }
    }

    // Create a Bear object based on the name
    public Bear getBearObject(String bearName) {
        if (bearName == null) {
            return new Bear();
        } else {
            return new Bear(bearName);
        }
    }
}
