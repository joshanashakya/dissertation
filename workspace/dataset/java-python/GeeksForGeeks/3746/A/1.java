

// JAVA implementation of the approach 
class GFG 
{ 
  
// Function to return the number of lines required 
static int[] numberOfLines(String S, int []widths) 
{ 
    // If String is empty 
    if (S.isEmpty()) 
        return new int[]{0, 0}; 
  
    // Initialize lines and width 
    int lines = 1, width = 0; 
  
    // Iterate through S 
    for (char character : S.toCharArray()) 
    { 
        int w = widths[character - 'a']; 
        width += w; 
  
        if (width >= 10) 
        { 
            lines++; 
            width = w; 
        } 
    } 
  
    // Return lines and width used 
    return new int[]{lines, width}; 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    String S = "bbbcccdddaa"; 
    int widths[] = {4, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 
                    1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}; 
  
    // Function call to print required answer 
    int []ans = numberOfLines(S, widths); 
    System.out.print(ans[0]+ " " + ans[1] +"\n"); 
} 
} 
  
// This code is contributed by Rajput-Ji 

