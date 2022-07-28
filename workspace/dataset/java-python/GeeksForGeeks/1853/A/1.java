

// Java implementation of the  
// above appoach  
class GFG 
{ 
      
static final int N = 3,M =3;  
  
// Boolean function that returns  
// true or false  
static boolean check(int a[][], int b[][])  
{  
    // Traverse for all elements  
    for (int i = 1; i < N; i++)  
    {  
        for (int j = 1; j < M; j++)  
        {  
  
            // If both are not equal  
            if (a[i][j] != b[i][j])  
            {  
  
                // Change the parity of  
                // all corner elements  
                a[i][j] ^= 1;  
                a[0][0] ^= 1;  
                a[0][j] ^= 1;  
                a[i][0] ^= 1;  
            }  
        }  
    }  
  
    // Check if A is equal to B  
    for (int i = 0; i < N; i++) {  
        for (int j = 0; j < M; j++) {  
  
            // Not equal  
            if (a[i][j] != b[i][j])  
                return false;  
        }  
    }  
    return true;  
}  
  
// Driver Code  
public static void main(String args[]) 
{  
    // First binary matrix  
    int a[][] = { { 0, 1, 0 },  
                    { 0, 1, 0 },  
                    { 1, 0, 0 } };  
  
    // Second binary matrix  
    int b[][] = { { 1, 0, 0 },  
                    { 1, 0, 0 },  
                    { 1, 0, 0 } };  
  
    if (check(a, b))  
        System.out.print( "Yes");  
    else
        System.out.print( "No");  
}  
} 
  
// This code is contributed by Arnab Kundu 

