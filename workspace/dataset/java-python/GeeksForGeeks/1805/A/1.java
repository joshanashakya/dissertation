

// Java program to check whether the given number 
// is in binary format 
import java.util.HashSet; 
import java.util.Set; 
  
class GFG { 
  
    // Function that returns true if given number 
    // is in binary format  i.e. number contains 
    // only 0's and/or 1's 
    static boolean isBinary(int number) 
    { 
        Set<Integer> set = new HashSet<>(); 
  
        // Put all the digits of the number in the set 
        while (number > 0) { 
            int digit = number % 10; 
            set.add(digit); 
            number /= 10; 
        } 
  
        // Since a HashSet does not allow duplicates so only 
        // a single copy of '0' and '1' will be stored 
        set.remove(0); 
        set.remove(1); 
  
        // If the original number only contained 0's and 1's 
        // then size of the set must be 0 
        if (set.size() == 0) { 
            return true; 
        } 
        return false; 
    } 
  
    // Driver code 
    public static void main(String a[]) 
    { 
        int n = 1000111; 
        System.out.println(isBinary(n)); 
    } 
} 

