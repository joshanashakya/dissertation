

// Java program to count number of 
// binary Strings without consecutive 1’s 
class GFG{ 
   
// Table to store the solution of 
// every sub problem 
static int [][][]memo = new int[32][2][2]; 
   
// Function to fill the table 
/* Here, 
   pos: keeps track of current position. 
   f1: is the flag to check if current 
         number is less than N or not. 
   pr: represents the previous digit 
*/
static int dp(int pos, int fl, int pr, String bin) 
{ 
    // Base case 
    if (pos == bin.length()) 
        return 1; 
   
    // Check if this subproblem 
    // has already been solved 
    if (memo[pos][fl][pr] != -1) 
        return memo[pos][fl][pr]; 
   
    int val = 0; 
   
    // Placing 0 at the current position 
    // as it does not violate the condition 
    if (bin.charAt(pos) == '0') 
        val = val + dp(pos + 1, fl, 0, bin); 
   
    // Here flag will be 1 for the 
    // next recursive call 
    else if (bin.charAt(pos) == '1') 
        val = val + dp(pos + 1, 1, 0, bin); 
   
    // Placing 1 at this position only if 
    // the previously inserted number is 0 
    if (pr == 0) { 
   
        // If the number is smaller than N 
        if (fl == 1) { 
            val += dp(pos + 1, fl, 1, bin); 
        } 
   
        // If the digit at current position is 1 
        else if (bin.charAt(pos) == '1') { 
            val += dp(pos + 1, fl, 1, bin); 
        } 
    } 
   
    // Storing the solution to this subproblem 
    return memo[pos][fl][pr] = val; 
} 
   
// Function to find the number of integers 
// less than or equal to N with no 
// consecutive 1’s in binary representation 
static int findIntegers(int num) 
{ 
    // Convert N to binary form 
    String bin = ""; 
   
    // Loop to convert N 
    // from Decimal to binary 
    while (num > 0) { 
        if (num % 2 == 1) 
            bin += "1"; 
        else
            bin += "0"; 
        num /= 2; 
    } 
    bin = reverse(bin); 
   
    // Initialising the table with -1. 
    for(int i = 0; i < 32; i++){ 
        for(int j = 0; j < 2; j++){ 
            for(int l = 0; l < 2; l++) 
                memo[i][j][l] = -1; 
        } 
    } 
   
    // Calling the function 
    return dp(0, 0, 0, bin); 
} 
static String reverse(String input) { 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--) { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
}  
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 12; 
    System.out.print(findIntegers(N)); 
   
} 
} 
  
// This code is contributed by sapnasingh4991 

