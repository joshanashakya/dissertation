

// Java program for min rotation to unlock 
class GFG 
{ 
  
    // function for min rotation 
    static int minRotation(int input, int unlock_code) 
    { 
        int rotation = 0; 
        int input_digit, code_digit; 
  
        // iterate till input and unlock code become 0 
        while (input>0 || unlock_code>0) { 
  
            // input and unlock last digit as reminder 
            input_digit = input % 10; 
            code_digit = unlock_code % 10; 
  
            // find min rotation 
            rotation += Math.min(Math.abs(input_digit 
                       - code_digit), 10 - Math.abs( 
                          input_digit - code_digit)); 
  
            // update code and input 
            input /= 10; 
            unlock_code /= 10; 
        } 
  
        return rotation; 
    } 
  
    // driver code 
    public static void main (String[] args) { 
    int input = 28756; 
    int unlock_code = 98234; 
    System.out.println("Minimum Rotation = "+ 
                  minRotation(input, unlock_code)); 
    } 
} 
  
/* This code is contributed by Mr. Somesh Awasthi */

