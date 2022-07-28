

// Java program to find the sum of the 
// minimum and the maximum difference 
// between two given Strings 
class GFG{ 
   
// Function to find the sum of the 
// minimum and the maximum difference 
// between two given Strings 
static void solve(char []a, char []b) 
{ 
    int l = a.length; 
   
    // Variables to store the minimum 
    // difference and the maximum difference 
    int min = 0, max = 0; 
   
    // Iterate through the length of the String as 
    // both the given Strings are of the same length 
    for (int i = 0; i < l; i++) { 
   
        // For the maximum difference, we can replace 
        // "+" in both the Strings with different char 
        if (a[i] == '+' || b[i] == '+' || a[i] != b[i]) 
            max++; 
   
        // For the minimum difference, we can replace 
        // "+" in both the Strings with the same char 
        if (a[i] != '+' && b[i] != '+' && a[i] != b[i]) 
            min++; 
    } 
   
    System.out.print(min + max +"\n"); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String s1 = "a+c", s2 = "++b"; 
    solve(s1.toCharArray(), s2.toCharArray()); 
} 
} 
  
// This code is contributed by Rajput-Ji 

