

// Java program to Count numbers 
// which can be represented as  
// sum of same parity primes 
import java.util.*; 
  
class GFG 
{ 
// Function to calculate count  
public static int calculate(int ar[],  
                            int size) 
{ 
    int count = 0;  
      
    for (int i = 0; i < size; i++)  
        if (ar[i] % 2 == 0 &&  
            ar[i] != 0 &&  
            ar[i] != 2)  
            count++;  
      
    return count;  
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int a[] = { 1, 3, 4, 6 };  
    int size = a.length;  
    System.out.print(calculate(a, size));  
} 
} 
  
// This code is contributed 
// by ankita_saini 

