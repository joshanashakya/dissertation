

// Java program to find LCM of digits of a number 
  
class GFG 
{ 
// define lcm function 
static int lcm_fun(int a, int b) 
{ 
    if (b == 0) 
        return a; 
    return lcm_fun(b, a % b); 
} 
  
static int digitLCM(int n) 
{ 
    int lcm = 1; 
    while (n > 0) 
    { 
        lcm = (n % 10 * lcm) / lcm_fun(n % 10, lcm); 
  
        // If at any point LCM become 0. 
        // return it 
        if (lcm == 0) 
            return 0; 
  
        n = n/10; 
    } 
    return lcm; 
} 
  
// driver code 
public static void main(String[] args) 
{ 
    int n = 397; 
    System.out.println(digitLCM(n)); 
} 
} 
// This code is contributed by mits 

