

// Java program to find the position 
// of the given prime number 
class GFG{     
      
static final int limit = 10000000; 
static int []position = new int[limit + 1]; 
   
// Function to precompute the position 
// of every prime number using Sieve 
static void sieve() 
{ 
    // 0 and 1 are not prime numbers 
    position[0] = -1; 
    position[1] = -1; 
   
    // Variable to store the position 
    int pos = 0; 
    for (int i = 2; i <= limit; i++) { 
        if (position[i] == 0) { 
   
            // Incrementing the position for 
            // every prime number 
            position[i] = ++pos; 
            for (int j = i * 2; j <= limit; j += i) 
                position[j] = -1; 
        } 
    } 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    sieve(); 
   
    int n = 11; 
    System.out.print(position[n]); 
} 
} 
  
// This code is contributed by Rajput-Ji 

