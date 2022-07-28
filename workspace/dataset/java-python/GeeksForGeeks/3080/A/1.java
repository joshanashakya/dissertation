

// Java implementation of the approach 
import java.util.*; 
  
class GFG  
{ 
static class pair  
{  
    int first, second;  
    public pair(int first, int second)  
    {  
        this.first = first;  
        this.second = second;  
    }  
}  
  
// Function to multiply two complex numbers modulo M 
static pair Multiply (pair p, pair q, int M) 
{ 
    // Multiplication of two complex numbers is  
    // (a + ib)(c + id) = (ac - bd) + i(ad + bc) 
      
    int x = ((p.first * q.first) % M - 
             (p.second * q.second) % M + M) % M; 
      
    int y = ((p.first * q.second) % M +  
             (p.second * q.first) % M) % M; 
  
    // Return the multiplied value 
    return new pair(x, y); 
} 
  
  
// Function to calculate the  
// complex modular exponentiation 
static pair compPow(pair complex, int k, int M) 
{ 
    // Here, res is initialised to (1 + i0) 
    pair res = new pair(1, 0 );  
      
    while (k > 0)  
    { 
        // If k is odd 
        if (k % 2 == 1) 
        { 
            // Multiply 'complex' with 'res' 
            res = Multiply(res, complex, M);  
        } 
          
        // Make complex as complex*complex 
        complex = Multiply(complex, complex, M); 
          
        // Make k as k/2 
        k = k >> 1;  
    } 
      
    // Return the required answer 
    return res; 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int A = 7, B = 3, k = 10, M = 97; 
      
    // Function call 
    pair ans = compPow(new pair(A, B), k, M); 
      
    System.out.println(ans.first + " + i" +  
                       ans.second);  
} 
} 
  
// This code is contributed by PrinciRaj1992 

