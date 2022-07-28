

// Java Program to read a suare matrix 
// and print the elements below secondary diagonal 
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
        for (row_index = 0; row_index < size; row_index++) 
        { 
            for (column_index = 0;  
                 column_index < size; column_index++) 
            { 
                System.out.printf("%d\t",  
                           matrix[row_index][column_index]); 
            } 
  
            System.out.printf("\n"); 
        } 
  
        // Print the elements below secondary diagonal 
        System.out.printf("\nElements below Secondary" +  
                                    " diagonal are:\n"); 
  
        for (row_index = 0; row_index < size; row_index++) 
        { 
            for (column_index = 0;  
                 column_index < size; column_index++)  
            { 
  
                // check for elements below secondary diagonal 
                if ((row_index + column_index) > size - 1) 
                    System.out.printf("%d, ",    
                               matrix[row_index][column_index]); 
            } 
        } 
  
    } 
} 
  
// This code is contributed by 29AjayKumar 

