

// Java program to count the pairs in array 
// such that one element is reverse of another 
  
class Geeks { 
    // Function to reverse the digits 
    // of the number 
    static int reverse(int num) { 
        int rev_num = 0; 
  
        // Loop to iterate till the number is 
        // greater than 0 
        while (num > 0) { 
  
            // Extract the last digit and keep 
            // multiplying it by 10 to get the 
            // reverse of the number 
            rev_num = rev_num * 10 + num % 10; 
            num = num / 10; 
        } 
        return rev_num; 
    } 
  
    // Function to find the pairs from the 
    // such that one number is reverse of 
    // the other 
    static int countReverse(int arr[], int n) { 
        int res = 0; 
  
        // Iterate through all pairs 
        for (int i = 0; i < n; i++) 
            for (int j = i + 1; j < n; j++) 
  
                // Increment count if one is 
                // the reverse of other 
                if (reverse(arr[i]) == arr[j]) { 
                    res++; 
                } 
  
        return res; 
    } 
  
    // Driver code 
    public static void main(String[] args) { 
        int a[] = { 16, 61, 12, 21, 25 }; 
        int n = a.length; 
        System.out.print(countReverse(a, n)); 
    } 
} 
  
// This code is contributed by Rajnis09 

