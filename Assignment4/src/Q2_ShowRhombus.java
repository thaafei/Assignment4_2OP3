/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 2 (20 marks)
    Write a java program to display the number rhombus structure.

 * INPUT: user input integer value: n
 * The input should be fed into a subroutine as parameter.
 *
 * OUTPUT: the rhombus structure corresponding to n. (see the following example)
 * Your subroutine should directly print the result and do not return anything.

*
* Example:
* For n=7, the rhombus structure is:
      1
     212
    32123
   4321234
  543212345
 65432123456
7654321234567
 65432123456
  543212345
   4321234
    32123
     212
      1

* For n=3, the rhombus structure is:
  1
 212
32123
 212
  1

 */

import java.util.Scanner;

public class Q2_ShowRhombus {
    public static void rhombus(int n) {
        //%10.0f to make a minimum of 10 spacing before a letter, can be useful

        int numSpace = 1; //stores the number of spaces needed
        int start = n; //stores the value of n, for use in second half

        for (int i = 1; i < (n * 2); i++) { //for loop until the whole rhombus is printed

            //for printing spaces
            for (int space = n-numSpace; space>0; space --){ //prints n-numspaces amount of spaces until it reaches one
                System.out.print(" ");
            }

            if (i<n){ //if the current loop is in the top half of the rhombus
                numSpace ++; //increases numSpace because spaces needed is getting smaller
            } else {numSpace --;} //else decreases numSpace since spaces needed is getting bigger because it'll be at the bottome half

            if (i < n) { //making the top half of the rhombus
                for (int j = i; j > 0; j--) { //prints from i to 1
                    System.out.print(j);
                }
                for (int k = 2; k <= i; k++) { //prints from 2 to i
                    System.out.print(k);
                }
                System.out.print("\n"); //moves to new line for next loop
            }
            else{ //making the bottom half of the rhombus
                for (int j = start; j>0 ; j--) {  //prints from start to 1
                    System.out.print(j);
                }
                for (int k = 2; k <= start; k++) { //prints from 2 to start
                    System.out.print(k);
                }
                start--; //decreases start by 1, starting from the value of n
                System.out.print("\n"); //moves to new line
            }
        }
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in); //initializing scanner

        System.out.print("Enter the integer n: ");
        int n = sc.nextInt(); // gets input for integer a
        rhombus(n);
    }
}

