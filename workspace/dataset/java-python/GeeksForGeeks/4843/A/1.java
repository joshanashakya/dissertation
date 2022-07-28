

// Java program find Number of Even cells  
// in a Zero Matrix after Q queries  
class GFG  
{ 
      
    // Function to find the number of  
    // even cell in a 2D matrix  
    static int findNumberOfEvenCells(int n, int q[][], int size)  
    {  
      
        // Maintain two arrays, one for rows operation  
        // and one for column operation  
        int row[] = new int[n] ;  
        int col[] = new int[n] ;  
      
        for (int i = 0; i < size; i++)  
        {  
            int x = q[i][0];  
            int y = q[i][1];  
      
            // Increment operation on row[i]  
            row[x - 1]++;  
      
            // Increment operation on col[i]  
            col[y - 1]++;  
        }  
      
        int r1 = 0, r2 = 0;  
        int c1 = 0, c2 = 0;  
      
        // Count odd and even values in  
        // both arrays and multiply them  
        for (int i = 0; i < n; i++)  
        {  
      
            // Count of rows having even numbers  
            if (row[i] % 2 == 0) 
            {  
                r1++;  
            }  
              
            // Count of rows having odd numbers  
            if (row[i] % 2 == 1)  
            {  
                r2++;  
            }  
              
            // Count of columns having even numbers  
            if (col[i] % 2 == 0)  
            {  
                c1++;  
            }  
              
            // Count of columns having odd numbers  
            if (col[i] % 2 == 1) 
            {  
                c2++;  
            }  
        }  
      
        int count = r1 * c1 + r2 * c2;  
        return count;  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
      
        int n = 2;  
        int q[][] = { { 1, 1 },  
                    { 1, 2 },  
                    { 2, 1 } };  
      
        int size = q.length;  
        System.out.println(findNumberOfEvenCells(n, q, size));  
    }  
} 
  
// This code is contributed by AnkitRai01 

