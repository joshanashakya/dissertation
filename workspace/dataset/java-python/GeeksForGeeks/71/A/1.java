

// Java program to find the 
// three numbers 
import java.util.*; 
  
class GFG{ 
   
// fucntion to find 3 distinct number 
// with given product 
static void getnumbers(int n) 
{ 
    // Declare a vector to store 
    // divisors 
    Vector<Integer> divisor = new Vector<Integer>(); 
   
    // store all divisors of number 
    // in array 
    for (int i = 2; i * i <= n; i++) { 
   
        // store all the occurence of 
        // divisors 
        while (n % i == 0) { 
            divisor.add(i); 
            n /= i; 
        } 
    } 
   
    // check if n is not equals to -1 
    // then n is also a prime factor 
    if (n != 1) { 
        divisor.add(n); 
    } 
   
    // Initialize the variables with 1 
    int a, b, c, size; 
    a = b = c = 1; 
    size = divisor.size(); 
   
    for (int i = 0; i < size; i++) { 
   
        // check for first number a 
        if (a == 1) { 
            a = a * divisor.get(i); 
        } 
   
        // check for second number b 
        else if (b == 1 || b == a) { 
            b = b * divisor.get(i); 
        } 
   
        // check for third number c 
        else { 
            c = c * divisor.get(i); 
        } 
    } 
   
    // check for all unwanted codition 
    if (a == 1 || b == 1 || c == 1
        || a == b || b == c || a == c) { 
        System.out.print("-1" +"\n"); 
    } 
    else { 
        System.out.print(a +" "+ b 
                +" "+ c +"\n"); 
    } 
} 
   
// Driver function 
public static void main(String[] args) 
{ 
    int n = 64; 
    getnumbers(n); 
} 
} 
  
// This code is contributed by sapnasingh4991 

