

// Java program to check if two numbers are bit rotations  
// of each other.  
class GFG { 
  
// function to check if two numbers are equal  
// after bit rotation  
    static boolean isRotation(long x, long y) { 
        // x64 has concatenation of x with itself.  
        long x64 = x | (x << 32); 
  
        while (x64 >= y) { 
            // comapring only last 32 bits  
            if (x64 == y) { 
                return true; 
            } 
  
            // right shift by 1 unit  
            x64 >>= 1; 
        } 
        return false; 
    } 
  
// driver code to test above function  
    public static void main(String[] args) { 
        long x = 122; 
        long y = 2147483678L; 
  
        if (isRotation(x, y) == false) { 
            System.out.println("Yes"); 
        } else { 
            System.out.println("No"); 
        } 
    } 
} 
  
// This code is contributed by 29AjayKumar 

