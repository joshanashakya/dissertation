

// Java program to implement 
// the above approach 
  
class GFG  
{ 
  
    // Function to find the leftmost 
    // unset bit in a number. 
    static int find_leftmost_unsetbit(int n) 
    { 
        int ind = -1; 
        int i = 1; 
        while (n > 0)  
        { 
            if ((n % 2) != 1) 
            { 
                ind = i; 
            } 
  
            i++; 
            n >>= 1; 
        } 
        return ind; 
    } 
  
    // Function that perform 
    // the step 
    static void perform_steps(int n)  
    { 
  
        // Find the leftmost unset bit 
        int left = find_leftmost_unsetbit(n); 
  
        // If the number has no bit 
        // unset, it means it is in form 2^x -1 
        if (left == -1)  
        { 
            System.out.print("No steps required"); 
            return; 
        } 
  
        // Count the steps 
        int step = 1; 
  
        // Iterate till number is of form 2^x - 1 
        while (find_leftmost_unsetbit(n) != -1) 
        { 
  
            // At even step increase by 1 
            if (step % 2 == 0) 
            { 
                n += 1; 
                System.out.println("Step" + step + ": Increase by 1"); 
            }  
              
            // Odd step xor with any 2^m-1 
            else
            { 
  
                // Find the leftmost unset bit 
                int m = find_leftmost_unsetbit(n); 
  
                // 2^m-1 
                int num = (int) (Math.pow(2, m) - 1); 
  
                // Perform the step 
                n = n ^ num; 
  
                System.out.println("Step" + step 
                        + ": Xor with " + num); 
            } 
  
            // Increase the steps 
            step += 1; 
        } 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int n = 39; 
        perform_steps(n); 
    } 
} 
  
// This code contributed by Rajput-Ji 

