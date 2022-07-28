

// Java program to find minimum number 
// of steps to reach M from N 
class CFG 
{ 
      
// Function to find a minimum number 
// of steps to reach M from N 
static int Minsteps(int n, int m) 
{ 
    int ans = 0; 
      
    // Continue till m is greater than n 
    while(m > n) 
    { 
        // If m is odd 
        if(m % 2 != 0)  
        { 
            // add one 
            m++; 
            ans++; 
        } 
          
        // divide m by 2      
        m /= 2; 
        ans++; 
    } 
      
    // Return the required answer 
    return ans + n - m; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 4, m = 6; 
      
    System.out.println(Minsteps(n, m)); 
} 
} 
  
// This code is contributed by Code_Mech 

