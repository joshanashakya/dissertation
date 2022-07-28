

// Java implementation of the approach 
class GFG { 
  
    // Function to return the count 
    // of the required numbers 
    static int countNums(int l, int r) 
    { 
        int cnt = 0; 
  
        for (int i = l; i <= r; i++) { 
  
            // Last digit of the current number 
            int lastDigit = (i % 10); 
  
            // If the last digit is equal to 
            // any of the given digits 
            if ((lastDigit % 10) == 2 || (lastDigit % 10) == 3
                || (lastDigit % 10) == 9) { 
                cnt++; 
            } 
        } 
  
        return cnt; 
    } 
  
    // Driver code 
    public static void main(String[] args) 
    { 
        int l = 11, r = 33; 
        System.out.print(countNums(l, r)); 
    } 
} 

