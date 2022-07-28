

// Java program to find sum prime 
// factors in given range. 
  
class GFG { 
  
    static final int MAX = 1000006; 
  
    // using sieve method to evaluating 
    // the prime factor of numbers 
    static void sieve(int count[]) 
    { 
        for (int i = 2; i * i <= MAX; i++) { 
            // if i is prime 
            if (count[i] == 0) { 
                for (int j = 2 * i; j < MAX; j += i) 
                    count[j]++; 
  
                // setting number of prime 
                // factor of a prime number. 
                count[i] = 1; 
            } 
        } 
    } 
  
    // Returns sum of counts of prime factors in 
    // range from l to r. This function mainly 
    // uses count[] which is filled by Sieve() 
    static int query(int count[], int l, int r) 
    { 
        int sum = 0; 
  
        // finding the sum of number of prime 
        // factor of numbers in a range. 
        for (int i = l; i <= r; i++) 
            sum += count[i]; 
  
        return sum; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int count[] = new int[MAX]; 
        sieve(count); 
  
        System.out.println(query(count, 6, 10) + " " + query(count, 1, 5)); 
    } 
} 
  
// This code is contributed by Anant Agarwal. 

