

// Java to find largest number with 
// given conditions. 
class GFG { 
  
    // function to find the largest number 
    // with given conditions. 
    static int largestNum(int num) 
    { 
        int max_digit = -1; 
        int max_digit_indx = -1; 
        int l_indx = -1; 
        int r_indx = 1; 
  
        // converting the number to string 
        String num_in_str = String.valueOf(num); 
        for (int i = num_in_str.length() - 1; i >= 0; i--) { 
            // current digit is the largest by far 
            if (num_in_str.charAt(r_indx) > max_digit) { 
                max_digit = num_in_str.charAt(i); 
                max_digit_indx = i; 
                continue; 
            } 
  
            // best digit for swap if there is no more 
            // such situation on the left side 
            if (num_in_str.charAt(i) < max_digit) { 
                l_indx = i; 
                r_indx = max_digit_indx; 
            } 
        } 
  
        // check for is number already in order 
        if (l_indx == -1) 
            return num; 
  
        num_in_str = swap(num_in_str, l_indx, r_indx); 
  
        return Integer.parseInt(num_in_str); 
    } 
    static String swap(String arr, int i, int j) 
    { 
        char temp[] = arr.toCharArray(); 
        char c = temp[i]; 
        temp[i] = temp[j]; 
        temp[j] = c; 
        return String.valueOf(temp); 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int num = 789; 
        System.out.println(largestNum(num)); 
        num = 49658; 
        System.out.println(largestNum(num)); 
        num = 2135; 
        System.out.println(largestNum(num)); 
    } 
} 
  
// This code contributed by Rajput-Ji 

