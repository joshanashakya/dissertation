

// Java implementation of the above approach 
class GFG { 
  
    // Function to return the sum of 
    // all the proper factors of n 
    static int sumOfFactors(int n) 
    { 
        int sum = 0; 
        for (int f = 1; f <= n / 2; f++) { 
  
            // f is the factor of n 
            if (n % f == 0) { 
                sum += f; 
            } 
        } 
        return sum; 
    } 
  
    // Function to return the required sum 
    static int getSum(int[] arr, int n) 
    { 
  
        // To store the sum 
        int sum = 0; 
        for (int i = 0; i < n; i++) { 
  
            // If current element is non-zero and equal 
            // to the sum of proper factors of itself 
            if (arr[i] > 0 && arr[i] == sumOfFactors(arr[i])) { 
                sum += arr[i]; 
            } 
        } 
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int[] arr = { 17, 6, 10, 6, 4 }; 
        int n = arr.length; 
        System.out.print(getSum(arr, n)); 
    } 
} 

