

// Java implementation to find the  
// minimum number of swaps to make  
// two strings equal  
class GFG { 
      
    // Function to find the minimum number of swaps  
    // to make two strings equal  
    static void swapOperations(char []a, char []b, char []c)  
    {  
        // Counting length of string  
        int l = a.length;  
        int i = 0;  
      
        // Initializing the answer  
        int total_swaps = 0;  
        char temp; 
      
        // For loop to iterate through the  
        // given strings  
        for (i = 0; i < l; i++) {  
      
            // Condition if both character of  
            // string a and b are equal  
            if (a[i] == b[i])  
                continue;  
      
            // Condition if character of  
            // string a and c are equal  
            if (a[i] == c[i]) {  
      
                // If yes, then swap  
                // the characters  
                //    swap(b[i], c[i]);  
                temp = b[i]; 
                b[i] = c[i]; 
                c[i] = temp; 
                  
                total_swaps++;  
                continue;  
            }  
      
            // Condition if character of  
            // string b and c are equal  
            if (b[i] == c[i]) {  
      
                // If yes, then swap  
                // the characters  
                //swap(a[i], c[i]);  
                temp = a[i]; 
                a[i] = c[i]; 
                c[i] = temp; 
                  
                total_swaps++;  
                continue;  
            }  
      
            // Else, it is impossible to make  
            // both the strings equal  
            break;  
        }  
      
        // Printing the answer  
        if (i == l)  
                System.out.println(total_swaps) ;  
        else
                System.out.println(-1) ;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        String a = "xyz";  
        String b = "yzx";  
        String c = "yzx";  
      
        swapOperations(a.toCharArray(), b.toCharArray(), c.toCharArray());  
      
    }  
} 
  
// This code is contributed by Yash_R 

