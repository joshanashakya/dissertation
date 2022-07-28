

// Java program to generate 
// n numbers with given factors 
import java.io.*; 
  
class GFG  
{ 
      
// Generate n numbers with 
// factors in factor[] 
static void generateNumbers(int factor[], 
                            int n, int k) 
{ 
    // array of k to store  
    // next multiples of  
    // given factors  
    int next[] = new int[k]; 
  
    // Prints n numbers  
    int output = 0; // Next number to 
                    // print as output  
    for (int i = 0; i < n;) 
    { 
        // Find the next  
        // smallest multiple 
        int toincrement = 0; 
        for (int j = 0; j < k; j++) 
            if (next[j] < next[toincrement]) 
                toincrement = j; 
  
        // Printing minimum in  
        // each iteration print  
        // the value if output  
        // is not equal to current 
        // value(to avoid the  
        // duplicates) 
        if (output != next[toincrement]) 
        { 
            output = next[toincrement]; 
            System.out.print( 
                   next[toincrement] + " "); 
            i++; 
        } 
  
        // incrementing the  
        // current value by the 
        // respective factor 
        next[toincrement] +=  
               factor[toincrement]; 
    } 
} 
  
// Driver code 
public static void main (String[] args)  
{ 
    int factor[] = {3, 5, 7}; 
    int n = 10; 
    int k = factor.length; 
    generateNumbers(factor, n, k); 
} 
} 
  
// This code is contributed  
// by ajit 

