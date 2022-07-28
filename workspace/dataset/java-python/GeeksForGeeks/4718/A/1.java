

// Java implementation of the above approach  
class GfG { 
  
    // Function to print the smallest and largest  
    // palindrome with N digits  
    static void printPalindrome(int n)  
    {  
        if (n == 1)  
        {  
            System.out.println("Smallest Palindrome: 0");  
            System.out.println("Largest Palindrome: 9");  
        }  
        else
        { 
            System.out.println("Smallest Palindrome: " 
                    + (int)(Math.pow(10, n - 1)) + 1);  
                      
            System.out.println("Largest Palindrome: " 
                    + ((int)(Math.pow(10,n)) - 1));  
        }  
    }  
      
    // Driver Code  
    public static void main(String[] args) {  
        int n = 4;  
        printPalindrome(n);  
    }  
}  

