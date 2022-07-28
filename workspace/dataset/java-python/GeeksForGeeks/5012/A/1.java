

// Java implementation of compution of 
// arithmetic mean, geometric mean 
// and harmonic mean 
import java.io.*; 
  
class GeeksforGeeks { 
      
    // Function to calculate arithmetic  
    // mean, geometric mean and harmonic mean 
    static double compute(int a, int b) 
    { 
  
        double AM, GM, HM; 
  
        AM = (a + b) / 2; 
        GM = Math.sqrt(a * b); 
        HM = (GM * GM) / AM; 
        return HM; 
    } 
      
    // Driver function 
    public static void main(String args[]) 
    { 
        int a = 5, b = 15; 
        double HM = compute(a, b); 
        String str = ""; 
        str = str + HM; 
        System.out.print("Harmonic Mean between "  
                         + a + " and " + b + " is "  
                         + str.substring(0, 5)); 
    } 
} 

