

// Java implementation of the above approach 
  
import java.util.*; 
  
class GFG{ 
   
// Function to check whether a String 
// is a prime number or not 
static boolean checkPrime(String number) 
{ 
    if(number.length()==0) 
        return true; 
    int num = Integer.parseInt(number); 
    for (int i = 2; i * i <= num; i++) 
        if ((num % i) == 0) 
            return false; 
    return true; 
} 
   
// A function to find the minimum 
// number of segments the given String 
// can be divided such that every 
// segment is a prime 
static int splitIntoPrimes(String number) 
{ 
    int numLen = number.length(); 
   
    // Declare a splitdp[] array 
    // and initialize to -1 
    int []splitDP = new int[numLen + 1]; 
    Arrays.fill(splitDP, -1); 
   
    // Build the DP table in 
    // a bottom-up manner 
    for (int i = 1; i <= numLen; i++) { 
   
        // Initially Check if the entire prefix is Prime 
        if (i <= 6 && checkPrime(number.substring(0, i))) 
            splitDP[i] = 1; 
   
        // If the Given Prefix can be split into Primes 
        // then for the remaining String from i to j 
        // Check if Prime. If yes calculate 
        // the minimum split till j 
        if (splitDP[i] != -1) { 
            for (int j = 1; j <= 6 && i + j <= numLen; j++) { 
   
                // To check if the subString from i to j 
                // is a prime number or not 
                if (checkPrime(number.substring(i, i+j))) { 
   
                    // If it is a prime, then update the dp array 
                    if (splitDP[i + j] == -1) 
                        splitDP[i + j] = 1 + splitDP[i]; 
                    else
                        splitDP[i + j] = Math.min(splitDP[i + j], 
                                             1 + splitDP[i]); 
                } 
            } 
        } 
    } 
   
    // Return the minimum number of splits 
    // for the entire String 
    return splitDP[numLen]; 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    System.out.print(splitIntoPrimes("13499315")+ "\n"); 
    System.out.print(splitIntoPrimes("43")+ "\n"); 
} 
} 
  
// This code contributed by Princi Singh 

