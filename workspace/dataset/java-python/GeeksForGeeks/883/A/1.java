

// Java program to perform K operations upon 
// the String and find the modified String 
class GFG{ 
   
// Function to perform K operations upon 
// the String and find modified String 
static String ReverseComplement( 
    char []s, int n, int k) 
{ 
   
    // Number of reverse operations 
    int rev = (k + 1) / 2; 
   
    // Number of complement operations 
    int complment = k - rev; 
   
    // If rev is odd parity 
    if (rev % 2 == 1) 
        s = reverse(s); 
   
    // If complment is odd parity 
    if (complment % 2 == 1) { 
        for (int i = 0; i < n; i++) { 
            // Complementing each position 
            if (s[i] == '0') 
                s[i] = '1'; 
            else
                s[i] = '0'; 
        } 
    } 
   
    // Return the modified String 
    return String.valueOf(s); 
} 
  
static char[] reverse(char a[]) { 
    int i, n = a.length; 
    char t; 
    for (i = 0; i < n / 2; i++) { 
        t = a[i]; 
        a[i] = a[n - i - 1]; 
        a[n - i - 1] = t; 
    } 
    return a; 
}  
  
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "10011"; 
    int k = 5; 
    int n = str.length(); 
   
    // Function call 
    System.out.print(ReverseComplement(str.toCharArray(), n, k)); 
   
} 
} 
  
// This code is contributed by Rajput-Ji 

