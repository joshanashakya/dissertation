

// Java program to  
// calculate clock delay 
class GFG 
{ 
  
// Function definition 
// with logic 
static int lagDuration(int h1, int m1,  
                       int h2, int m2,  
                       int k) 
{ 
    int lag, t1, t2; 
  
    // Conversion to minutes 
    t1 = (h1 + k) * 60 + m1; 
  
    // Conversion to minutes 
    t2 = h2 * 60 + m2; 
  
    // Calculating difference 
    lag = t1 - t2; 
    return lag; 
} 
  
// Driver Code 
public static void main(String args[]) 
{ 
    int h1 = 12, m1 = 0; 
    int h2 = 12, m2 = 58; 
    int k = 1; 
  
    int lag = lagDuration(h1, m1, h2, m2, k); 
    System.out.println("Lag = " + lag +  
                       " minutes"); 
} 
} 
  
// This code is contributed 
// by Kirti_Mangal 

