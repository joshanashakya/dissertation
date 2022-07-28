

// Java program to compute division upto n 
// decimal places. 
import java.util.*; 
  
class Eulerian { 
    public static void precisionCompute(int x, int y, int n) 
    { 
        // Base cases 
        if (y == 0) { 
            System.out.print("Infinite"); 
            return; 
        } 
        if (x == 0) { 
            System.out.print("0"); 
            return; 
        } 
        if (n <= 0) { 
            // Since n <= 0, don't compute after 
            // the decimal 
            System.out.print(x / y); 
            return; 
        } 
  
        // Handling negative numbers 
        if (((x > 0) && (y < 0)) || ((x < 0) && (y > 0))) { 
            System.out.print("-"); 
            x = x > 0 ? x : -x; 
            y = y > 0 ? y : -y; 
        } 
  
        // Integral division 
        int d = x / y; 
  
        // Now one by print digits after dot 
        // using school division method. 
        for (int i = 0; i <= n; i++) { 
            System.out.print(d); 
            x = x - (y * d); 
            if (x == 0) 
                break; 
            x = x * 10; 
            d = x / y; 
            if (i == 0) 
                System.out.print("."); 
        } 
    } 
  
    public static void main(String[] args) 
    { 
        int x = 22, y = 7, n = 15; 
        precisionCompute(x, y, n); 
    } 
} 
  
// This code is contributed by rishabh_jain 

