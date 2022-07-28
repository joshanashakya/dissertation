

// A memoization based recursive  
// program to count numbers with  
// difference between odd and  
// even digit sums as 1 
class GFG  
{ 
      
// A lookup table used for memoization. 
static int [][][][]lookup = new int[50][1000][1000][2]; 
  
// Memnoization based recursive  
// function to count numbers 
// with even and odd digit sum  
// difference as 1. This function 
// conisders leading zero as a digit 
static int countRec(int digits, int esum, 
                            int osum, int isOdd, int n) 
{ 
    // Base Case 
    if (digits == n) 
        return (esum - osum == 1)?1:0; 
  
    // If current subproblem is already computed 
    if (lookup[digits][esum][osum][isOdd] != -1) 
        return lookup[digits][esum][osum][isOdd]; 
  
    // Initialize result 
    int ans = 0; 
  
    // If current digit is odd, then 
    // add it to odd sum and recur 
    if (isOdd==1) 
    for (int i = 0; i <= 9; i++) 
        ans += countRec(digits+1, esum, osum+i, 0, n); 
    else // Add to even sum and recur 
    for (int i = 0; i <= 9; i++) 
        ans += countRec(digits+1, esum+i, osum, 1, n); 
  
    // Store current result in lookup  
    // table and return the same 
    return lookup[digits][esum][osum][isOdd] = ans; 
} 
  
// This is mainly a wrapper over countRec. It 
// explicitly handles leading digit and calls 
// countRec() for remaining digits. 
static int finalCount(int n) 
{ 
    // Initialize number digits considered so far 
    int digits = 0; 
  
    // Initialize all entries of lookup table 
    for(int i = 0; i < 50; i++) 
        for(int j = 0; j < 1000; j++) 
            for(int k = 0; k < 1000; k++) 
                for(int l = 0; l < 2; l++) 
                    lookup[i][j][k][l] = -1; 
  
  
    // Initializa final answer 
    int ans = 0; 
  
    // Initialize even and odd sums 
    int esum = 0, osum = 0; 
  
    // Explicitly handle first digit and  
    // call recursive function countRec  
    // for remaining digits. Note that 
    // the first digit is considered  
    // as even digit. 
    for (int i = 1; i <= 9; i++) 
        ans += countRec(digits+1, esum + i, osum, 1, n); 
  
    return ans; 
} 
  
// Driver program 
public static void main(String[] args)  
{ 
    int n = 3; 
    System.out.println("Coutn of "+ n +  
            " digit numbers is " + finalCount(n)); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

