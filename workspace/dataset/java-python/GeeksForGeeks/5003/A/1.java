

// Java implementation of the approach 
public class GFG { 
  
    // Function to return the count of 
    // valid values of x 
    static int countX(int n) 
    { 
        // Convert n into binary String 
        String binary = Integer.toBinaryString(n); 
  
        // To store the count of 1s 
        int count = 0; 
  
        for (int i = 0; i < binary.length(); i++) { 
  
            // If current bit is 1 
            if (binary.charAt(i) == '1') 
                count++; 
        } 
  
        // Calculating answer 
        int answer = (int)Math.pow(2, count); 
        return answer; 
    } 
  
    // Driver code 
    public static void main(String args[]) 
    { 
        int n = 5; 
        int answer = countX(n); 
        System.out.println(answer); 
    } 
} 

