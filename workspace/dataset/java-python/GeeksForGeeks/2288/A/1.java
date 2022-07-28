

// Efficient Java program to print  
// Farey Sequence of order n 
class GFG 
{ 
  
// Optimized function to print  
// Farey sequence of order n 
static void farey(int n) 
{ 
    // We know first two terms are 0/1 and 1/n 
    double x1 = 0, y1 = 1, x2 = 1, y2 = n; 
  
    System.out.printf("%.0f/%.0f %.0f/%.0f", x1, y1, x2, y2); 
  
    double x, y = 0; // For next terms to be evaluated 
    while (y != 1.0)  
    { 
        // Using recurrence relation to find the next term 
        x = Math.floor((y1 + n) / y2) * x2 - x1; 
        y = Math.floor((y1 + n) / y2) * y2 - y1; 
  
        // Print next term 
        System.out.printf(" %.0f/%.0f", x, y); 
  
        // Update x1, y1, x2 and y2 for next iteration 
        x1 = x2; 
        x2 = x; 
        y1 = y2; 
        y2 = y; 
    } 
} 
  
// Driver program 
public static void main(String[] args) 
{ 
    int n = 7; 
    System.out.print("Farey Sequence of order " + n + " is\n"); 
    farey(n); 
} 
} 
  
// This code is contributed by Rajput-Ji 

