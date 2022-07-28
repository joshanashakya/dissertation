

// Java program to print 
// Floyd's triangle 
class GFG 
{ 
    static void printFloydTriangle(int n) 
    { 
        int i, j, val = 1; 
        for (i = 1; i <= n; i++) 
        { 
            for (j = 1; j <= i; j++) 
            { 
                System.out.print(val + " "); 
                val++; 
            } 
            System.out.println(); 
                  
        } 
    } 
          
    // Driver Code 
    public static void main(String[] args)  
    { 
        printFloydTriangle(6); 
    } 
} 

