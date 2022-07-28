

// Java implementation of the approach  
class GFG  
{  
      
    // Utility function to print 
    // the contents of the array  
    static void printArray(int []arr, int n)  
    {  
        for (int i = 0; i < n; i++)  
            System.out.print(arr[i] + " ");  
    }  
      
    // Function to find the required array  
    static void findArray(int []q, int n)  
    {  
        int ans; 
        int []arr = new int[n]; 
        for (int k = 0, j = 0;  
                        j < n / 4; j++) 
        {  
            ans = q[k] ^ q[k + 3];  
            arr[k + 1] = q[k + 1] ^ ans;  
            arr[k + 2] = q[k + 2] ^ ans;  
            arr[k] = q[k] ^ ((arr[k + 1]) ^  
                             (arr[k + 2]));  
            arr[k + 3] = q[k + 3] ^ (arr[k + 1] ^ 
                                     arr[k + 2]);  
            k += 4;  
        }  
      
        // Print the array  
        printArray(arr, n);  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int []q = { 4, 1, 7, 0 };  
        int n = q.length; 
        findArray(q, n);  
    }  
}  
  
// This code is contributed 
// by Akanksha Rai 

