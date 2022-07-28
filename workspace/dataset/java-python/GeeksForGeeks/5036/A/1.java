

// Java for constructing smallest palindrome 
class GFG  
{ 
  
// function for printing palindrome 
static String constructPalin(char []str, int len) 
{ 
    int i = 0, j = len - 1; 
  
    // iterate till i<j 
    for (; i < j; i++, j--)  
    { 
  
        // continue if str[i]==str[j] 
        if (str[i] == str[j] && str[i] != '*') 
            continue; 
  
        // update str[i]=str[j]='a' if both are '*' 
        else if (str[i] == str[j] &&  
                        str[i] == '*')  
        { 
            str[i] = 'a'; 
            str[j] = 'a'; 
            continue; 
        } 
  
        // update str[i]=str[j] if only str[i]='*' 
        else if (str[i] == '*')  
        { 
            str[i] = str[j]; 
            continue; 
        } 
  
        // update str[j]=str[i] if only str[j]='*' 
        else if (str[j] == '*')  
        { 
            str[j] = str[i]; 
            continue; 
        } 
  
        // else print not possible and return 
        System.out.println("Not Possible"); 
        return ""; 
    } 
    return String.valueOf(str); 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    String str = "bca*xc**b"; 
    int len = str.length(); 
    System.out.println(constructPalin(str.toCharArray(), len)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

