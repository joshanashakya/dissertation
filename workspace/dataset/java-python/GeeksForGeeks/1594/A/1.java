

// Java program to find the K-th smallest factor 
import java.util.*; 
  
class GFG 
{ 
  
// Function to find the k'th divisor 
static void findkth ( int n, int k) 
{ 
    // initialize vectors v1 and v2 
    Vector<Integer> v1 = new Vector<Integer>(); 
    Vector <Integer> v2 = new Vector<Integer>(); 
      
    // store all the divisors in the two vectors 
    // accordingly 
    for( int i = 1 ; i <= Math.sqrt( n ); i++ ) 
    { 
        if ( n % i == 0 )  
        { 
            v1.add ( i ); 
              
            if ( i != Math.sqrt ( n ) ) 
                v2.add ( n / i ); 
        } 
    } 
      
    // reverse the vector v2 to sort it 
    // in increasing order 
    Collections.reverse(v2); 
      
    // if k is greater than the size of vectors  
    // then no divisor can be possible 
    if ( k > (v1.size() + v2.size())) 
        System.out.print("Doesn't Exist"); 
      
    // else print the ( k - 1 )th value of vector  
    else
    { 
        // If K is lying in first vector 
        if(k <= v1.size()) 
            System.out.print(v1.get(k - 1)); 
          
        // If K is lying in second vector 
        else
            System.out.print(v2.get(k-v1.size() - 1)); 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 15, k = 2; 
      
    findkth ( n, k) ; 
} 
}  
  
// This code is contributed by PrinciRaj1992 

