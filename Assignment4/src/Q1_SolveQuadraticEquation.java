/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 1 (20 marks)
    Write a Java program, use 'subroutine', 'if', 'else if' and 'else' to solve a quadratic equation in the following form:

    a*x^2 + b*x + c = 0

 * INPUT: user input real valued coefficients: a, b, c.
 * These inputs should be fed as parameters into a subroutine that you write.
 *
 * OUTPUT: Output the solutions (i.e., roots) to the quadratic function defined by the coefficients a, b and c.
 * If there is no real roots, output: "The equation has no real roots."
 * The above outputs should be produced as a String variable returned by your subroutine.
 *
 * Note: all values must be displayed using two significant digits after decimal point.

*
* Example:
For a=1, b=5 and c=2, the roots are -0.44 and -4.56
 */

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Q1_SolveQuadraticEquation {
    /* place your subroutine code here */
    public static void quadraticFormula(int a,int b, int c){ //to calculate the quadratic equation
        if (b*b-4*a*c<0){ // checking if the equation has no real roots, if b^2 - 4ac < 0
            System.out.println("The equation has no real roots.");
        } else { //calculating the 2 real roots
            double x1 = ((-b)+Math.sqrt(b*b-4*a*c))/2*a; //first root
            double x2 = ((-b)-Math.sqrt(b*b-4*a*c))/2*a; //second root

            System.out.printf("The two roots is %.2f and %.2f",x1,x2); //prints first and second root rounded to 2 decimal points
        }
    }
    public static void main(String[] Strings) {
        Scanner sc = new Scanner(System.in); //initializing scanner

        System.out.print("Enter your first integer, a : ");
        int a = sc.nextInt(); // gets input for integer a

        System.out.print("Enter your first integer, b : ");
        int b = sc.nextInt(); // gets input for integer b

        System.out.print("Enter your first integer, c : ");
        int c = sc.nextInt(); // gets input for integer c

        quadraticFormula(a,b,c); //calls on the method to calculate the roots
    }
}
