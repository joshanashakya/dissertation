

// Java implementation of the above approach.  
class GFG  
{ 
      
    // function to find minimum sum  
    static int findSum(int []arr, int n, int k)  
    {  
      
        // variable to store final answer  
        // and initialising it with the values  
        // when 0 elements is removed from the left and  
        // K from the right.  
        int ans = arr[n - k - 1] - arr[0];  
      
        // loop to simulate removal of elements  
        for (int i = 1; i <= k; i++) 
        {  
            // removing i elements from the left and and K-i elements  
            // from the right and updating the answer correspondingly  
            ans = Math.min(arr[n - 1 - (k - i)] - arr[i], ans);  
        }  
      
        // returning final answer  
        return ans;  
    }  
      
    // Driver function  
    public static void main (String[] args) 
    {  
        // input values  
        int arr[] = { 1, 2, 100, 120, 140 };  
        int k = 2;  
        int n = arr.length;  
      
        // callin the required function;  
        System.out.println(findSum(arr, n, k));  
    }  
  
} 
  
// This code is contributed by AnkitRai01 

