

// Java program to find K-th smallest factor 
import java.util.*; 
  
class GFG{ 
  
// function to find the k'th divisor 
static void findkth(int n, int k) 
{ 
    // initialize a vector v 
    Vector<Integer> v = new Vector<Integer>(); 
  
    // store all the divisors 
    // so the loop will needs to run till sqrt ( n ) 
    for (int i = 1; i <= Math.sqrt(n); i++) { 
        if (n % i == 0) { 
            v.add(i); 
            if (i != Math.sqrt(n)) 
                v.add(n / i); 
        } 
    } 
  
    // sort the vector in an increasing order 
    Collections.sort(v); 
  
    // if k is greater than the size of vector 
    // then no divisor can be possible 
    if (k > v.size()) 
        System.out.print("Doesn't Exist"); 
      
    // else print the ( k - 1 )th value of vector 
    else
        System.out.print(v.get(k - 1)); 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 15, k = 2; 
  
    findkth(n, k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

