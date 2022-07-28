

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of required pairs 
    public static int countPairs(int n) 
    { 
        // Number which will give the max value 
        // for ((n % i) % j) % n 
        int num = ((n / 2) + 1); 
  
        // To store the maximum possible value of 
        // ((n % i) % j) % n 
        int max = n % num; 
  
        // To store the count of possible pairs 
        int count = 0; 
  
        // Check all possible pairs 
        for (int i = 1; i <= n; i++) { 
            for (int j = 1; j <= n; j++) { 
  
                // Calculating the value of ((n % i) % j) % n 
                int val = ((n % i) % j) % n; 
  
                // If value is equal to maximum 
                if (val == max) 
                    count++; 
            } 
        } 
  
        // Return the number of possible pairs 
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(countPairs(n)); 
    } 
} 

