

// Java implementation of above approach 
  
class GFG{ 
   
// Function to find 
// digit count of numbers 
static int digit_count(int x) 
{ 
    int sum = 0; 
    while (x > 0) { 
        sum++; 
        x = x / 10; 
    } 
    return sum; 
} 
   
// Function to find the count of numbers 
static int find_count(int []arr, int k) 
{ 
   
    int ans = 0; 
    for (int i : arr) { 
   
        // Get the digit count of each element 
        int x = digit_count(i); 
   
        // Check if the digit count 
        // is divisible by K 
        if (x % k == 0) 
   
            // Increment the count 
            // of required numbers by 1 
            ans += 1; 
    } 
   
    return ans; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int []arr = { 12, 345, 2, 68, 7896 }; 
    int K = 2; 
   
    System.out.print(find_count(arr, K)); 
   
} 
} 
  
// This code is contributed by 29AjayKumar 

