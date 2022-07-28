

// Java implementation of the approach 
  
class GFG  
{ 
  
    // Function to return the count 
    // of the required numbers 
    static int countNum(int N, int arr[])  
    { 
        // Initialize sum and count to 0 
        int sum = 0, count = 0; 
  
        // Calculate sum of all 
        // the array elements 
        for (int i = 0; i < N; i++)  
        { 
            sum += arr[i]; 
        } 
          
        // If current element satifies the condition 
        for (int i = 0; i < N; i++)  
        { 
            if ((sum - arr[i]) % arr[i] == 0)  
            { 
                count++; 
            } 
        } 
  
        // Return the count of required elements 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
        int arr[] = {3, 10, 4, 6, 7}; 
        int n = arr.length; 
        System.out.println(countNum(n, arr)); 
    } 
} 
  
// This code has been contributed by 29AjayKumar 

