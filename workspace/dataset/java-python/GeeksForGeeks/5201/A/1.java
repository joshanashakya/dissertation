

// Java implementation of the above approach.  
class GFG  
{ 
      
    // Function to check if all  
    // elements can be equal or not  
    static void checkEqualMatrix(int arr[][], int n,  
                              int m, int k)  
    {  
        int c = 0, cnt1 = 0, cnt2 = 0;  
      
        // Iterate over the matrix  
        for (int i = 0; i < n; i++) 
        {  
            for (int j = 0; j < m; j++)  
            {  
                if (c % 2 == 0) 
                {  
      
                    // Update the counter for odd values  
                    // if array element at that position is k  
                    if (arr[i][j] == k) 
                    {  
                        cnt1++;  
                    }  
                }  
                else 
                {  
      
                    // Update the counter for even values  
                    // if array element at that position is k  
                    if (arr[i][j] == k)  
                    {  
                        cnt2++;  
                    }  
                }  
                c = c + 1;  
            }  
        }  
          
        // To check if there is at least one  
        // element at both even and odd indices.  
        if (cnt1 >= 1 && cnt2 >= 1) 
        {  
            System.out.println("Yes");  
        }  
        else
        {  
            System.out.println("No");  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int arr[][] = { { 1, 8, 3 },  
                        { 1, 2, 2 },  
                        { 4, 1, 9 } };  
        int k = 2;  
          
        // Function calling  
        checkEqualMatrix(arr, 3, 3, k);  
    }  
} 
  
// This code is contributed by AnkitRai01 

