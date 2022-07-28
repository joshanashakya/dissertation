

// Java implementation of the above approach  
class GFG  
{  
      
    // Function to count the number  
    // of factors P in X!  
    static int countFactor(int P, int X)  
    {  
        if (X < P)  
            return 0;  
      
        return (X / P + countFactor(P, X / P));  
    }  
      
    // Function to find the smallest X such  
    // that X! contains Y trailing zeros  
    static int findSmallestX(int Y)  
    {  
        int low = 0, high = 5 * Y;  
        int N = 0;  
        while (low <= high)  
        {  
            int mid = (high + low) / 2;  
      
            if (countFactor(5, mid) < Y)  
            {  
                low = mid + 1;  
            }  
      
            else
            {  
                N = mid;  
                high = mid - 1;  
            }  
        }  
      
        return N;  
    }  
      
    // Driver code  
    public static void main(String args[])  
    {  
        int Y = 10;  
      
        System.out.println(findSmallestX(Y));  
    }  
}  
  
// This code is contributed by Ryuga  

