

// Java program to print  
// the Hut Star Pattern  
    
public class GFG {  
    
    // Function to print the Hut-Star Pattern  
    static void printHutStar(int n)  
    {  
        int i, j;  
    
        // Printing the upper triangle  
        for (i = 0; i < n; i++) {  
    
            // Left space triangle  
            for (j = i + 1; j < n; j++)  
                System.out.print(" ");  
    
            // Center Star triangle  
            for (j = 0; j < (2 * i + 1); j++)  
                System.out.print("*");  
    
            System.out.println();  
        }  
    
        // Printing Lower rectangles  
        for (i = 0; i < 3; i++) {  
    
            // Left rectangle  
            for (j = 0; j < 3; j++)  
                System.out.print("*");  
    
            // Center Space rectangle  
            for (j = 0; j < (2 * n - 7); j++)  
                System.out.print(" ");  
    
            // Right rectangle  
            for (j = 0; j < 3; j++)  
                System.out.print("*");  
    
            System.out.println();  
        }  
    }  
    
    // Driver Code  
    public static void main(String args[])  
    {  
        int n = 7;  
    
        printHutStar(n);  
    }  
}  

