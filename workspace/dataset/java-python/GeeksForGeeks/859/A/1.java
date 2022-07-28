

// Java implementation to find first digit of a 
// single number 
  
class Test { 
    static int firstDigit(int x) 
    { 
        // Keep dividing by 10 until it is 
        // greater than equal to 10 
        while (x >= 10) 
            x = x / 10; 
        return x; 
    } 
  
    // Driver method 
    public static void main(String args[]) 
    { 
        System.out.println(firstDigit(12345)); 
        System.out.println(firstDigit(5432)); 
    } 
} 

