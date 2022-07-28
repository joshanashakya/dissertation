

// Java implementation of the approach  
class GFG 
{ 
      
// Function to return the count  
// of minimum operations required  
static int Minimum_Operations(int []a, int n)  
{  
  
    // To store the count of negative integers  
    // on the right of the current index (inclusive)  
    int[] np = new int[n + 1];  
    np[n] = 0;  
  
    // Find the count of negative integers  
    // on the right  
    for (int i = n - 1; i >= 0; i--) 
    {  
        np[i] = np[i + 1];  
  
        // If current element is negative  
        if (a[i] <= 0)  
            np[i]++;  
    }  
  
    // To store the count of positive elements  
    int pos = 0;  
    int ans = n;  
  
    // Find the positive integers  
    // on the left  
    for (int i = 0; i < n - 1; i++)  
    {  
  
        // If current element is positive  
        if (a[i] >= 0)  
            pos++;  
  
        // Update the answer  
        ans = Math.min(ans, pos + np[i + 1]);  
    }  
  
    // Return the required answer  
    return ans;  
}  
  
// Driver code  
public static void main(String args[])  
{  
    int []a = { -1, 0, 1, 2 };  
    int n = a.length;  
    System.out.print(Minimum_Operations(a, n));  
}  
} 
  
// This code is contributed by Akanksha Rai 

