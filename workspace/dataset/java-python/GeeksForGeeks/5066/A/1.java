

// Java program to toggle K-th bit of a number N 
class GFG 
{ 
  
// Function that returns true if 
// the string can be balanced 
static boolean canBeBalanced(String s, int n) 
{ 
  
    // Count to check the difference between 
    // the frequencies of '(' and ')' and 
    // count_1 is to find the minimum value 
    // of freq('(') - freq(')') 
    int count = 0, count_1 = 0; 
  
    // Traverse the given string 
    for (int i = 0; i < n; i++)  
    { 
  
        // Increase the count 
        if (s.charAt(i) == '(') 
            count++; 
  
        // Decrease the count 
        else
            count--; 
  
        // Find the minimum value 
        // of freq('(') - freq(')') 
        count_1 = Math.min(count_1, count); 
    } 
  
    // If the minimum difference is greater 
    // than or equal to -1 and the overall 
    // difference is zero 
    if (count_1 >= -1 && count == 0) 
        return true; 
  
    return false; 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    String s = "())()("; 
    int n = s.length(); 
  
    if (canBeBalanced(s, n)) 
        System.out.println("Yes"); 
    else
        System.out.println("No"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

