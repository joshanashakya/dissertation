

// Java implementation of above approach  
class Solution 
{ 
static final int max_val=257;  
  
// Function to find prime characters in the String  
static int PrimeCharacters(String s)  
{  
  
    // USE SIEVE TO FIND ALL PRIME NUMBERS LESS  
    // THAN OR EQUAL TO max_val  
    // Create a Boolean array "prime[0..n]". A  
    // value in prime[i] will finally be false  
    // if i is Not a prime, else true.  
    boolean prime[]= new boolean[max_val+1]; 
      
    //initilize the value 
    for(int i=0;i<=max_val;i++) 
    prime[i]=true; 
  
    // 0 and 1 are not primes  
    prime[0] = false;  
    prime[1] = false;  
    for (int p = 2; p * p <= max_val; p++) {  
  
        // If prime[p] is not changed, then  
        // it is a prime  
        if (prime[p] == true) {  
  
            // Update all multiples of p  
            for (int i = p * 2; i <= max_val; i += p)  
                prime[i] = false;  
        }  
    }  
  
    int count = 0;  
  
    // Traverse all the characters  
    for (int i = 0; i < s.length(); ++i) {  
        if (prime[(int)(s.charAt(i))])  
            count++;  
    }  
  
    return count;  
}  
  
// Driver program  
public static void main(String args[]) 
{  
    String S = "geeksforgeeks";  
  
    // print required answer  
    System.out.print( PrimeCharacters(S));  
  
}  
} 
//contributed by Arnab Kundu 

