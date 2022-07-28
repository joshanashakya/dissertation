

// Java program to Generating numbers that  
// are divisor of their right-rotations  
import java.util.*; 
import java.io.*; 
  
class GFG 
{ 
  
    // Function to generate m-digit  
    // numbers which are divisor of  
    // their right-rotation  
    static void generateNumbers(int m) 
    { 
            ArrayList<Integer> numbers = new ArrayList<>(); 
            int k_max, x; 
  
            for (int y = 0; y < 10; y++)  
            { 
  
                k_max = (int)(Math.pow(10,m-2) * (10 * y + 1)) /  
                                (int)(Math.pow(10, m-1) + y); 
  
                for (int k = 1; k <= k_max; k++)  
                { 
                        x = (int)(y*(Math.pow(10,m-1)-k)) / (10 * k -1); 
  
                        if ((int)(y*(Math.pow(10,m-1)-k)) % (10 * k -1) == 0) 
                            numbers.add(10 * x + y); 
                } 
  
            } 
  
            Collections.sort(numbers); 
            for (int i = 0; i < numbers.size(); i++) 
                System.out.println(numbers.get(i)); 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
            int m = 3; 
            generateNumbers(m); 
    } 
} 
  
// This code is contributed by rachana soma 

