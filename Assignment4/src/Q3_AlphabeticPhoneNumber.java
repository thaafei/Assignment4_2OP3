/* Assignment 4 (100 marks in total; 5% of the final score of this course)
 *
 * Question 3 (30 marks)

Many companies use telephone numbers like 555-GET-Food so the number is easier for their customers to remember.
On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:

A, B, and C = 2
D, E, and F = 3
G, H, and I = 4
J, K, and L = 5
M, N, and O = 6
P, Q, R, and S = 7
T, U, and V = 8
W, X, y, and Z = 9
Write an application that asks the user to enter a 10-character telephone number in the format XXX-XXX-XXXX.
The application should display the telephone number with any alphabetic characters that appeared in the original
translated to their numeric equivalent.

Example: if the user enters 555GETFOOD the application should display 555-438-3663.
*

 */

import java.util.Scanner;

public class Q3_AlphabeticPhoneNumber {
    private static Scanner input;

    public static void main(String[] args) {
        input = new Scanner(System.in);
        System.out.println("Enter The Phone Number (With Letters): ");
        String initial_phone_number = input.nextLine();

        initial_phone_number = initial_phone_number.toUpperCase();
        long phone_number_final = full_number(initial_phone_number);

        System.out.printf("%nOutput phone number for '%s' is '%s'",
                initial_phone_number, phone_number_final);
    }

    public static long full_number(String initial_phone_number) {
        // Use long instead of int for 'number' if the string will be longer than max int value
        // 2147483647, which is '10 digits'
        long number; // 'number' is the digital phone number to compute from the initial alphabetic phone number.

        char[] char_num = initial_phone_number.toCharArray(); // changes given number to an array of chars
        StringBuilder final_Num = new StringBuilder(); //initialize new string-builder to store final number


        for (char i : char_num) { //for the length of the array, using char i
            if (i == 'A' || i == 'B' || i == 'C') { // if the char at the current point of array is equal to a b or c
                final_Num.append('2'); // adds 2 to the end of the final_num string
            } else if (i == 'D' || i == 'E' || i == 'F') { //same concepts
                final_Num.append('3');
            } else if (i == 'G' || i == 'H' || i == 'I') {
                final_Num.append('4');
            } else if (i == 'J' || i == 'K' || i == 'L') {
                final_Num.append('5');
            } else if (i == 'M' || i == 'N' || i == 'O') {
                final_Num.append('6');
            } else if (i == 'P' || i == 'Q' || i == 'R' || i == 'S') {
                final_Num.append('7');
            } else if (i == 'T' || i == 'U' || i == 'V') {
                final_Num.append('8');
            } else if (i == 'W' || i == 'X' || i == 'Y' || i == 'Z') {
                final_Num.append('9');
            } else { //if the current char is not a letter, adds it as is since it is a number
                final_Num.append(i);
            }

        }
        number = Long.parseLong(final_Num.toString()); //changes the string to long
        return number;// End of full_number function, returns the number
    }
}
