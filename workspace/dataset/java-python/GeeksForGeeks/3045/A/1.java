

// Java program to find sum pf k-th powers of  
// first n natural numbers. 
  
import java.io.*; 
  
class GFG { 
  
  
// A global array to store factorials 
static int MAX_K = 15; 
static int fac[] = new int[MAX_K]; 
  
// Function to calculate the factorials 
// of all the numbers upto k 
static void factorial(int k) 
{ 
    fac[0] = 1; 
    for (int i = 1; i <= k + 1; i++) { 
        fac[i] = (i * fac[i - 1]); 
    } 
} 
  
// Function to return the binomial coefficient 
static  int bin(int a, int b) 
{ 
  
    // nCr = (n! * (n - r)!) / r! 
    int ans = 
            ((fac[a]) / (fac[a - b] * fac[b])); 
    return ans; 
} 
  
// Function to return the sum of kth powers of  
// n natural numbers 
static int sumofn(int n, int k) 
{ 
    int p = 0; 
    int num1, temp; 
    int arr[] = new int[1000]; 
    for (int j = 1; j <= k; j++) { 
  
        // When j is unity 
        if (j == 1) { 
            num1 = (n * (n + 1)) / 2; 
  
            // Calculating sum(n^1) of unity powers 
            // of n; storing sum(n^1) for sum(n^2) 
            arr[p++] = num1; 
  
            // If k = 1 then temp is the result 
            temp = num1; 
        } 
        else { 
            temp = ((int)Math.pow(n + 1, j + 1) - 1 - n); 
  
            // For finding sum(n^k) removing 1 and 
            // n * kCk from (n + 1)^k 
            for (int s = 1; s < j; s++) { 
  
                // Removing all kC2 * sum(n^(k - 2)) 
                // + ... + kCk - 1 * (sum(n^(k - (k - 1)) 
                temp = temp - 
                    (arr[j - s - 1] * bin(j + 1, s + 1)); 
            } 
            temp = temp / (j + 1); 
  
            // Storing the result for next sum of 
            // next powers of k 
            arr[p++] = temp; 
        } 
    } 
    temp = arr[p - 1]; 
    return temp; 
} 
  
// Driver code 
  
    public static void main (String[] args) { 
            int n = 5, k = 2; 
    factorial(k); 
    System.out.println( sumofn(n, k)); 
    } 
} 
// This code is contributed by anuj_67.. 

