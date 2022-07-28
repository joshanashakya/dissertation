

// Java program to bring all spaces in front of 
// string using swapping technique 
class GFG  
{ 
  
// Function to find spaces and move to beginning 
static void moveSpaceInFront(char str[]) 
{ 
    // Keep copying non-space characters 
    int i = str.length-1; 
      
    for (int j = i; j >= 0; j--) 
        if (str[j] != ' ') 
            str[i--] = str[j]; 
  
    // Move spaces to be beginning 
    while (i >= 0) 
        str[i--] = ' '; 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    char str[] = "Hey there, it's GeeksforGeeks".toCharArray(); 
    moveSpaceInFront(str); 
    System.out.println(String.valueOf(str)); 
} 
}  
  
// This code is contributed by Rajput-Ji 

