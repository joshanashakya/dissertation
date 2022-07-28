

// Java implementation of the approach  
import java.util.*; 
import java.lang.Math; 
  
class GfG 
{ 
  
    // Function to print powerful integers  
    static void powerfulIntegers(int x, 
                        int y, int bound)  
    {  
      
        // Set is used to store distinct numbers  
        // in sorted order  
        Set<Integer> s = new HashSet<>();  
        ArrayList<Integer> powersOfY = new ArrayList<>();  
        int i;  
      
        // Store all the powers of y < bound in a vector  
        // to avoid calculating them again and again  
        powersOfY.add(1);  
        for (i = y; i < bound; i = i * y)  
            powersOfY.add(i);  
      
        i = 0;  
        while (true)  
        {  
      
            // x^i  
            int xPowI = (int)Math.pow((double)x, (double)i);  
      
            // Adding any number to it  
            // will be out of bounds  
            if (xPowI >= bound)  
                break;  
      
            for (int j = 0; j < powersOfY.size(); ++j) 
            {  
                int num = xPowI + powersOfY.get(j);  
      
                // If num is within limits  
                // insert it into the set  
                if (num <= bound)  
                    s.add(num);  
      
                // Break out of the inner loop  
                else
                    break;  
            }  
      
            // Increment i  
            i++;  
        }  
      
        // Print the contents of the set  
        Iterator itr = s.iterator();  
        while(itr.hasNext()) 
        {  
            System.out.print(itr.next() + " ");  
        }  
    }  
  
    // Driver code 
    public static void main(String []args) 
    { 
        int x = 2, y = 3, bound = 10;  
      
        // Print powerful integers  
        powerfulIntegers(x, y, bound); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

