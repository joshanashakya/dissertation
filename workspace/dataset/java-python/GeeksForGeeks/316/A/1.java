

// Java program to find the longest alternating  
// subarray in an array of N number 
class GFG  
{ 
  
    // Function to find the longest subarray  
    static int longestAlternatingSubarray(int a[], int n)  
    {  
        // Length of longest alternating  
        int longest = 1;  
        int cnt = 1;  
      
        // Iterate in the array  
        for (int i = 1; i < n; i++)  
        {  
      
            // Check for alternate  
            if (a[i] * a[i - 1] < 0) 
            {  
                cnt++;  
                longest = Math.max(longest, cnt);  
            }  
            else
                cnt = 1;  
        }  
        return longest;  
    }  
      
    /* Driver program to test above functions*/
    public static void main (String[] args) 
    {  
        int a[] = { -5, -1, -1, 2, -2, -3 };  
        int n = a.length ;  
      
        // Function to find the longest subarray  
        System.out.println(longestAlternatingSubarray(a, n)); 
    }  
} 
  
// This code is contributed by Ryuga 

