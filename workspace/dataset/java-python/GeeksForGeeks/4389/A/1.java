

// Java program for incrementing 
// and decrementing triangle pattern 
class GFG  
{ 
public static void main(String[] args) 
{ 
    int i, j, r, N, N1; 
    N1 = 3; 
    N = 0; 
    r = 5; 
    for (i = 0; i < r; i++)  
    { 
        if (i <= r / 2) 
        { 
            N = N1; 
            for (j = 0; j <= i; j++)  
            { 
                N++; 
            } 
            N1 = N; 
            for (j = 0; j <= i; j++)  
            { 
                N--; 
                System.out.print(N + " "); 
            } 
  
            System.out.println(); 
        } 
        else 
        { 
            for (j = i; j < r; j++) 
            { 
                N--; 
                System.out.print(N + " "); 
            } 
            System.out.println(); 
        } 
    } 
}}; 
  
// This code is contributed  
// by ChitraNayal 

