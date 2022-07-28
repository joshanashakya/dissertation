

// Java program to find smallest value of root 
// of an equation under given constraints. 
  
class GFG{ 
// function to check if the sum of digits is 
// equal to the summation assumed 
static boolean check(long a, long b) 
{ 
    long c = 0; 
  
    // calculate the sum of digit 
    while (a != 0) { 
        c = c + a % 10; 
        a = a / 10; 
    } 
  
    return (c == b); 
} 
  
// function to find the largest root possible. 
static long root(long n) 
{ 
    boolean found = false; 
    long mx = (long)1E18; 
  
    // iterate for all possible sum of digits. 
    for (long i = 0; i <= 90; i++) { 
  
        // check if discriminent is a perfect square. 
        long s = i * i + 4 * n; 
        long sq = (long)Math.sqrt(s); 
  
        // check if discriminent is a perfect square and 
        // if it as perefect root of the equation 
        if (sq * sq == s && check((sq - i) / 2, i)) { 
            found = true; 
            mx = Math.min(mx, (sq - i) / 2); 
        } 
    } 
  
    // function returns answer 
    if (found) 
        return mx; 
    else
        return -1; 
} 
  
// driver program to check the above function 
public static void main(String[] args) 
{ 
    long n = 110; 
    System.out.println(root(n)); 
} 
} 
// This code is contributed by mits 

