

// Java Program to print pyramid 
// pattern using numbers 
class GFG 
{ 
// Function to print pyramid pattern 
static void printPattern(int n) 
{ 
    int t; 
  
    // outer loop to print rows 
    for (int i = 1; i <= n; i++)  
    { 
  
        // inner loop to print spaces 
        for (int j = i; j < n; j++) 
            System.out.print("\t"); 
  
        // calculate initial value 
        t = i; 
  
        // inner loop to print pattern 
        for (int k = 1; k <= i; k++)  
        { 
            System.out.print(t + "\t\t"); 
            t = t + n - k; 
        } 
        System.out.println(); 
    } 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int n = 6; 
    printPattern(n); 
} 
} 
  
// This code is contributed by iAyushRaj 

