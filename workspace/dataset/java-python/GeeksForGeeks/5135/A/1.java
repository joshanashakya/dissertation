

// Java program to print the Hut Star Pattern  
class GFG  
{ 
  
public static void main(String args[]) 
{ 
    int n = 7, i, j; 
  
    // LOOP FOR HUT PYRAMID  
    for (i = 0, j = 0; i < n; j++)  
    { 
        if (j == n + i)  
        { 
            j = -1; 
            ++i; 
            System.out.print("\n"); 
        } // print Center Star triangle  
        else if ((i + j) >= n - 1)  
        { 
            System.out.print("*"); 
        }  
        else 
        { 
            System.out.print(" "); 
        } 
    } 
  
    // LOOPS FOR LOWER WALLS  
    for (int k = 0; k < 3; k++)  
    { 
        // Left and right rectangle  
        for (int l = 0; l < n - 1 + i; l++) 
        { 
            if (l <= 2 || (l <= n - 1 + i &&  
                           l >= n - 4 + i))  
            { 
                System.out.print("*"); 
            }  
            else
            { 
                System.out.print(" "); 
            } 
        } 
        System.out.print("\n"); 
    } 
} 
} 
  
// This code is contributed 
// by PrinciRaj1992 

