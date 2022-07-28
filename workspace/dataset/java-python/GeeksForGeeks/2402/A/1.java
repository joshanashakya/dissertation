

// Java implementation of above approach 
  
import java.util.Arrays; 
  
public class Improve { 
  
    // Function to count the number of tower 
    static int number_of_tower(int house[], int range, int n) 
    { 
  
        // first we sort the house numbers 
        Arrays.sort(house); 
  
        // for count number of towers 
        int numOfTower = 0; 
  
        // for iterate all houses 
        int i = 0; 
        while (i < n) { 
  
            // count number of towers 
            numOfTower++; 
  
            // find find the middle location 
            int loc = house[i] + range; 
  
            // traverse till middle location 
            while (i < n && house[i] <= loc) 
                i++; 
  
            // this is point to middle 
            // house where we insert the tower 
            --i; 
  
            // now find the last location 
            loc = house[i] + range; 
  
            // traverse till last house of the range 
            while (i < n && house[i] <= loc) 
                i++; 
        } 
  
        // return the number of tower 
        return numOfTower; 
    } 
  
  
      
    public static void main(String args[]) 
    { 
        // given elements 
        int house[] = { 7, 2, 4, 6, 5, 9, 12, 11 }; 
        int range = 2; 
        int n = house.length; 
  
        // print number of towers 
        System.out.println(number_of_tower(house, range, n)); 
  
          
  
    } 
    // This code is contributed by ANKITRAI1 
} 
  

