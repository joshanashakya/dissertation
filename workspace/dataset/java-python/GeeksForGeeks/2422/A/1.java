

// Java implementation of the approach 
  
class GFG 
{ 
// function to count 
// all permutations 
static void countPermutations(int N, int B) 
{ 
    // count of 
    // all permutations 
    int x = (int)Math.pow(B, N); 
  
    // count of permutations 
    // with leading zeros 
    int y = (int)Math.pow(B, N - 1); 
  
    // Return the permutations 
    // without leading zeros 
    System.out.println(x - y); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 6; 
    int B = 4; 
  
    countPermutations(N, B); 
} 
} 
  
// This code is contributed by mits 

