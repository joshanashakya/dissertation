

// Java program to count  
// even and odd digits 
// in a given number  
// using char array 
  
import java.io.*; 
  
  
class GFG  
{ 
      
// Function to count digits 
static int countEvenOdd(char num[],  
                        int n) 
{ 
    int even_count = 0; 
    int odd_count = 0; 
    for (int i = 0; i < n; i++) 
    { 
        int x = num[i] - 48; 
        if (x % 2 == 0) 
            even_count++; 
        else
            odd_count++; 
    } 
  
    System.out.println ("Even count : " +  
                         even_count); 
    System.out.println( "Odd count : " + 
                         odd_count); 
  
    if (even_count % 2 == 0 &&  
        odd_count % 2 != 0) 
        return 1; 
    else
        return 0; 
} 
  
    // Driver Code 
    public static void main (String[] args)  
    { 
        char num[] = { 1, 2, 3 }; 
  
    int n = num.length; 
    int t = countEvenOdd(num, n); 
    if (t == 1) 
        System.out.println("YES") ; 
    else
        System.out.println("NO") ; 
    } 
} 
  
// This code is contributed by vt_m 

