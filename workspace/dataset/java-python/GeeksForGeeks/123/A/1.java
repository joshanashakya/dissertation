

// Java implmentation to find the 
// count of numbers possible less  
// than N, such that every digit 
// is from the given set of digits 
import java.util.*; 
  
class GFG{ 
   
static int [][]dp = new int[15][2]; 
   
// Function to convert integer  
// into the String 
static String convertToString(int num) 
{ 
    return String.valueOf(num); 
} 
   
// Recursive function to find the 
// count of numbers possible less 
// than N, such that every digit 
// is from the given set of digits 
static int calculate(int pos, int tight,  
    int D[], int sz, String num) 
{ 
    // Base case 
    if (pos == num.length()) 
        return 1; 
       
    // Condition when the subproblem 
    // is computed previously 
    if (dp[pos][tight] != -1) 
        return dp[pos][tight]; 
   
    int val = 0; 
       
    // Condition when the number 
    // chosen till now is definietly 
    // smaller than the given number N 
    if (tight == 0) { 
           
        // Loop to traverse all the  
        // digits of the given set 
        for (int i = 0; i < sz; i++) { 
               
            if (D[i] < (num.charAt(pos) - '0')) { 
                val += calculate(pos + 1,  
                           1, D, sz, num); 
            } 
            else if (D[i] == num.charAt(pos) - '0') 
                val += calculate(pos + 1,  
                       tight, D, sz, num); 
        } 
    } 
    else { 
        // Loop to traverse all the  
        // digits from the given set 
        for (int i = 0; i < sz; i++) { 
            val += calculate(pos + 1,  
                    tight, D, sz, num); 
        } 
    } 
       
    // Store the solution for  
    // current subproblem 
    return dp[pos][tight] = val; 
} 
   
// Function to count the numbers 
// less then N from given set of digits 
static int countNumbers(int D[], int N, int sz) 
{ 
    // Converting the number to String 
    String num = convertToString(N); 
    int len = num.length(); 
       
    // Intially no subproblem 
    // is solved till now 
    for (int i = 0; i < 15; i++) 
        for (int j = 0; j < 2; j++) 
            dp[i][j] = -1; 
       
    // Find the solution of all the  
    // number equal to the length of 
    // the given number N 
    int ans = calculate(0, 0, D, sz, num); 
       
    // Loop to find the number less in  
    // in the length of the given number 
    for (int i = 1; i < len; i++) 
        ans += calculate(i, 1, D, sz, num); 
   
    return ans; 
} 
   
// Driver Code 
public static void main(String[] args) 
{ 
    int sz = 3; 
   
    int D[] = { 1, 4, 9 }; 
    int N = 10; 
       
    // Function Call 
    System.out.print(countNumbers(D, N, sz)); 
} 
} 
  
// This code is contributed by Rajput-Ji 

