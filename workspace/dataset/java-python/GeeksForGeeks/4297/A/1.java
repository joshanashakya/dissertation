

// Java code to print the pattern 
import java.util.*; 
import java.lang.*; 
  
public class GeeksforGeeks{ 
      
    // function to generate the pattern. 
    public static void pattern(int n){ 
          
        // putting the space in line 1 
        for (int i = 1; i <= n * 2; i++)  
            System.out.print(" ");  
        System.out.print(0 + "\n");  
  
        // generating the middle pattern. 
        for (int i = 1; i <= (n * 2) - 1; i++) { 
  
        // printing the increasing pattern 
        if (i < n) { 
            for (int j = 1; j <= (n - i) * 2; j++) 
                System.out.print(" "); 
        } 
        else { 
            for (int j = 1; j <= (i % n) * 2; j++) 
                System.out.print(" "); 
        } 
  
        if (i < n) { 
            for (int j = 0; j <= i % n; j++) 
                System.out.print(j + " "); 
            for (int j = (i % n) - 1; j > 0; j--) 
                System.out.print(j + " "); 
            System.out.print(0); 
        } 
  
        // printing the decreasing pattern 
        else if (i > n) { 
            for (int j = 0; j <= n - (i - n); j++) 
                System.out.print(j + " "); 
  
            for (int j = (n - (i - n)) - 1; j > 0; j--) 
                System.out.print(j + " "); 
            System.out.print(0); 
        } 
        else { 
            for (int j = 0; j <= n; j++) 
                System.out.print(j + " "); 
            for (int j = n - 1; j > 0; j--) 
                System.out.print(j + " "); 
            System.out.print(0); 
        } 
        System.out.print("\n"); 
    } 
  
    // putting the space in last line 
        for (int i = 1; i <= n * 2; i++) 
        System.out.print(" "); 
        System.out.print(0); 
    } 
  
    // driver code 
    public static void main(String argc[]){ 
        int n = 4; 
        pattern(n); 
    } 
} 
  
/*This code is contributed by Sagar Shukla.*/

