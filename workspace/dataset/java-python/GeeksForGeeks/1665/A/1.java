

// Java program to find the sum  
// of all armstrong  numbers  
// in the given range  
class GFG { 
    // pref[] array to precompute 
    // the sum of all armstrong 
    // number 
    static int[] pref = new int[100001]; 
  
    // Function that return number 
    // num if num is armstrong 
    // else return 0 
    static int checkArmstrong(int x) { 
        int n = String.valueOf(x).length(); 
        int sum1 = 0; 
        int temp = x; 
        while (temp > 0) { 
            int digit = temp % 10; 
            sum1 += Math.pow(digit, n); 
            temp /= 10; 
        } 
        if (sum1 == x) 
            return x; 
        return 0; 
    } 
  
    // Function to precompute the 
    // sum of all armstrong numbers 
    // upto 100000 
    static void preCompute() { 
        for (int i = 1; i < 100001; i++) { 
            // checkarmstrong () 
            // return the number i 
            // if i is armstrong 
            // else return 0 
            pref[i] = pref[i - 1] + checkArmstrong(i); 
        } 
    } 
  
    // Function to prthe sum 
    // for each query 
    static void printSum(int L, int R) { 
        System.out.println(pref[R] - pref[L - 1]); 
  
    } 
  
    // Function to prsum of all 
    // armstrong numbers between 
    // [L, R] 
    static void printSumarmstrong(int[][] arr, int Q) { 
  
        // Function that pre computes 
        // the sum of all armstrong 
        // numbers 
        preCompute(); 
  
        // Iterate over all Queries 
        // to prthe sum 
        for (int i = 0; i < Q; i++) { 
            printSum(arr[i][0], arr[i][1]); 
        } 
  
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        // Queries 
        int Q = 2; 
        int[][] arr = { { 1, 13 }, { 121, 211 } }; 
  
        // Function that prthe 
        // the sum of all armstrong 
        // number in Range [L, R] 
        printSumarmstrong(arr, Q); 
    } 
} 
  
// This code is contributed by 29AjayKumar 

