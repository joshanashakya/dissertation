

// Java implementation of the approach  
class GFG  
{  
      
    // Function to print the pair (n, r)  
    // such that nPr is maximum possible  
    static void findPair(int arr[], int n)  
    {  
      
        // There should be atleast 2 elements  
        if (n < 2)  
        {  
            System.out.print("-1");  
            return;  
        }  
      
        int i, first, second;  
        first = second = -1;  
      
        // Findex the largest 2 elements  
        for (i = 0; i < n; i++) 
        {  
            if (arr[i] > first)  
            {  
                second = first;  
                first = arr[i];  
            }  
            else if (arr[i] > second)  
            {  
                second = arr[i];  
            }  
        }  
      
        System.out.println("n = " + first +  
                           " and r = " + second);  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int arr[] = { 0, 2, 3, 4, 1, 6, 8, 9 };  
        int n = arr.length;  
      
        findPair(arr, n);  
    }  
} 
  
// This code is contributed by AnkitRai01  

