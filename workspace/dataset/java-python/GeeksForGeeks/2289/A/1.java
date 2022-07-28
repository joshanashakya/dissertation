

// Java code to generate first 'n' terms  
// of the Moser-de Bruijn Sequence 
  
class GFG  
{ 
      
// Function to generate nth term  
// of Moser-de Bruijn Sequence 
public static int gen(int n) 
{  
      
    // S(0) = 0 
    if (n == 0) 
        return 0; 
      
    // S(1) = 1 
    else if (n == 1) 
        return 1; 
      
    // S(2 * n) = 4 * S(n) 
    else if (n % 2 == 0) 
        return 4 * gen(n / 2); 
      
    // S(2 * n + 1) = 4 * S(n) + 1 
    else if (n % 2 == 1) 
        return 4 * gen(n / 2) + 1; 
    return 0; 
} 
  
// Generating the first 'n' terms  
// of Moser-de Bruijn Sequence 
public static void moserDeBruijn(int n) 
{ 
    for (int i = 0; i < n; i++) 
        System.out.print(gen(i) + " "); 
    System.out.println(); 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int n = 15; 
    System.out.println("First " + n +  
                       " terms of " +  
      "Moser-de Bruijn Sequence : "); 
    moserDeBruijn(n); 
} 
} 
  
// This code is contributed by JaideepPyne. 

