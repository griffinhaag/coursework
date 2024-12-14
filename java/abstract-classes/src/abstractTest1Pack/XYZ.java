package abstractTest1Pack;

public class XYZ extends ABC {
    private String greeting;

    // Constructor to initialize greeting
    public XYZ(String greeting) {
        this.greeting = greeting;
    }

    @Override
    String DAY() {
        return greeting + " THURSDAY";
    }
}
