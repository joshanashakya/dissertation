

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count of required pairs 
    public static int countPairs(int n) 
    { 
  
        // Special case 
        if (n == 2) 
            return 4; 
  
        // Number which will give the max value 
        // for ((n % i) % j) % n 
        int num = ((n / 2) + 1); 
  
        // To store the maximum possible value of 
        // ((n % i) % j) % n 
        int max = n % num; 
  
        // Count of possible pairs 
        int count = n - max; 
  
        return count; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 5; 
        System.out.println(countPairs(n)); 
    } 
} 

