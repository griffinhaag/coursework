package firstlab;

public class firstlab {

	public static void main(String[] args) {
		// Simple print statements
		System.out.println("Hi, my name is Griffin");
		System.out.println("My favorite color is red");
		System.out.println("The current year is 2024");
		
		System.out.println("--------------------------");
		
		// Data types
		// Use int for whole numbers
		int age = 21;
		// Use float for decimals
		float height = 5.10f;
		// Use char when just using a single letter, string when doing a word..etc
		char favLetter = 'G';
		// No quotations when using a boolean
		// You can't do 'bool' you have to spell out boolean
		boolean doIlikeprogramming = true;
		
		System.out.println("I am " + age + " years old." + " My height is " + height + "." + " My favorite letter is " + favLetter + "." + " Do I LOVE programming? " + doIlikeprogramming);
		System.out.println("-----------------------------------------------------------------------------------------");
		/* a constant to store the value of Pi (3.14159) and calculate the area of a circle with a radius of 5
		using the formula
		*/
		final double PI = 3.14159;
		double radius = 5;
		double area = PI * radius * radius;
		System.out.println("The area of the circle is: " + area);
		
		// Data types
		// The S in string has to be capitalized for this to work
		String firstName = "griffin";
		/* The underscores improve clarity and makes it easier to read
		and Java ignores the underscores in runtime
		The L is for Long otherwise Java would treat the number as a int by default
		Any number abovd 3 billion the L is neccesary as opposed to an int (int's can store up to 2.14Billion)
		*/
		
		/*
		 * double in Java is a data type used to store floating-point numbers, 
		 * meaning numbers that have decimal points. 
		 * It is short for double-precision floating point, 
		 * which means it can represent both very large and very small numbers with a high degree of precision. 
		 * The double type is commonly used in scientific calculations or when you need to work with fractional values.
		 */
		long populationOfCity = 1_500_000L;
		double tempOfLocation = 24.5;
		// No quotations when using booleans
		boolean studentOrNo = true;
		// Using formatting to print out the population of the city with commas
		System.out.println(String.format("The population of the city is: %,d", populationOfCity));
		System.out.println("The person's name is " + firstName + "." + " The temp of the location is " + tempOfLocation + " celcius." + " And are they a student? " + studentOrNo);

		
		
		
		
		
		
		
		
	}

}
