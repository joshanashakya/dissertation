

// Java program to find MSB 
// number for given n. 
  
class GFG { 
  
    static int setBitNumber(int n) 
    { 
  
        // To find the position of the 
        // most significant set bit 
        int k = (int)(Math.log(n) / Math.log(2)); 
  
        // To return the the value of the number 
        // with set bit at k-th position 
        return (int)(Math.pow(2, k)); 
    } 
  
    // Driver code 
    public static void main(String arg[]) 
    { 
        int n = 273; 
        System.out.print(setBitNumber(n)); 
    } 
} 

