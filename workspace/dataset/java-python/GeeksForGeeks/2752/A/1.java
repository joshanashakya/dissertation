

//Java program to check if a string can be 
// converted to an empty string by deleting 
// given sub-string from any position, any 
// number of times. 
  
class GFG { 
  
// Returns true if str can be made empty by 
// recursively removing sub_str. 
    static boolean canBecomeEmpty(String str, String sub_str) { 
        while (str.length() > 0) { 
            // idx: to store starting index of sub- 
            //      string found in the original string 
            int idx = str.indexOf(sub_str); 
            if (idx == -1) { 
                break; 
            } 
  
            // Erasing the found sub-string from 
            // the original string 
            str = str.replaceFirst(sub_str,""); 
        } 
  
        return (str.length() == 0); 
    } 
  
// Driver code 
    public static void main(String[] args) { 
        String str = "GEEGEEKSKS", sub_str = "GEEKS"; 
        if (canBecomeEmpty(str, sub_str)) { 
            System.out.print("\nYes"); 
        } else { 
            System.out.print("\nNo"); 
        } 
    } 
} 
// This code is contributed by 29AjayKumar 

