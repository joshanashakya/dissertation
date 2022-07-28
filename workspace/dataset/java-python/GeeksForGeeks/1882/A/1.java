

// Java implementation of the approach 
  
class GFG  
{ 
  
// Function to return the bitwise OR of 
// all the binary strings 
static String strBitwiseOR(String[] arr, int n) 
{ 
    String res=""; 
  
    int max_size = Integer.MIN_VALUE; 
  
    // Get max size and reverse each string 
    // Since we have to perform OR operation 
    // on bits from right to left 
    // Reversing the string will make it easier 
    // to perform operation from left to right 
    for (int i = 0; i < n; i++) 
    { 
        max_size = Math.max(max_size, (int)arr[i].length()); 
        arr[i] = reverse(arr[i]); 
    } 
  
    for (int i = 0; i < n; i++)  
    { 
  
        // Add 0s to the end of strings 
        // if needed 
        String s=""; 
        for (int j = 0; j < max_size - arr[i].length(); j++) 
            s += '0'; 
  
        arr[i] = arr[i] + s; 
    } 
      
    // Perform OR operation on each bit 
    for (int i = 0; i < max_size; i++) 
    { 
        int curr_bit = 0; 
        for (int j = 0; j < n; j++) 
            curr_bit = curr_bit | (arr[j].charAt(i) - '0'); 
  
        res += (char)(curr_bit + '0'); 
    } 
  
    // Reverse the resultant string 
    // to get the final string 
    res = reverse(res); 
  
    // Return the final string 
    return res; 
} 
  
static String reverse(String input)  
{ 
    char[] temparray = input.toCharArray(); 
    int left, right = 0; 
    right = temparray.length - 1; 
  
    for (left = 0; left < right; left++, right--) 
    { 
        // Swap values of left and right  
        char temp = temparray[left]; 
        temparray[left] = temparray[right]; 
        temparray[right] = temp; 
    } 
    return String.valueOf(temparray); 
}  
      
// Driver code 
public static void main(String[] args) 
{ 
    String arr[] = { "10", "11", "1000001" }; 
    int n = arr.length; 
    System.out.println(strBitwiseOR(arr, n)); 
} 
} 
  
// This code contributed by Rajput-Ji 

