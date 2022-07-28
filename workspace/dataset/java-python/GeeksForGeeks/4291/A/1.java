

// Java program to print half  
// diamond number star pattern 
class GFG 
{ 
// Function to print 
// the given pattern 
static void printPattern(int r) 
{ 
    r = r / 2; 
    int count = r; 
  
    // loop to print  
    // upper half pattern 
    for (int i = 0; i < r; i++)  
    { 
        for (int j = r; j > i; j--) 
        { 
            if (j != r)  
            { 
                System.out.print("*" + count); 
            } 
            else 
            { 
                System.out.print(count); 
            } 
        } 
        count--; 
        System.out.print("\n"); 
    } 
    count++; 
  
    // loop to print lower 
    // half pattern 
    for (int i = 0; i < r; i++)  
    { 
        for (int j = 0; j <= i; j++)  
        { 
            if (j != 0) 
            { 
                System.out.print("*" + count); 
            } 
            else
            { 
                System.out.print(count); 
            } 
        } 
        count++; 
        System.out.print("\n"); 
    } 
} 
  
// Driver code 
public static void main(String [] args) 
{ 
    int n; 
      
    n = 6; 
      
    printPattern(n); 
} 
} 
  
// This code is contributed 
// by Smitha 

