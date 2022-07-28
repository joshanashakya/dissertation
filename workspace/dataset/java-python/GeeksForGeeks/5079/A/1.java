

// Java program to find the numbers of 
// values that satisfy the equation 
import java.util.Vector; 
  
class GFG 
{ 
  
// This function returns the sum of 
// the digits of a number 
static int getsum(int a) 
{ 
    int r = 0, sum = 0; 
    while (a > 0)  
    { 
        r = a % 10; 
        sum = sum + r; 
        a = a / 10; 
    } 
    return sum; 
} 
  
// This function creates 
// the array of valid numbers 
static void value(int a, int b, int c) 
{ 
    int co = 0, p = 0; 
    int no, r = 0, x = 0, q = 0, w = 0; 
    Vector<Integer> v = new Vector<Integer>(); 
  
    for (int i = 1; i < 82; i++)  
    { 
  
        // this computes s(x)^a 
        no = (int) Math.pow(i, a); 
  
        // this gives the result of equation 
        no = b * no + c; 
  
        if (no > 0 && no < 1000000000) 
        { 
            x = getsum(no); 
  
            // checking if the sum same as i 
            if (x == i) 
            { 
  
                // counter to keep track of numbers 
                q++; 
  
                // resultant array 
                v.add(no); 
                w++; 
            } 
        } 
    } 
  
    // prints the number 
    for (int i = 0; i < v.size(); i++)  
    { 
        System.out.print(v.get(i)+" "); 
    } 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int a = 2, b = 2, c = -1; 
  
    // calculate which value 
    // of x are possible 
    value(a, b, c); 
    } 
}  
  
// This code is contributed by  
// PrinciRaj1992 

