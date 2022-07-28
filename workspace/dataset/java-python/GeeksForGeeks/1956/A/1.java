

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
      
static final int MAX = 32; 
  
static long []pow2 = new long[MAX]; 
static boolean []visited = new boolean[MAX]; 
static Vector<Long> ans = new Vector<>(); 
  
// Function to pre-calculate 
// all the powers of 2 upto MAX 
static void power_2() 
{ 
    long ans = 1; 
    for (int i = 0; i < MAX; i++)  
    { 
        pow2[i] = ans; 
        ans *= 2; 
    } 
} 
  
// Function to return the 
// count of set bits in x 
static int countSetBits(long x) 
{ 
  
    // To store the count 
    // of set bits 
    int setBits = 0; 
    while (x != 0)  
    { 
        x = x & (x - 1); 
        setBits++; 
    } 
  
    return setBits; 
} 
  
// Function to add num to the answer 
// by setting all bit positions as 0 
// which are also 0 in K 
static void add(long num) 
{ 
    int point = 0; 
    long value = 0; 
  
    for (int i = 0; i < MAX; i++)  
    { 
  
        // Bit i is 0 in K 
        if (visited[i]) 
            continue; 
        else 
        { 
            if (num %2== 1) 
            { 
                value += (1 << i); 
            } 
            num /= 2; 
        } 
    } 
  
    ans.add(value); 
} 
  
// Function to find and print N distinct 
// numbers whose bitwise OR is K 
static void solve(long n, long k) 
{ 
  
    // Choosing K itself as one number 
    ans.add(k); 
  
    // Find the count of set bits in K 
    int countk = countSetBits(k); 
  
    // Impossible to get N 
    // distinct integers 
    if (pow2[countk] < n) 
    { 
        System.out.print(-1); 
        return; 
    } 
  
    int count = 0; 
    for (long i = 0; i < pow2[countk] - 1; i++) 
    { 
  
        // Add i to the answer after 
        // setting all the bits as 0 
        // which are 0 in K 
        add(i); 
        count++; 
  
        // If N distinct numbers are generated 
        if (count == n) 
            break; 
    } 
  
    // Print the generated numbers 
    for (int i = 0; i < n; i++)  
    { 
        System.out.print(ans.get(i)+" "); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    long n = 3, k = 5; 
  
    // Pre-calculate all 
    // the powers of 2 
    power_2(); 
  
    solve(n, k); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

