

// Java program to compute circular  
// convolution of two arrays 
class GFG  
{ 
    final static int MAX_SIZE = 10 ;  
      
    // Function to find circular convolution  
    static void convolution(int []x, int []h, int n, int m)  
    {  
        int row_vec[] = new int[MAX_SIZE]; 
        int col_vec[] = new int[MAX_SIZE];  
        int out[] = new int [MAX_SIZE];  
        int circular_shift_mat[][] = new int[MAX_SIZE][MAX_SIZE];  
      
        // Finding the maximum size between the  
        // two input sequence sizes  
        int maxSize = n > m ? n : m;  
      
        // Copying elements of x to row_vec and padding  
        // zeros if size of x < maxSize  
        for (int i = 0; i < maxSize; i++)  
        {  
            if (i >= n)  
            {  
                row_vec[i] = 0;  
            }  
            else
            {  
                row_vec[i] = x[i];  
            }  
        }  
      
        // Copying elements of h to col_vec and padding  
        // zeros if size of h is less than maxSize  
        for (int i = 0; i < maxSize; i++) 
        {  
            if (i >= m) 
            {  
                col_vec[i] = 0;  
            }  
            else 
            {  
                col_vec[i] = h[i];  
            }  
        }  
      
        // Generating 2D matrix of  
        // circularly shifted elements  
        int k = 0, d = 0;  
      
        for (int i = 0; i < maxSize; i++) 
        {  
            int curIndex = k - d;  
            for (int j = 0; j < maxSize; j++) 
            {  
                circular_shift_mat[j][i] =  
                row_vec[curIndex % maxSize];  
                curIndex++;  
            }  
            k = maxSize;  
            d++;  
        }  
      
        // Computing result by matrix  
        // multiplication and printing results  
        for (int i = 0; i < maxSize; i++)  
        {  
            for (int j = 0; j < maxSize; j++) 
            {  
      
                out[i] += circular_shift_mat[i][j] * col_vec[j];  
            }  
            System.out.print(out[i] + " ");  
        }  
    }  
      
    // Driver program  
    public static void main (String[] args) 
    {  
        int x[] = { 5, 7, 3, 2 };  
        int n = x.length;  
        int h[] = { 1, 5 };  
        int m = h.length;  
      
        convolution(x, h, n, m);  
    }  
} 
  
// This code is contributed by AnkitRai01 

