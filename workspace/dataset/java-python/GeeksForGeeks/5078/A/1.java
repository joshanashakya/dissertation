

// Java implementation of above approach 
import java.io.*; 
  
class GFG  
{ 
  
// function to Find the number of 
// solutions for x < y, where 
// a <= x <= b and c <= y <= d  
// and x, y integers. 
static int NumberOfSolutions(int a, int b,  
                             int c, int d) 
{ 
    // to store answer 
    int ans = 0; 
  
    // iterate explicitly over all  
    // possible values of x 
    for (int i = a; i <= b; i++) 
        if (d >= Math.max(c, i + 1)) 
            ans += d - Math.max(c, i + 1) + 1; 
  
    // return answer 
    return ans; 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a = 2, b = 3, c = 3, d = 4; 
  
    // function call 
    System.out.println(NumberOfSolutions(a, b, c, d)); 
} 
} 
  
// This code is contributed  
// by inder_verma 

