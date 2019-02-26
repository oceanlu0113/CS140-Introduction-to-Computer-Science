import java.util.Scanner;
//This program demonstrates static methods

public class Geometry {
    public static void main(String[] args) {
        int choice; // The user's choice 
        double value = 0; // The method's return value 
        char letter; // The user's Y or N decision 
        double radius; // The radius of the circle 
        double length; // The length of the rectangle 
        double width; // The width of the rectangle 

        // Create a scanner object to read from the keyboard 
        Scanner keyboard = new Scanner(System.in);
        // The do loop allows the menu to be displayed first 
        do {
            // TASK #1 Call the printMenu method 
            printMenu();
            choice = keyboard.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter the radius of " + "the circle: ");
                    radius = keyboard.nextDouble();
                    // TASK #3 Call the circleArea method and 
                    // store the result in the value variable 
                    value = circleArea(radius);
                    System.out.println("The area of the " + "circle is " + value);
                    break;
                case 2:
                    System.out.print("Enter the length of " + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " + "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the rectangleArea method and 
                    // store the result in the value variable 
                    value = rectangleArea(length, width);
                    System.out.println("The area of the " + "rectangle is " + value);
                    break;
                case 3:
                    System.out.print("Enter the radius of " + "the circle: ");
                    radius = keyboard.nextDouble();
                    // TASK #3 Call the circumference method and 
                    // store the result in the value variable 
                    value = circleCircumference(radius);
                    System.out.println("The circumference " + "of the circle is " + value);
                    break;
                case 4:
                    System.out.print("Enter the length of " + "the rectangle: ");
                    length = keyboard.nextDouble();
                    System.out.print("Enter the width of " + "the rectangle: ");
                    width = keyboard.nextDouble();
                    // TASK #3 Call the perimeter method and 
                    // store the result in the value variable 
                    value = rectanglePerimeter(length, width);
                    System.out.println("The perimeter of " + "the rectangle is " + value);
                    break;
                default:
                    System.out.println("You did not enter " + "a valid choice.");
            }

            keyboard.nextLine(); // Consume the new line 
            System.out.println("Do you want to exit " + "the program (Y/N)?: ");
            String answer = keyboard.nextLine();
            letter = answer.charAt(0);
        } while (letter != 'Y' && letter != 'y');
    }

// TASK #1 Create the printMenu method here 
    public static void printMenu() {
        System.out.println("This is a geometry calculator \n"
                + "Choose what you would like to calculate \n"
                + "(1) Find the area of a circle \n"
                + "(2) Find the area of a rectangle \n"
                + "(3) Find the circumference of a circle \n"
                + "(4) Find the perimeter of a rectangle  \n"
                + "Enter the number of your choice:  ");
    }

// TASK #2 Create the value-returning methods here 
    //returns the area of the circle @param radius; @return circlea area
    public static double circleArea(double radius) {
        return ((Math.PI) * (Math.pow(radius, 2)));
    }

    //returns the area of the rectangle
    public static double rectangleArea(double length, double width) {
        return (length * width);
    }

    //returns the circumference of the circle
    public static double circleCircumference(double radius) {
        return (2 * (Math.PI) * radius);
    }

    public static double rectanglePerimeter(double length, double width) {
        return ((2 * length) + (2 * width));
    }
}

// TASK #4 Write comments for each method 


//test results
/*
Script started on Thu 11 May 2017 11:29:24 AM PDT
0;oslu@abbott:~ javac pico Geometry.java
0;oslu@abbott:~ java Geometry
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
1
Enter the radius of the circle: 3
The area of the circle is 28.274333882308138
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
1
Enter the radius of the circle: 5
The area of the circle is 78.53981633974483
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
2
Enter the length of the rectangle: 2
Enter the width of the rectangle: 4
The area of the rectangle is 8.0
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
2
Enter the length of the rectangle: 3
Enter the width of the rectangle: 5
The area of the rectangle is 15.0
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
3
Enter the radius of the circle: 3
The circumference of the circle is 18.84955592153876
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
3
Enter the radius of the circle: 7
The circumference of the circle is 43.982297150257104
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
4
Enter the length of the rectangle: 2
Enter the width of the rectangle: 4
The perimeter of the rectangle is 12.0
Do you want to exit the program (Y/N)?: 
n
This is a geometry calculator 
Choose what you would like to calculate 
(1) Find the area of a circle 
(2) Find the area of a rectangle 
(3) Find the circumference of a circle 
(4) Find the perimeter of a rectangle  
Enter the number of your choice:  
3
Enter the radius of the circle: 5
The circumference of the circle is 31.41592653589793
Do you want to exit the program (Y/N)?: 
y
0;oslu@abbott:~ exit
exit

Script done on Thu 11 May 2017 11:31:13 AM PDT
*/
//Note: test runs were unable to completely copy and paste over onto putty
