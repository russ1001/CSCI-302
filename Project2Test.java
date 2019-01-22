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
public class Project2Test {
	// declare main method
	public static void main(String[] args) {
		
		int [][] mat1 = { {3, -2, 5}, {3, 0, 4} };     //{{1,2,3},{4,5,6}};
		int [][] mat2 = { {2, 3}, {-9, 0}, {0, 4} };   //{{1,2},{3,4},{5,6}};
		multiplyMatrices(mat1, mat2);
		
	}
	// end main method

//
	//
	//
	//
	//// https://www.programiz.com/java-programming/examples/multiply-matrix-function
	
	
	
	// declare multipyMatrices method taking in the row/column sizes entered by user
	// and returning the product of the two matrices
	public static int [][] multiplyMatrices(int [][] mat1, int [][] mat2){
		
		int row1, column1, row2, column2;
		
		row1 = mat1.length;
		column1 = mat1[0].length;
		row2 = mat2.length;
		column2 = mat2[0].length;		
		
		System.out.println("Row one: " + row1);
		System.out.println("Column one: " + column1);
		System.out.println("Row two: " + row2);
		System.out.println("Column two: "+ column2);
		
		// checking to make sure that the column length of the first matrix is equal to the row length of the second matrix
		// if not equal quit program
		if(column1 != row2) {
			System.out.println("ERROR: The two matrices cannot be multiplied.");
			System.exit(1);
		}
		
		
		
		
		int [][] matProduct = new int[row1][column2];
		
		
		// nested for loop that will iterate through the matrices using i,j,k counters
		// multiplying the numbers in the matrices
		
		// 1*1 + 2*3 + 3*5 top left square n1,1
		// 1*2 + 2*4 + 3*6 top right square n1,2
		// 4*1 + 5*3 + 6*5 bottom left square n2,1
		// 4*2 + 5*4 + 6*6 bottom right square n2,2
		
		
		for(int i = 0; i < row1; i++) {
			for(int j = 0; j < column2; j++) {
				for(int k = 0; k < column1; k++) {
					
					matProduct[i][j] =+ mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		
		
		for(int i = 0; i < matProduct.length; i++) {
			for(int j = 0; j < matProduct[i].length; j++) {
				
				System.out.println(matProduct[i][j] + " ");
			}
		}
		
		return matProduct;
	}
	
	

}
// end Project2 class
