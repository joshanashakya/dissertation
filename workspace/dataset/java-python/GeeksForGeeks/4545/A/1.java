

// Java program to print above pattern 
import java.util.Scanner; 
class Pattern 
{ 
    void display(int n) 
    { 
      
        // 'sp' used for space and 'st' used for star 
        int sp = n / 2, st = 1; 
          
        // Outer for loop prints number of lines 
        for (int i = 1; i <= n; i++)  
        { 
            for (int j = 1; j <= sp; j++) 
            { 
                System.out.print(" "); 
            } 
            int count = 1; 
            for (int k = 1; k <= st; k++)  
            { 
                if (k % 2 == 0) 
                    System.out.print("*"); 
                else
                    System.out.print(count++); 
            } 
              
            System.out.println(); 
              
            if (i <= n / 2) 
            { 
                // Before reaching to half after 
                // every line space is decreased 
                // by 1 and star is increased by 2 
                sp = sp - 1; 
                st = st + 2; 
            } 
            else
            { 
                // After reaching to half 
                // space is increased by 1 
                // and star is decreased by 2 
                sp = sp + 1; 
                st = st - 2; 
            } 
        } 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int n = 5; 
        Pattern p = new Pattern(); 
        p.display(n); 
    } 
} 

