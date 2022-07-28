

// Java program to count the pairs  
// whose sum of digits is co-prime  
import java.util.*; 
  
class GFG 
{ 
static int GCD(int a, int b)  
{ 
if (b == 0) return a; 
return GCD(b, a % b); 
} 
// Function to find the elements  
// after doing the sum of digits 
static void makePairs(Vector<Integer> pairs,  
                      int a, int b)  
{ 
      
    // Traverse from a to b 
    for (int i = a; i <= b; i++) 
    { 
          
    // Find the sum of the digits  
    // of the elements in the given  
    // range one by one 
    int sumOfDigits = 0, k = i; 
    while(k > 0) 
    { 
        sumOfDigits += k % 10; 
        k /= 10; 
    } 
    if (sumOfDigits <= 162) 
        pairs.add(sumOfDigits); 
    } 
} 
  
// Function to count  
// the co-prime pairs 
static int countCoPrime(int a, int b) 
{ 
    Vector<Integer> pairs = new Vector<Integer>(); 
      
    // Function to make the pairs  
    // by doing the sum of digits 
    makePairs(pairs, a, b); 
    int count = 0; 
      
    // Count pairs that are co-primes 
    for(int i = 0; i < pairs.size(); i++) 
    for (int j = i+1; j < pairs.size(); j++) 
        if (GCD(pairs.get(i),  
                pairs.get(j)) == 1) 
                count++; 
              
return count; 
      
} 
  
// Driver code  
public static void main(String args[]) 
{  
    int a = 12, b = 15;  
  
    // Function to count the pairs  
    System.out.println(countCoPrime(a, b)); 
}  
} 
  
  
// This code is contributed by Arnab Kundu 

