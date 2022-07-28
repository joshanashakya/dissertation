

// Java program to find the smallest twin in given range  
  
class GFG { 
  
    static void printTwins(int low, int high) { 
        // Create a boolean array "prime[0..high]" and initialize  
        // all entries it as true. A value in prime[i] will finally  
        // be false if i is Not a prime, else true.  
        boolean prime[] = new boolean[high + 1], twin = false; 
        for (int i = 0; i < prime.length; i++) { 
            prime[i] = true; 
        } 
  
        prime[0] = prime[1] = false; 
  
        // Look for the smallest twin  
        for (int p = 2; p <= Math.floor(Math.sqrt(high)) + 1; p++) { 
            // If p is not marked, then it is a prime  
            if (prime[p]) { 
                // Update all multiples of p  
                for (int i = p * 2; i <= high; i += p) { 
                    prime[i] = false; 
                } 
            } 
        } 
  
        // Now print the smallest twin in range  
        for (int i = low; i <= high; i++) { 
            if (prime[i] && prime[i + 2]) { 
                int a = i + 2 ; 
                System.out.print("Smallest twins in given range: ("
                        + i + ", " + a + ")"); 
                twin = true; 
                break; 
            } 
        } 
  
        if (twin == false) { 
            System.out.println("No such pair exists"); 
        } 
    } 
  
// Driver program  
    public static void main(String[] args) { 
  
        printTwins(10, 100); 
    } 
} 
// This code contributed by Rajput-Ji 

