

// Java program to check if a number 
// is Tidy or not. 
  
class Test 
{ 
    // Returns true if num is Tidy 
    static boolean isTidy(int num) 
    { 
        // To store previous digit  
        // (Assigning initial value  
            // which is more than any 
        // digit) 
        int prev = 10; 
       
        // Traverse all digits from right to 
        // left and check if any digit is 
        // smaller than previous. 
        while (num!=0) 
        { 
            int rem = num % 10; 
            num /= 10; 
            if (rem > prev) 
               return false; 
            prev = rem; 
        } 
       
        return true; 
    } 
      
    // Driver method 
    public static void main(String[] args)  
    { 
        int num = 1556; 
        System.out.println(isTidy(num) ? "Yes" : "No"); 
    } 
} 

