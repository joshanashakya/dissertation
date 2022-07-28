

// Java program to print reverse of 
// floyd's triangle 
import java.io.*; 
  
class GFG { 
    static void printReverseFloyd(int n) 
    { 
        int curr_val = n * (n + 1) / 2; 
        for (int i = n; i >= 1; i--) { 
            for (int j = i; j >= 1; j--) { 
                System.out.printf("%2d  ", curr_val--); 
            } 
  
            System.out.println(""); 
        } 
    } 
  
    // Driver method 
    public static void main(String[] args) 
    { 
        int n = 7; 
        printReverseFloyd(n); 
    } 
} 
// this article is contributed by manish kumar rai 

