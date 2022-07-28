

// Java program to print the pyramid pattern 
  
class GFG { 
      
// Print the pattern upto n 
static void printPattern(int n)  
{ 
    // Printing upper part 
    for (int i = 1; i <= n; i++) { 
    for (int j = 1; j <= i; j++) 
        System.out.print(i); 
    System.out.print("\n"); 
    } 
  
    // printing lower part 
    for (int i = n - 1; i > 0; i--) { 
    for (int j = i; j > 0; j--) 
        System.out.print(i); 
    System.out.print("\n"); 
    } 
} 
  
// Driver code 
public static void main(String arg[])  
{ 
    int n = 8; 
    printPattern(n); 
} 
} 
  
// This code is contributed by Anant Agarwal. 

