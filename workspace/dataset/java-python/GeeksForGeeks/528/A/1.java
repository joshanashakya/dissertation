

// Java program to count substrings with recursive sum equal to 9 
  
class GFG { 
  
    static int count9s(char number[]) { 
        int n = number.length; 
  
        // to store no. of previous encountered modular sums 
        int d[] = new int[9]; 
  
        // no. of modular sum(==0) encountered till now = 1 
        d[0] = 1; 
        int result = 0; 
  
        int mod_sum = 0, continuous_zero = 0; 
        for (int i = 0; i < n; i++) { 
            if ((number[i] - '0') == 0) // if number is 0 increase 
            { 
                continuous_zero++;     // no. of continuous_zero by 1 
            } else // else continuous_zero is 0 
            { 
                continuous_zero = 0; 
            } 
            mod_sum += (number[i] - '0'); 
            mod_sum %= 9; 
            result += d[mod_sum]; 
            d[mod_sum]++;  // increase d value of this mod_sum 
                          // subtract no. of cases where there  
                          // are only zeroes in substring 
            result -= continuous_zero; 
        } 
        return result; 
    } 
  
// driver program to test above function 
    public static void main(String[] args) { 
        System.out.println(count9s("01809".toCharArray())); 
        System.out.println(count9s("1809".toCharArray())); 
        System.out.println(count9s("4189".toCharArray())); 
    } 
} 
// This code is contributed by 29AjayKumar 

