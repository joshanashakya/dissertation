

// Java implementation of the approach 
  
class GFG 
{ 
  
// Function to print the required series 
public static void printSeries(int n) 
{ 
    // Numerators for the first four numerators 
    // of the series 
    int[] nmtr = new int[]{ 1, 1, 1, 3 }; 
  
    // Denominators for the first four denominators 
    // of the series 
    int[] dntr = new int[]{ 0, 4, 2, 4 }; 
  
    for (int i = 1; i <= n; i++)  
    { 
  
        // If location of the term in the series is 
        // a multiple of 4 then there will be no denominator 
        if (i % 4 == 0) 
            System.out.print( nmtr[i % 4] + (i / 4) - 1 + " "); 
  
        // Otherwise there will be denominator 
        else 
        { 
  
            // Printing the numerator and the denominator terms 
            System.out.print( nmtr[i % 4] + ((i / 4) * dntr[i % 4]) 
                +"/" + dntr[i % 4] +" "); 
        } 
    } 
} 
  
// Driver code 
public static void main(String[] args) 
{ 
    int n = 9; 
    printSeries(n); 
} 
} 
  
// This code is contributed 
// by 29AjayKumar 

