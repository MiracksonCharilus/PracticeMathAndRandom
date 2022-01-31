import java.util.Locale;
import java.util.Scanner;
import java.util.Random;

public class PracticeMathAndRandom {

    public static Scanner keyboard = new Scanner(System.in);
    public static void main(String args[])
    {
        practiceMath();
        practiceRandom();
        practiceStrings();
    }

    public static void practiceMath()
    {

        //square root
        System.out.println("Whats a number to make a square root");
        int num = keyboard.nextInt();
        double answer = Math.sqrt(num);
        System.out.println("The answer is " + answer);

        //exponents
        System.out.println("Enter the first number for the exponent");
        int base = keyboard.nextInt();
        System.out.println("Enter what power do you want " + base + " to be at");
        int power = keyboard.nextInt();
        double eAnswer = Math.pow(base, power);
        System.out.println("The answer is " + eAnswer);


        //hypot
        System.out.println("What is the length of the base of the right triangle?");
        double triBase = keyboard.nextDouble();
        System.out.println("What is the height of the of the right triangle?");
        double triHeight = keyboard.nextDouble();
        //using pow and sqrt
        double longAnswer = Math.sqrt((Math.pow(triBase, 2) + (Math.pow(triHeight, 2))));
        //using hypot
        double shortAnswer = Math.hypot(triBase, triHeight);
        System.out.println("Using the pow/sqrt way the answer is " + longAnswer);
        System.out.println("Using the hypot way the answer is " + shortAnswer);
    }
    public static void practiceRandom()
    {
        Random myRand = new Random();

        //random number
        int randomNum = myRand.nextInt();
        System.out.println("A random number is " + randomNum);
        //random number between 0 and 10
        int randomNum10 = myRand.nextInt(10);
        System.out.println("A random between 0 and 10 is " + randomNum10);

        //random number between 2 numbers including them
        //Formula: myRand.nextInt(high - low + 1) + low;
        //Example: myRand.nextInt(30 - 10 + 1) + 10;
        //Example answer would  be a random answer between 10 and 30
        int randomNumTest = myRand.nextInt(50 - 47 + 1) + 47;
        System.out.println("A random number between 47 and 50 is " + randomNumTest);

        //random number between 2 numbers not including them
        int randomNumLocal = myRand.nextInt(90, 100);
        System.out.println("A random number between 100 and 90 is " + randomNumLocal);
    }
    public static void practiceStrings()
    {
        //proper way
        String myString = new String();
        //shortcut way for string class only
        String greeting = "Sup boi";

        //making it uppercase
        String upperGreeting = greeting.toUpperCase();
        System.out.println("Original greeting: " + greeting + " and the uppercase version: " + upperGreeting);

        //making it lowercase
        String lowerGreeting = greeting.toLowerCase();
        System.out.println("Original greeting: " + greeting + " and the lowercase version: " + lowerGreeting);
    }
}
