

// Java program to count number of multiples  
// of 2 or 3 or 5 less than or equal to N 
  
class GFG{ 
static int count_setbits(int N) 
{  
    int cnt=0; 
    while(N>0) 
    { 
        cnt+=(N&1); 
        N=N>>1; 
    } 
    return cnt; 
} 
  
// Function to count number of multiples  
// of 2 or 3 or 5 less than or equal to N 
static int countMultiples(int n) 
{ 
    // As we have to check divisibility 
    // by three numbers, So we can implement 
    // bit masking 
    int multiple[] = { 2, 3, 5 }; 
      
    int count = 0, mask = (int)Math.pow(2, 3); 
      
    for (int i = 1; i < mask; i++) { 
  
        // we check whether jth bit 
        // is set or not, if jth bit 
        // is set, simply multiply 
        // to prod 
        int prod = 1; 
          
        for (int j = 0; j < 3; j++) { 
  
            // check for set bit 
            if ((i & 1 << j)>0) 
                prod = prod * multiple[j]; 
        } 
          
        // check multiple of product  
        if (count_setbits(i) % 2 == 1) 
            count = count + n / prod; 
        else
            count = count - n / prod; 
    } 
      
    return count; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 10; 
      
    System.out.println(countMultiples(n)); 
} 
} 
// this code is contributed by mits 

