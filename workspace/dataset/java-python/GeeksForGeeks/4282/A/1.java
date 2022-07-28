

// Check if the given chess  
// board is valid or not 
class GFG  
{ 
static int MAX = 2; 
  
static boolean isValid(int c[][], int n) 
{ 
    int X[] = { 0, -1, 0, 1 }; 
    int Y[] = { 1, 0, -1, 0 }; 
    boolean isValid = true; 
  
    // Traversing each cell  
    // of the chess board. 
    for (int i = 0; i < n; i++)  
    { 
        for (int j = 0; j < n; j++) 
        { 
  
            // for each adjacent cells 
            for (int k = 0; k < 4; k++)  
            { 
                int newX = i + X[k]; 
                int newY = j + Y[k]; 
  
                // checking if they have 
                // different color 
                if (newX < n && newY < n &&  
                    newX >= 0 && newY >= 0 && 
                    c[newX][newY] == c[i][j]) 
                { 
                    isValid = false; 
                } 
            } 
        } 
    } 
    return isValid; 
} 
  
// Driver Code 
public static void main(String[] args)  
{ 
    int n = 2; 
    int[][] c = {{ 1, 0 }, 
                 { 0, 1 }}; 
  
    if (isValid(c, n))  
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
}  
  
// This code is contributed by ChitraNayal 

