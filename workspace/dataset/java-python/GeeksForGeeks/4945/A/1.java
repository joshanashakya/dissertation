

// Java program to print  
// the Cot Bed Pattern  
  
public class Improve { 
      
    // function to print the pattern  
    static void pattern(int nos, int i, int space)  
    {  
        char prt = '$';  
        int s, j;  
        
        // loop for the spacing between the $ sign  
        for (s = nos; s >= 1; s--) {  
            System.out.print("  ");  
        }  
        
        // skipping the $  
        for (j = 1; j <= i; j++) {  
            if (space != 0) {  
                if (i == 9 && j == 1) {  
                    continue;  
                }  
            }  
        
            // printing the $  
            if (i == 1 || i == 9) {  
                System.out.print(prt + "");  
            }  
            else if (j == 1 || j == i) {  
                System.out.print(prt + "");  
            }  
            else {  
                System.out.print("  ");  
            }  
        }  
    }  
    // Driver code   
    public static void main(String args[]) 
    { 
           int i, nos = 0, nosp = -1, nbsp = -1;  
            for (i = 9; i >= 1;  i -= 2) {  
            
                // printing the first upper triangle  
                pattern(nos, i, 0);  
            
                // printing the second upper triangle  
                pattern(nosp, i, 1);  
            
                // printing the third upper triangle  
                pattern(nbsp, i, 1);  
            
                System.out.println();  
                nos++;  
                nosp = nosp + 2;  
                nbsp = nbsp + 2;  
            }  
            
             nos = 3; 
             nosp = 5; 
             nbsp = 5 ;  
            
            for (i = 3; i <= 9; i += 2) {  
            
                // printing the first lower triangle  
                pattern(nos, i, 0);  
            
                // printing the second lower triangle  
                pattern(nosp, i, 1);  
            
                // printing the third lower triangle  
                pattern(nbsp, i, 1);  
            
                System.out.println();  
                nos--;  
                nosp = nosp - 2;  
                nbsp = nbsp - 2;  
            }  
            
    } 
    // This Code is contributed by ANKITRAI1 
} 

