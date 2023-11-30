// Programer: Sarai Ayon
// Class: CS&141 F2P
// Date: 11/28/23
// Assignment: 
// Reference Materials: CH 18 + downloading source code for this chapter, youtube video https://www.youtube.com/watch?v=icoql2WKmbA
// and chat GBT
// Purpose:This program defines a recursive method pascalValue that calculates the value at a specific position in Pascal's Triangle. 
// The main method then prints a specified number of rows of the triangle.

 
public class PascalsTriangle {

   // This is the main method where the program starts
   public static void main(String[] args) {
      int numRows = 5; // You can change this to generate more rows
   
      // This outer loop controls the number of rows in the triangle
      for (int i = 0; i < numRows; i++) {
         
         // This inner loop calculates and prints the values in each row
         for (int j = 0; j <= i; j++) {
            System.out.print(calculateValue(i, j) + " ");
         }// end of for loop
         
         // Move to the next line after completing a row
         System.out.println();
      }// end of for loop
   }// end of MAIN
   
   

   // This method calculates the value at a specific position in Pascal's Triangle
   private static int calculateValue(int row, int col) {
      // The first and last elements in each row are always 1
      if (col == 0 || col == row) {
         return 1;
      } else {
         // Other elements are the sum of the two elements above them in the previous row
         return calculateValue(row - 1, col - 1) + calculateValue(row - 1, col);
      }// end of else
   }// end of claculateValue method
   
   
   
}// end of Class

