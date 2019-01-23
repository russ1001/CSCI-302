/*CSCI 302  Programming Challenge 2
 * 
 * Name: Russell M. Streff Jr.       UIN:  677045604       Date:  1/21/19
 * ----------------------------------------------------------------------------
 * I declare that all material in this assessment task is my own work
 * except where there is clear acknowledgment or reference to the work
 * of others. I further declare that I have complied with, and agree to
 * abide by, the UIS Academic Integrity Policy at the University website: 
 * 
 * 					http://www.uis.academicintegrity
===============================================================================
 * Programming Challenge 2

In this Challenge, you will answer the question: Is matrix multiplication commutative?
The purpose of this challenge is to understand matrix multiplication. 
You are going to write a program, (or write it in plain text) 
that multiplies two matrices A and B, and check whether AB=BA. 
Choose  matrices that have different numbers of rows and columns such as A=3x2 and B=2x4.
You may use any programming language, or you may complete the assignment by 
submitting your algorithm in plain text. The purpose is not to see how well you 
program, but to see if you understand matrix multiplication. Document your 
algorithm with comments.
 * 
 */



// import entire java utility for Scanner input
import java.util.*;
// declare Project2 class
public class Project2Test2 {
	
	static int counter = 0;
	// declare main method
	public static void main(String[] args) {
		// declare integer variables to accept users input for row/column size of matrices
		// initialize to zero
		int m1r = 0;
		int m1c = 0;
		int m2r = 0;
		int m2c = 0;
		// declare and initialize Scanner variable input to accept user input from console
		Scanner input = new Scanner(System.in);
		// print to console prompts for user to enter row/column sizes of the two matrices
		System.out.println("Enter the row size of Matrix 1: ");
		m1r = input.nextInt();
		System.out.println("Enter the column size of Matrix 1: ");
		m1c = input.nextInt();
		System.out.println("Enter the row size of Matrix 2: ");
		m2r = input.nextInt();
		System.out.println("Enter the column size of Matrix 2: ");
		m2c = input.nextInt();
		// test to make sure that the row size of Matrix 1 is equal to the column size of Matrix 2
		// if not, send the user back to main method to try again
		if(m1c != m2r) {
			System.out.println("ERROR: The two matrices cannot be multiplied. Row size of Matrix 1 must equal column size of Matrix 2!");
			System.out.println("Please try again...");
			counter ++;
			if(counter == 3) {
				System.out.println("\n\nSorry...too many attempts");
				System.out.println("Please refer to: 'Discrete Mathematics and It's Applications', Rosen, Seventh Edition, Section 2.6 Matrices page 179");
				System.out.println("PROGRAM EXITED");
				System.exit(1);
			}
			main(args); 
		}
		// declare (2) two-dimensional integer matrices using the row/column sizes entered by user via console
		int [][] matOne = new int[m1r][m1c]; 
		int [][] matTwo = new int[m2r][m2c];
		
		// prompt user to input values for Matrix 1 by row/column
		System.out.println("Enter the values for Matrix 1 row 1/column1, row1/column2, row x/column x... :");
		// nested for loop initializing Matrix 1 with users input
		for(int i = 0; i < m1r; i++) {
			for(int j = 0; j < m1c; j++) {
				
				matOne[i][j] = input.nextInt();
			}
		}
		
		// prompt user to input values for Matrix 2 by row/column
		System.out.println("Enter the values for Matrix 2 row 1/column1, row1/column2, row x/column x... :");
		// nested for loop initializing Matrix 1 with users input
		for(int i = 0; i < m2r; i++) {
			for(int j = 0; j < m2c; j++) {
				
				matTwo[i][j] = input.nextInt();
			}
		}
		
		// call multiplyMatrices method passing the two entered matrices along with their corresponding row/column sizes
		multiplyMatrices(matOne, matTwo, m1r, m1c, m2r, m2c);
		
	}
	// end main method
	
	// declare multipyMatrices method taking in the row/column sizes entered by user
	// and returning the product of the two matrices
	public static int [][] multiplyMatrices(int [][] mat1, int [][] mat2, int m1r, int m1c, int m2r, int m2c){
		
		// declare new integer two-dimensional matrix initializing the row/column size to the row/column values passed 
		// to this method from main method entered by user
		int [][] matProduct = new int[m1r][m2c];
		// nested for loop that will iterate through the matrices using i,j,k counters
		// multiplying the numbers in the matrices
		for(int i = 0; i < m1r; i++) {
			for(int j = 0; j < m2c; j++) {
				for(int k = 0; k < m1c; k++) {
					
					matProduct[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}

		// print to console the product of Matrix 1 and Matrix 2
		System.out.println("\nThe product of two matrices entered is: ");
		System.out.println("-----------------------------------------");
        for(int[] row : matProduct) {
            for (int column : row) {
                System.out.print("\t" + column + "    ");
            }
            System.out.println();
        }
		
		return matProduct;
	}
	// close multiplyMatrices method
}
// end Project2 class




