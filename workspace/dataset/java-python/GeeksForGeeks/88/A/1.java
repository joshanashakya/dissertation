

// Java implementation to find the row 
// whose product has maximum number 
// of prime factors 
import java.util.*; 
  
class GFG{ 
   
static final int N = 3; 
static final int M = 5; 
   
static int Large = (int) 1e6; 
   
static Vector<Integer> prime = new Vector<Integer>(); 
   
// function for SieveOfEratosthenes 
static void SieveOfEratosthenes() 
{ 
   
    // Create a boolean array "isPrime[0..N]" 
    // and initialize all entries it as true. 
    // A value in isPrime[i] will finally be 
    // false if i is not a prime, else true. 
    boolean []isPrime = new boolean[Large + 1]; 
    Arrays.fill(isPrime, true); 
   
    for (int p = 2; p * p <= Large; p++) { 
   
        // check if isPrime[p] is not changed 
        if (isPrime[p] == true) { 
   
            // Update all multiples of p 
            for (int i = p * 2; i <= Large; i += p) 
                isPrime[i] = false; 
        } 
    } 
   
    // Print all isPrime numbers 
    for (int p = 2; p <= Large; p++) 
   
        if (isPrime[p]) 
   
            prime.add(p); 
} 
   
// function to display the answer 
static void Display(int arr[][], int row) 
{ 
   
    for (int i = 0; i < M; i++) 
        System.out.print(arr[row][i]+ " "); 
} 
   
// function to Count the row number of 
// divisors in particular row multiplication 
static void countDivisorsMult(int arr[][]) 
{ 
   
    // Find count of occurrences 
    // of each prime factor 
    HashMap<Integer,Integer> mp = new HashMap<Integer,Integer>(); 
    int row_no = 0; 
    long max_factor = 0; 
   
    for (int i = 0; i < N; i++) { 
        for (int j = 0; j < M; j++) { 
            int no = arr[i][j]; 
   
            for (int k = 0; k < prime.size(); k++) { 
                while (no > 1
                       && no % prime.get(k) == 0) { 
   
                    no /= prime.get(k); 
                    if(mp.containsKey(prime.get(k))) 
                        mp.put(prime.get(k), prime.get(k)+1); 
                    else
                        mp.put(prime.get(k), 1); 
                } 
   
                if (no == 1) 
                    break; 
            } 
        } 
   
        // Compute count of all divisors 
        int res = 1; 
        for (Map.Entry<Integer,Integer> it : mp.entrySet()) { 
            res *= (it.getValue() + 1L); 
        } 
   
        // Update row number if 
        // factors of this row is max 
        if (max_factor < res) { 
            row_no = i; 
            max_factor = res; 
        } 
   
        // Clearing map to store 
        // prime factors for next row 
        mp.clear(); 
    } 
   
    Display(arr, row_no); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
   
    int arr[][] = { { 1, 2, 3, 10, 23 }, 
                      { 4, 5, 6, 7, 8 }, 
                      { 7, 8, 9, 15, 45 } }; 
   
    SieveOfEratosthenes(); 
   
    countDivisorsMult(arr); 
   
} 
} 
  
// This code is contributed by Rajput-Ji 

