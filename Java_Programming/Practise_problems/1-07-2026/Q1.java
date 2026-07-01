// For Loop
// 1. Print all numbers from 10 down to 1 using a for loop. (Beginner)
// 2. Print all odd numbers between 1 and 20. (Beginner)
// 3. Find the factorial of a number entered by the user (e.g., 5! = 120). (Easy)
// 4. Print the squares of numbers from 1 to 10 (1, 4, 9, 16, ...). (Easy)
// 5. Print the multiplication tables of 2 to 5, one after another, each clearly labeled. (Medium)
// While Loop
// 6. Print numbers from 1 to n (n taken as input) using a while loop. (Beginner)
// 7. Count how many digits a given number has (e.g., 4527 has 4 digits). (Easy)
// 8. Reverse a given number (e.g., 1234 becomes 4321) using a while loop. (Easy)
// 9. Keep asking the user to enter a number until they enter 0, then print the sum of all numbers
// entered. (Medium)
// 10. Find the digital root of a number by repeatedly summing its digits until a single digit remains
// (e.g., 3875 to 23 to 5). (Medium)
// Nested Loops
// 11. Print a 4x4 grid of numbers where every row contains 1, 2, 3, 4. (Easy)
// 12. Print the full multiplication table from 1 to 10 using nested loops (a 10x10 grid). (Medium)
// 13. Given a 3x3 matrix (2D array) of integers, print it row by row using nested loops. (Medium)
// 14. Using nested loops, print all pairs (i, j) where 1 <= i, j <= 5 and i + j is exactly 6. (Hard)
// Pattern Programming
// 15. Print a hollow square pattern of size n (stars only on the border, spaces inside). (Easy)
// 16. Print a diamond pattern by combining a pyramid with an inverted pyramid below it. (Easy)
// 17. Print a number pattern where each row counts down instead of up (e.g., 4 3 2 1 / 3 2 1 / 2 1 / 1).
// (Medium)
// 18. Print a reverse alphabet triangle (e.g., D C B A / C B A / B A / A). (Medium)
// 19. Print a Pascal's Triangle-style number pattern up to n rows, where each number is the sum of
// the two numbers above it. (Hard)
// Mixed Challenge
// 20. Write a program that prints a hollow pyramid (stars only on the outer edges and base, spaces
// inside). (Challenge)

import java.util.Scanner;
public class Q1{
    public static void main(String [] args){
        int n = 10;
        for (int i = 0; i <= n; i++){
            System.out.println(i);
        }
    }
}