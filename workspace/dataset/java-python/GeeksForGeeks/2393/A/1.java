

// Java program to find the largest smaller  
// number by swapping one digit. 
class GFG  
{ 
  
    // Returns largest possible number   
    // with one swap such that the number   
    // is smaller than str. It is assumed   
    // that there are leading 0s.  
    static String prevNum(String str) 
    { 
        int len = str.length(); 
        int index = -1; 
  
        // Traverse from right until we find  
        // a digit which is greater than its  
        // next digit. For example, in 34125,  
        // our index is 4.  
        for (int i = len - 2; i >= 0; i--)  
        { 
            if (str.charAt(i) > str.charAt(i + 1))  
            { 
                index = i; 
                break; 
            } 
        } 
  
        // We can also use binary search here as  
        // digits after index are sorted in increasing  
        // order.  
        // Find the biggest digit in the right of  
        // arr[index] which is smaller than arr[index]  
        int smallGreatDgt = -1; 
        for (int i = len - 1; i > index; i--) 
        { 
            if (str.charAt(i) < str.charAt(index))  
            { 
                if (smallGreatDgt == -1)  
                { 
                    smallGreatDgt = i; 
                }  
                else if (str.charAt(i) >=  
                        str.charAt(smallGreatDgt)) 
                { 
                    smallGreatDgt = i; 
                } 
            } 
        } 
  
        // If index is -1 i.e. digits are  
        // in increasing order.  
        if (index == -1) 
        { 
            return "-1"; 
        } 
  
        // Swap both values  
        if (smallGreatDgt != -1) 
        { 
            str = swap(str, index, smallGreatDgt); 
            return str; 
        } 
  
        return "-1"; 
    } 
  
    static String swap(String str, int i, int j)  
    { 
        char ch[] = str.toCharArray(); 
        char temp = ch[i]; 
        ch[i] = ch[j]; 
        ch[j] = temp; 
        return String.valueOf(ch); 
    } 
  
    // Driver code  
    public static void main(String[] args)  
    { 
        String str = "34125"; 
        System.out.println(prevNum(str)); 
    } 
}  
  
  
// This code is contributed by 29AjayKumar 

