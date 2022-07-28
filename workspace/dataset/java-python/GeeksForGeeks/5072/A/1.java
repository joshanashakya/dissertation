

// Java implementation of above approach  
import java.util.*; 
class Solution 
{ 
// Function to find maximum GCD  
// of N integers with product P  
static int maxGCD(int N, int P)  
{  
  
    int ans = 1;  
  
    // map to store prime factors of P  
    Map<Integer, Integer> prime_factors =   
                        new HashMap< Integer,Integer>();  
  
    // prime factorization of P  
    for (int i = 2; i * i <= P; i++) {  
  
        while (P % i == 0) {  
  
            if(prime_factors.get(i)==null) 
            prime_factors.put(i,1); 
            else
            prime_factors.put(i,(prime_factors.get(i)+1)); 
              
  
            P /= i;  
        }  
    }  
  
    if (P != 1)  
            if(prime_factors.get(P)==null) 
            prime_factors.put(P,1); 
            else
            prime_factors.put(P,(prime_factors.get(P)+1));  
  
    // traverse all prime factors and  
    // multiply its 1/N power to the result  
        Set< Map.Entry< Integer,Integer> > st = prime_factors.entrySet();     
    
       for (Map.Entry< Integer,Integer> me:st)  
       {  
             
        ans *= Math.pow(me.getKey(),me.getValue() / N);     
        } 
  
    return ans;  
}  
  
// Driver code  
public static void main(String args[]) 
{  
    int N = 3, P = 24;  
  
    System.out.println( maxGCD(N, P));  
  
}  
} 
//contributed by Arnab Kundu 

