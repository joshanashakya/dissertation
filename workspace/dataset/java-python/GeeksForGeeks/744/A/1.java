

// Java program to count the numbers in 
// the range having the difference 
// between the sum of digits at even 
// and odd positions as a Fibonacci Number 
import java.util.*; 
  
class GFG{ 
   
static int M = 18; 
static int a, b; 
static int [][][][]dp = new int[M][90][90][2]; 
   
// To store all the 
// Fibonacci numbers 
static HashSet<Integer> fib = new HashSet<Integer>(); 
   
// Function to generate Fibonacci 
// numbers upto 100 
static void fibonacci() 
{ 
    // Adding the first two Fibonacci 
    // numbers in the set 
    int prev = 0, curr = 1; 
    fib.add(prev); 
    fib.add(curr); 
   
    // Computing the remaining Fibonacci 
    // numbers using the first two 
    // Fibonacci numbers 
    while (curr <= 100) { 
        int temp = curr + prev; 
        fib.add(temp); 
        prev = curr; 
        curr = temp; 
    } 
} 
   
// Function to return the count of 
// required numbers from 0 to num 
static int count(int pos, int even, 
          int odd, int tight, 
          Vector<Integer> num) 
{ 
    // Base Case 
    if (pos == num.size()) { 
        if (num.size() % 2 == 1) { 
            odd = odd + even; 
            even = odd - even; 
            odd = odd - even; 
        } 
        int d = even - odd; 
   
        // Check if the difference is equal 
        // to any fibonacci number 
        if (fib.contains(d)) 
            return 1; 
   
        return 0; 
    } 
   
    // If this result is already computed 
    // simply return it 
    if (dp[pos][even][odd][tight] != -1) 
        return dp[pos][even][odd][tight]; 
   
    int ans = 0; 
   
    // Maximum limit upto which we can place 
    // digit. If tight is 1, means number has 
    // already become smaller so we can place 
    // any digit, otherwise num[pos] 
    int limit = (tight==1 ? 9 : num.get(pos)); 
   
    for (int d = 0; d <= limit; d++) { 
        int currF = tight, currEven = even; 
        int currOdd = odd; 
   
        if (d < num.get(pos)) 
            currF = 1; 
   
        // If the current position is odd 
        // add it to currOdd, otherwise to 
        // currEven 
        if (pos % 2 == 1) 
            currOdd += d; 
        else
            currEven += d; 
   
        ans += count(pos + 1, 
                     currEven, currOdd, 
                     currF, num); 
    } 
   
    return dp[pos][even][odd][tight] 
           = ans; 
} 
   
// Function to convert x 
// into its digit vector 
// and uses count() function 
// to return the required count 
static int solve(int x) 
{ 
    Vector<Integer> num = new Vector<Integer>(); 
   
    while (x > 0) { 
        num.add(x % 10); 
        x /= 10; 
    } 
   
    Collections.reverse(num); 
   
    // Initialize dp 
      
    for(int i = 0; i < M; i++){ 
       for(int j = 0; j < 90; j++){ 
           for(int l = 0; l < 90; l++) { 
               for (int k = 0; k < 2; k++) { 
                   dp[i][j][l][k] = -1; 
               } 
           } 
       } 
   } 
    return count(0, 0, 0, 0, num); 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    // Generate fibonacci numbers 
    fibonacci(); 
   
    int L = 1, R = 50; 
    System.out.print(solve(R) - solve(L - 1) 
         +"\n"); 
   
    L = 50; 
    R = 100; 
    System.out.print(solve(R) - solve(L - 1) 
         +"\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

