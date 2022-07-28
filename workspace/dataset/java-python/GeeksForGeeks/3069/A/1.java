

// Java program to bring all spaces in front of  
// string using swapping technique  
class GFG  
{ 
  
    // Function to find spaces and move to beginning  
    static void moveSpaceInFront(char str[])  
    {  
        // Traverse from end and swap spaces  
        int i = str.length-1;  
        for (int j = i; j >= 0; j--)  
            if (str[j] != ' ') 
            { 
                char c = str[i]; 
                str[i] = str[j]; 
                str[j] = c; 
                i--; 
            } 
    }     
  
    // Driver code  
    public static void main(String[] args) 
    { 
        char str[] = "Hey there, it's GeeksforGeeks".toCharArray();  
        moveSpaceInFront(str);  
        System.out.println(String.valueOf(str)); 
    } 
} 
  
// This code is contributed by  
// 29AjayKumar 

