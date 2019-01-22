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
public class Project2 {
	// declare main method
	public static void main(String[] args) {
		// declare int variables corresponding to matrix 1 row & column 
		// and matrix 2 row & column that the user will enter via console
		// and initialize them to zero
		int m1r = 0;
		int m1c = 0;
		int m2r = 0;
		int m2c = 0;
		// declare Scanner variable input to be used to accept user input for matrices row & column size
		Scanner input = new Scanner(System.in);
		// prompt user for row and column size for first matrix
		System.out.println("Enter an integer value for matrix 1 row size: ");
		System.out.println("(value must be non-negative and greater or equal to 1)");
		m1r = input.nextInt();
		if(m1r < 1) {
			System.out.println("Error: Integer value must be non-negative and greater or equal to 1");
			main(args);
		}
		System.out.println("Enter an integer value for matrix 1 column size: ");
		System.out.println("(value must be non-negative and greater or equal to 1)");
		m1c = input.nextInt();
		if(m1c < 1) {
			System.out.println("Error: Integer value must be non-negative and greater or equal to 1");
			main(args);
		}
		// prompt user for row and column size for second matrix
		System.out.println("Enter an integer value for matrix 2 row size: ");
		System.out.println("(value must be non-negative and greater or equal to 1)");
		m2r = input.nextInt();
		if(m2r < 1) {
			System.out.println("Error: Integer value must be non-negative and greater or equal to 1");
			main(args);
		}
		System.out.println("Enter an integer value for matrix 2 column size: ");
		System.out.println("(value must be non-negative and greater or equal to 1)");
		m2c = input.nextInt();	
		if(m2c < 1) {
			System.out.println("Error: Integer value must be non-negative and greater or equal to 1");
			main(args);
		}
		// call the multiplyMatrices method passing the user entered row/column sizes for each matrix
		multiplyMatrices(m1r, m1c, m2r, m2c);
		
		
	}
	// end main method

	 
	// declare multipyMatrices method taking in the row/column sizes entered by user
	// and returning the product of the two matrices
	public static int [][] multiplyMatrices(int m1r, int m1c, int m2r, int m2c){

		int [][] matOne = new int[m1r][m1c];
		int [][] matTwo = new int[m2r][m2c];
		int max1 = 0;
		int max2 = 0;
		int maxOverall = 0;				
		// checking for max size of n x n integer matrix from the user inputs
		// once max int value is found use that number as the n x n size for the product matrix
		if(m1r > m1c) {
			max1 = m1r;
		}
		else {
			max1 = m1c;
		}
		if(m2r > m2c) {
			max2 = m2r;
		}
		else {
			max2 = m2c;
		}
		if(max1 > max2) {
			maxOverall = max1;
		}
		else {
			maxOverall = max2;
		}
		// declare and initialize the two-dimensional product matrix using the maxOverall row/column size determined
		// in the if/else statements directly above 
		int [][] prodMat = new int[maxOverall][maxOverall];
		int temp1 = maxOverall;
		int temp2 = maxOverall;
		
		Scanner input1 = new Scanner(System.in);
		// initializing the product matrix with user input values
		System.out.println("Enter the matrix data: ");
		for(int i = 0; i<maxOverall; i++) {
			for(int j = 0; j<maxOverall; j++) {
				prodMat[i][j] = input1.nextInt();
			}
		}
		
		// nested for loop that will iterate through the matrices using i,j,k counters
		// multiplying the numbers in the matrices
		for(int i = 0; i < m1r; i++) {
			for(int j = 0; j < m2c; j++) {
				for(int k = 0; k < m1c; k++) {
					
					prodMat[i][j] =+ matOne[i][k] * matTwo[k][j];
				}
			}
		}
		for(int[] arr : prodMat) {
			System.out.println(Arrays.toString(prodMat));
		}
		return prodMat;
	}

	
	

}
// end Project2 class
