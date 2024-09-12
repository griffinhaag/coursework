using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Homework_02
{
    class main
    {
        static void Main(string[] args)
        {
            // Asking for the user's name
            Console.WriteLine("Enter your name: ");
            string name = Console.ReadLine();
            Console.WriteLine("Enter your favorite color: ");
            string color = Console.ReadLine();
            Console.Clear();
            Console.WriteLine("Hello, my name is " + name);

            // Prompting the user for their favorite color
            Console.WriteLine("My favorite color is " + color);

            // Prompting the user for their age
            Console.WriteLine("The current year is " + DateTime.Now.Year);
            Console.WriteLine("-------------");


            // Working with variables as well as floats (decimals), integers, booleans and strings

            Console.WriteLine("Enter your age: ");
            int age = Convert.ToInt32(Console.ReadLine());
            Console.WriteLine("Enter your height (ex: 5.10): ");

            // Using float.Parse to convert input to a float
            float height = float.Parse(Console.ReadLine());

            Console.WriteLine("Enter your favorite letter: ");
            string favletter = Console.ReadLine();

            // Ask the user if they like programming
            Console.WriteLine("Do you like programming? (True/False)");
            bool userResponse;
            if (bool.TryParse(Console.ReadLine(), out userResponse))
            {
                // Print out the user's response
                // Using formatting when presenting the response (instead of " " + )
                Console.WriteLine($"Do I enjoy programming?: {userResponse}");
            }
            else
            {
                // Handle invalid input
                Console.WriteLine("Invalid input. Please enter either 'True' or 'False'.");



            }

            Console.WriteLine("I am " + age + " years old");
            Console.WriteLine("My height is " + height + " feet.");
            Console.WriteLine("My favorite letter is " + favletter);
            // Read the user's input and convert it to a boolean

            // Declaring a constant for Pi
            const double Pi = 3.14159;

            // Defining the radius of the circle
            double radius = 5;

            // Calculating the area of the circle
            double area = Pi * Math.Pow(radius, 2);

            // Printing out the result
            Console.WriteLine("-----------");
            Console.WriteLine($"The area of the circle with radius {radius} is: {area}");

            // Data types
            Console.WriteLine("What is your name?: ");
            string firstname = Console.ReadLine();
            long citypop = 1500000;
            double temp = 30.5;
            bool student = true;
            Console.WriteLine("Your name is: " + firstname);
            // Using formatting to allow commas inbetween the number
            Console.WriteLine($"The city population is: \"{citypop:N0}\"");
            Console.WriteLine($"The temperature is: {temp}");
            Console.WriteLine("Are you a student? " + student);
            Console.ReadLine();

            /*
            Data types used:
            string, 
            long, 
            double,
            bool, 
            int, 
            const, 
            float
            */



        }
    }
}
