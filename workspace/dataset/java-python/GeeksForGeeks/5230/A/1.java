

// Java implementation of the approach  
class GfG 
{ 
  
    // Function to return the count of total  
    // binary prefix which are divisible by x  
    static int CntDivbyX(int arr[], int n, int x)  
    {  
      
        // Initialize with zero  
        int number = 0;  
        int count = 0;  
      
        for (int i = 0; i < n; i++)  
        {  
      
            // Convert all prefixes to decimal  
            number = number * 2 + arr[i];  
      
            // If number is divisible by x  
            // then increase count  
            if ((number % x == 0))  
                count += 1;  
        }  
      
        return count;  
    }  
  
    // Driver Code 
    public static void main(String []args) 
    { 
          
        int arr[] = { 1, 0, 1, 0, 1, 1, 0 };  
        int n = arr.length;  
        int x = 2;  
        System.out.println(CntDivbyX(arr, n, x)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

