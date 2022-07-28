

// Java program to find the count of Steps to 
// reduce N to zero by subtracting its most 
// significant digit at every step 
  
  
class GFG{ 
// Function to count the number 
// of digits in a number m 
static int countdig(int m) 
{ 
    if (m == 0) 
        return 0; 
    else
        return 1 + countdig(m / 10); 
} 
  
// Function to count the number of 
// steps to reach 0 
static int countSteps(int x) 
{ 
    // count the total number of stesp 
    int c = 0; 
    int last = x; 
  
    // iterate till we reach 0 
    while (last>0) { 
  
        // count the digits in last 
        int digits = countdig(last); 
  
        // decrease it by 1 
        digits -= 1; 
  
        // find the number on whose division, 
        // we get the first digit 
        int divisor = (int)Math.pow(10, digits); 
  
        // first digit in last 
        int first = last / divisor; 
  
        // find the first number less than 
        // last where the first digit changes 
        int lastnumber = first * divisor; 
  
        // find the number of numbers 
        // with same first digit that are jumped 
        int skipped = (last - lastnumber) / first; 
  
        skipped += 1; 
  
        // count the steps 
        c += skipped; 
  
        // the next number with a different 
        // first digit 
        last = last - (first * skipped); 
    } 
  
    return c; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 14; 
  
    System.out.println(countSteps(n)); 
} 
} 
// This code is contributed by mits 

