

// Java program to find minimum  
// number of steps to cover distance x  
class GFG  
{ 
  
    // Function to calculate the  
    // minimum number of steps required  
    // total steps taken is divisible  
    // by m and only 1 or 2 steps can be 
    // taken at // a time  
    static int minsteps(int n, int m)  
    {  
      
        // If m > n ans is -1  
        if (m > n)  
        { 
            return -1;  
        }  
          
        // else discussed above approach  
        else 
        {  
            return ((n + 1) / 2 + m - 1) / m * m;  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
        int n = 17, m = 4;  
        int ans = minsteps(n, m);  
        System.out.println(ans);  
    }  
} 
  
// This code is contributed by AnkitRai01 

