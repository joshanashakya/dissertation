

// Java program to check whether the 
// Rows of Binary Matrix become unique 
// After Deleting a column. 
class GFG  
{ 
      
// Function to check whether rows of 
// Binary matrix become unique after 
// Deleting a column of from matrix. 
static int uniqueRows(int [][]s,  
                      int m, int n) 
{ 
    // Initialize variable count that 
    // stores the count of duplicate rows. 
    int i, j, count = 0; 
  
    // Take two nested loop and 
    // check weather rows already 
    // get seen then increment 
    // count by 1 then break the loop. 
    for (i = 0; i < n; i++) 
    { 
        for (j = 0; j < i; j++)  
        { 
            if (s[i] == s[j]) 
            { 
                count++; 
                break; 
            } 
        } 
    } 
  
    // Check if count>=1 then print No 
    // Else print Yes. 
    if (count >= 1)  
        System.out.println("No"); 
    else
        System.out.println("Yes"); 
    return 0; 
} 
  
// Driver code. 
public static void main(String[] args)  
{ 
    int m = 3, n = 3; 
    int s[][] = { { 1, 0, 1 }, 
                  { 0, 0, 0 }, 
                  { 1, 0, 0 } }; 
  
    // Function calling 
    uniqueRows(s, m, n); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

