

// Java program to efficiently compute values  
// of euler totient function for multiple inputs.  
import java.util.*;  
  
class GFG{  
static int MAX = 100001;  
  
// Stores prime numbers upto MAX - 1 values  
static ArrayList<Integer> p = new ArrayList<Integer>(); 
  
// Finds prime numbers upto MAX-1 and  
// stores them in vector p  
static void sieve()  
{  
    int[] isPrime=new int[MAX+1];  
  
    for (int i = 2; i<= MAX; i++)  
    {  
        // if prime[i] is not marked before  
        if (isPrime[i] == 0)  
        {  
            // fill vector for every newly  
            // encountered prime  
            p.add(i);  
  
            // run this loop till square root of MAX,  
            // mark the index i * j as not prime  
            for (int j = 2; i * j<= MAX; j++)  
                isPrime[i * j]= 1;  
        }  
    }  
}  
  
// function to find totient of n  
static int phi(int n)  
{  
    int res = n;  
  
    // this loop runs sqrt(n / ln(n)) times  
    for (int i=0; p.get(i)*p.get(i) <= n; i++)  
    {  
        if (n % p.get(i)== 0)  
        {  
            // subtract multiples of p[i] from r  
            res -= (res / p.get(i));  
  
            // Remove all occurrences of p[i] in n  
            while (n % p.get(i)== 0)  
            n /= p.get(i);  
        }  
    }  
  
    // when n has prime factor greater  
    // than sqrt(n)  
    if (n > 1)  
    res -= (res / n);  
  
    return res;  
}  
  
// Driver code  
public static void main(String[] args)  
{  
    // preprocess all prime numbers upto 10 ^ 5  
    sieve();  
    System.out.println(phi(11));  
    System.out.println(phi(21));  
    System.out.println(phi(31));  
    System.out.println(phi(41));  
    System.out.println(phi(51));  
    System.out.println(phi(61));  
    System.out.println(phi(91));  
    System.out.println(phi(101));  
   
}  
} 
// this code is contributed by mits 

