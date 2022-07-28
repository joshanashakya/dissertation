

// Java program to find number of substrings 
// of length k whose sum of ASCII value of  
// characters is divisible by k  
  
  
public class GFG{ 
  
    static int count(String s, int k){ 
      
    // Finding length of string 
    int n = s.length() ;  
    int d = 0 ,i; 
    int count = 0 ; 
      
    for (i = 0; i <n; i++) 
        // finding sum of ASCII value of first  
        // substring 
        d += s.charAt(i) ; 
      
    if (d % k == 0) 
        count += 1 ; 
      
    for (i = k; i < n; i++) 
    { 
      
        // Using sliding window technique to  
        // find sum of ASCII value of rest of  
        // the substring 
        int prev = s.charAt(i-k) ; 
        d -= prev ; 
        d += s.charAt(i) ; 
      
      
      
        // checking if sum is divisible by k 
        if (d % k == 0) 
        count += 1 ; 
    } 
      
    return count ; 
    } 
      
    // Driver code 
    public static void main(String[]args) { 
          
        String s = "bcgabc" ; 
        int k = 3 ; 
        int ans = count(s, k);  
        System.out.println(ans);  
    } 
    // This code is contributed by Ryuga 
} 

