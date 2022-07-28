

// Java Program to read a square matrix 
// and print the elements above secondary diagonal 
class GFG  
{ 
    public static void main(String[] args)  
    { 
        int[][] matrix = new int[5][5]; 
        int row_index, column_index, x = 0, size = 5; 
  
        // Get the square matrix 
        for (row_index = 0;  
             row_index < size; row_index++) 
        { 
            for (column_index = 0;  
                 column_index < size; column_index++) 
            { 
                matrix[row_index][column_index] = ++x; 
            } 
        } 
  
        // Display the matrix 
        System.out.printf("The matrix is\n"); 
        for (row_index = 0;  
             row_index < size; row_index++)  
        { 
            for (column_index = 0;  
                 column_index < size; column_index++) 
            { 
                System.out.printf("%d\t",  
                           matrix[row_index][column_index]); 
            } 
  
            System.out.printf("\n"); 
        } 
  
        // Print the elements above secondary diagonal 
        System.out.printf("\nElements above Secondary" +  
                                    " diagonal are:\n"); 
  
        for (row_index = 0; row_index < size; row_index++) 
        { 
            for (column_index = 0;  
                 column_index < size; column_index++) 
            { 
  
                // check for elements above secondary diagonal 
                if ((row_index + column_index) < size - 1) 
                    System.out.printf("%d, ",  
                               matrix[row_index][column_index]); 
            } 
        } 
  
    } 
} 
  
// This code is contributed by Rajput-Ji 

