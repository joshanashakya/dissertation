

// Java program to find square of  
// these large numbers 
class GFG { 
      
    // Function to find the square of 
    // 333...333, 666...666 and 999...999 
    static String find_Square_369(String num) 
    { 
        char a, b, c, d; 
      
        // if the number is 333...333 
        if (num.charAt(0) == '3') 
            {a = '1'; b = '0'; c = '8'; d = '9';} 
      
        // if the number is 666...666 
        else if (num.charAt(0) == '6') 
            {a = '4'; b = '3'; c = '5'; d = '6';} 
      
        // if the number is 999...999 
        else
            {a = '9'; b = '8'; c = '0'; d = '1';} 
      
        // variable for hold result 
        String result = ""; 
      
        // find the no of digit 
        int size = num.length(); 
      
        // add size-1 time a in result 
        for (int i = 1; i < size; i++) 
            result += a; 
      
        // add one time b in result 
        result += b; 
      
        // add size-1 time c in result 
        for (int i = 1; i < size; i++) 
            result += c; 
      
        // add one time d in result 
        result += d; 
      
        // return result 
        return result; 
    } 
      
    // Drivers code 
    public static void main(String[] args) 
    { 
  
        String num_3, num_6, num_9; 
        num_3 = "3333"; 
        num_6 = "6666"; 
        num_9 = "9999"; 
      
        String result = ""; 
      
        // find square of 33..33 
        result = find_Square_369(num_3); 
        System.out.println("Square of " + num_3  
                            + " is : " + result); 
      
        // find square of 66..66 
        result = find_Square_369(num_6); 
        System.out.println("Square of " + num_9 
                            + " is : " + result); 
      
        // find square of 66..66 
        result = find_Square_369(num_9); 
        System.out.println("Square of " + num_9 
                            + " is : " + result); 
      
    } 
} 
  
// This code is contributed by Smitha. 

