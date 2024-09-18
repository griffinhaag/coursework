using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace ResearchandDev
{
    internal class User
    {
        // Private fields to store the user's name, age, and hobby
        private string name;
        private int age;
        private string hobby;

        // Constructor that accepts name and age
        public User(string name, int age)
        {
            this.name = name;
            this.age = age;
        }

        // Method to display name and age
        public void DisplayInfo()
        {
            Console.WriteLine($"Name: {name}, Age: {age}");
        }

        // Overloaded method to display name, age, and hobby
        public void DisplayInfo(string hobby)
        {
            this.hobby = hobby;
            Console.WriteLine($"Name: {name}, Age: {age}, Hobby: {hobby}");
        }

        // Overloaded method to display retirement information
        public void DisplayInfo(int yearsUntilRetirement)
        {
            Console.WriteLine($"{name} will retire in {yearsUntilRetirement} years.");
        }

        static void Main(string[] args)
        {
            // Ask the user for their name, age, and hobby
            Console.Write("Enter your name: ");
            string name = Console.ReadLine();

            Console.Write("Enter your age: ");
            int age = int.Parse(Console.ReadLine());

            Console.Write("Enter your hobby: ");
            string hobby = Console.ReadLine();

            // Creating an instance of the User class
            User user = new User(name, age);

            // Displaying the user's name, age, and hobby
            user.DisplayInfo(hobby);

            // Calculating years until retirement
            int retirementAge = 65;
            int yearsUntilRetirement = retirementAge - age;

            // Displaying how many years are left for the user to retire
            user.DisplayInfo(yearsUntilRetirement);

            // Keep the console window open
            Console.ReadLine();
        }
    }
}
