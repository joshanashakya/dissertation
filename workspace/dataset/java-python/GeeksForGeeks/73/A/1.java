

//Java program to check if a number 
//can be expressed as a^b. 
  
public class GFG { 
  
    static boolean isPower(int a) 
    { 
    if (a == 1) 
        return true; 
  
    for (int i = 2; i * i <= a; i++) { 
        double val = Math.log(a) / Math.log(i); 
        if ((val - (int)val) < 0.00000001) 
            return true; 
    } 
  
    return false; 
    } 
      
    // Driver code 
    public static void main(String[] args) { 
          
        int n = 16; 
        System.out.println(isPower(n) ? "Yes" : "No"); 
  
    } 
} 

