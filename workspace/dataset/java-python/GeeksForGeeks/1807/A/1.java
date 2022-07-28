

// Implementation of JAVA to check the  
// given number is Balanced or not 
import java.util.*; 
public class Main 
{ 
    // returns true if the number  
    // passed as the argument  
    // is a balanced number.  
    public static boolean isNumBalanced(int num){ 
        // to get the absolute value of the number 
        num=Math.abs(num); 
          
        // to convert the int number into a String 
        String str=num+"";  
          
        // to convert the String into Character Array 
        char[] ch_arr=str.toCharArray(); 
          
        // HashSet is used to remove the duplicates  
        // in the Character Array 
        HashSet<Character> hs=new HashSet<Character>(); 
        for(char ch:ch_arr){ 
            // Adding the Characters in the Array in the Set 
            hs.add(ch); 
        } 
        // getting the length of the String 
        int str_len=str.length(); 
          
        // getting the numbers of elemnts in the HashSet 
        int hs_len=hs.size(); 
        // return true if  
        // the number is balanced 
        // checks for the number is balanced or not by 
        // comparing length of String and HashSet  
        if(hs_len<=str_len/2 || hs_len==str_len) 
        { 
            return true; 
        } 
        return false; 
          
    } 
    // Driver Code 
    public static void main(String[] args) 
        { 
            int N = 1234567890; 
            boolean flag = isNumBalanced(N); 
      
            if (flag) 
                System.out.println("YES"); 
            else
                System.out.println("NO"); 
        } 
    } 
    // This code is contributed by Mano 

