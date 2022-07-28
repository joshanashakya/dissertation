

// Java for finding super power of n  
  
class GFG{  
static int MAX=100000;  
// global hash for prime  
static boolean[] prime=new boolean[100002];  
  
// sieve method for storing a list of prime  
static void SieveOfEratosthenes()  
{  
  
    for (int p = 2; p * p <= MAX; p++)  
        if (prime[p] == false)  
            for (int i = p * 2; i <= MAX; i += p)  
                prime[i] = true;  
}  
  
// function to return super power  
static int superpower(int n)  
{  
    SieveOfEratosthenes();  
    int superPower = 0, factor = 0;  
    int i = 2;  
    // find the super power  
    while (n > 1 && i <= MAX) {  
        if (!prime[i]) {  
            factor = 0;  
            while (n % i == 0 && n > 1) {  
                factor++;  
                n = n / i;  
            }  
  
            if (superPower < factor)  
                superPower = factor;  
        }  
        i++;  
    }  
  
    return superPower;  
}  
  
// Driver program  
public static void main(String[] args)  
{  
    int n = 256;  
    System.out.println(superpower(n)); 
}  
} 
// This code is contributed by mits 

