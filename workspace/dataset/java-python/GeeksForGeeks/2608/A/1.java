

// Java program for finding value 
// of continuous floor function 
class GFG  
{ 
    static final int max = 10000; 
    static int dp[] = new int[max]; 
      
    static void initDP()  
    { 
        for (int i = 0; i < max; i++) 
            dp[i] = -1; 
    } 
      
    // function to return value of F(n) 
    static int func(int x)  
    { 
        if (x == 0) 
            return 0; 
        if (dp[x] == -1) 
            dp[x] = x + func(x / 2); 
      
        return dp[x]; 
    } 
      
    static void printFloor(int arr[], int n)  
    { 
        for (int i = 0; i < n; i++) 
            System.out.print(func(arr[i]) + " "); 
    } 
      
    // Driver code 
    public static void main(String[] args)  
    { 
          
        // call the initDP() to fill DP array 
        initDP(); 
      
        int arr[] = {8, 6}; 
        int n = arr.length; 
      
        printFloor(arr, n); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

