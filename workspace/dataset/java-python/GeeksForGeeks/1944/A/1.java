

// Java implementation of the approach  
class GFG  
{ 
      
    // Function to find product of all elements  
    // in all subsets  
    static int product(int a[], int n)  
    {  
        int ans = 1;  
        int val = (int)Math.pow(2, n - 1);  
          
        for (int i = 0; i < n; i++) 
        {  
            ans *= (int)Math.pow(a[i], val);  
        }  
        return ans;  
    }  
      
    // Driver Code  
    public static void main (String[] args)  
    {  
        int n = 2;  
        int a[] = { 3, 7 };  
          
        System.out.println(product(a, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

