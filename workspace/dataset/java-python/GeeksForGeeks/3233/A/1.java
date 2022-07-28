

// Java implementation to find distinct 
// powers of N that add upto K 
  
class GFG{ 
   
// Function to return the highest power 
// of N not exceeding K 
static int highestPower(int n, int k) 
{ 
    int i = 0; 
    int a = (int) Math.pow(n, i); 
   
    // Loop to find the highest power 
    // less than K 
    while (a <= k) { 
        i += 1; 
        a = (int) Math.pow(n, i); 
    } 
    return i - 1; 
} 
   
// Initializing the PowerArray 
// with all 0's. 
static int b[] = new int[50]; 
   
// Function to print 
// the distinct powers of N 
// that add upto K 
static int PowerArray(int n, int k) 
{ 
    while (k>0) { 
   
        // Getting the highest 
        // power of n before k 
        int t = highestPower(n, k); 
   
        // To check if the power 
        // is being used twice or not 
        if (b[t]>0) { 
   
            // Print -1 if power 
            // is being used twice 
            System.out.print(-1); 
            return 0; 
        } 
   
        else
            // If the power is not visited, 
            // then mark the power as visited 
            b[t] = 1; 
   
        // Decrementing the value of K 
        k -= Math.pow(n, t); 
    } 
   
    // Printing the powers of N 
    // that sum up to K 
    for (int i = 0; i < 50; i++) { 
        if (b[i] > 0) { 
            System.out.print(i+ ", "); 
        } 
    } 
    return 0; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    int N = 3; 
    int K = 40; 
    PowerArray(N, K); 
} 
} 
  
// This code contributed by Rajput-Ji 

