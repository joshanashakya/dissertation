

// java program to find sum of numbers from 
// 1 to N which are in Lucas Sequence 
class GFG 
{ 
  
// Function to return the 
// required sum 
static int LucasSum(int N) 
{ 
    // Generate lucas number and keep on 
    // adding them 
    int sum = 0; 
    int a = 2, b = 1, c; 
  
    sum += a; 
  
    while (b <= N) { 
  
        sum += b; 
        c = a + b; 
        a = b; 
        b = c; 
    } 
  
    return sum; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int N = 20; 
    System.out.println(LucasSum(N)); 
      
} 
// This code is contributed by princiraj1992  
} 

