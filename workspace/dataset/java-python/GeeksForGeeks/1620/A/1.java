

// Java implementation of the approach 
class GFG  
{ 
  
// Function to print the required matrix 
static void printMatrix(int n, int m) 
{ 
  
    // Impossible to generate 
    // the required matrix 
    if (n < 5 || m < 5)  
    { 
        System.out.print(-1); 
        return; 
    } 
  
    // Store all the vowels 
    char[] s = "aeiou".toCharArray(); 
  
    // Print the matrix 
    for (int i = 0; i < n; i++)  
    { 
  
        // Print vowels for every index 
        for (int j = 0; j < m; j++)  
        { 
            System.out.print(s[j % 5] + " "); 
        } 
        System.out.println(); 
        char c = s[0]; 
  
        // Shift the vowels by one 
        for (int k = 0; k < 4; k++)  
        { 
            s[k] = s[k + 1]; 
        } 
  
        s[4] = c; 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int n = 5, m = 5; 
  
    printMatrix(n, m); 
} 
} 
  
// This code has been contributed by 29AjayKumar 

