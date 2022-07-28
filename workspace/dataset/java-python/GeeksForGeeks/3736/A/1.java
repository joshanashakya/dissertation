

// Java implementation of the approach 
class GFG  
{ 
  
    // Function to print sum of 2 numbers 
    // without propagating carry 
    static int printSum(int a, int b)  
    { 
        int res = 0; 
  
        int temp1 = 0, temp2 = 0; 
  
        // Reverse a 
        while (a != 0)  
        { 
            temp1 = temp1 * 10 + (a % 10); 
            a /= 10; 
        } 
        a = temp1; 
  
        // Reverse b 
        while (b != 0)  
        { 
            temp2 = temp2 * 10 + (b % 10); 
            b /= 10; 
        } 
        b = temp2; 
  
        // Generate sum 
        // Since length of both a and b are same, 
        // take any one of them. 
        while (a != 0)  
        { 
            // Extract digits from a and b and add 
            int sum = (a % 10 + b % 10); 
  
            // If sum is single digit 
            if (sum / 10 == 0)  
            { 
                res = res * 10 + sum; 
            }  
            else
            { 
                // If sum is not single digit 
                // reverse sum 
                temp1 = 0; 
                while (sum != 0) 
                { 
                    temp1 = temp1 * 10 + (sum % 10); 
                    sum /= 10; 
                } 
                sum = temp1; 
  
                // Extract digits from sum and append 
                // to result 
                while (sum != 0) 
                { 
                    res = res * 10 + (sum % 10); 
                    sum /= 10; 
                } 
            } 
  
            a /= 10; 
            b /= 10; 
        } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args)  
    { 
  
        int a = 7752, b = 8834; 
        System.out.println(printSum(a, b)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

