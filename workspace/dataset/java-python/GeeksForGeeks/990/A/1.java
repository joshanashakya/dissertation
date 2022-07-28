

// Java implementation to find 
// longest suffix of the String 
// such that occurrence of each  
// character is less than K 
class GFG{ 
  
// Function to find the maximum 
// length suffix in the String 
static void maximumSuffix(String s,  
            int n, int k){ 
      
    // Length of the String 
    int i = s.length() - 1; 
  
    // Map to store the number 
    // of occurrence of character 
    int arr[] = new int[26]; 
    String suffix = ""; 
      
    // Loop to iterate String  
    // from the last character 
    while (i > -1) { 
  
        int index = s.charAt(i) - 'a'; 
          
        // Condition to check if the  
        // occurrence of each character 
        // is less than given number 
        if (arr[index] < n) { 
            arr[index]++; 
            suffix += s.charAt(i); 
            i--; 
            continue; 
        } 
          
        // Condition when character 
        // cannot be deleted 
        if (k == 0) 
            break; 
        k--; 
        i--; 
    } 
    suffix = reverse(suffix); 
      
    // Longest suffix 
    System.out.print(suffix); 
} 
static String reverse(String input) { 
    char[] a = input.toCharArray(); 
    int l, r = a.length - 1; 
    for (l = 0; l < r; l++, r--) { 
        char temp = a[l]; 
        a[l] = a[r]; 
        a[r] = temp; 
    } 
    return String.valueOf(a); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String str = "iahagafedcba"; 
  
    int n = 1, k = 2; 
      
    // Function call 
    maximumSuffix(str, n, k); 
} 
} 
  
// This code is contributed by 29AjayKumar 

