

// Java Program for incrementing 
// or decrementing triangle pattern 
import java.io.*; 
  
class GFG 
{ 
public static void main(String args[]) 
{ 
    int i, j, r, N, count = 0; 
    N = 3; // initializing N 
    N--; 
    r = 5; 
    for (i = 0; i < r; i++) 
    { 
        if (i <= r / 2)  
        { 
            count = N + 1; 
            for (j = 0; j <= i; j++)  
            { 
                N++; 
                System.out.print(N + " "); 
            } 
            System.out.println(); 
        } 
        else 
        { 
            N = count - (r - i); 
            count = N; 
            for (j = i; j < r; j++)  
            { 
                System.out.print(N + " "); 
                N++; 
            } 
            System.out.println(); 
        } 
    } 
} 
} 
  
// This code is contributed 
// by Subhadeep Gupta 

