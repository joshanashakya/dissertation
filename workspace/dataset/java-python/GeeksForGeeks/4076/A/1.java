

// Java program to find most common factor  
// in a range.  
  
public class GfG { 
  
    public static int mostCommon(int lower, int higher)  
    {  
        // Check whether lower number   
        // and higher number are same  
        if (lower == higher)   
            return lower;  
        else 
            return 2;  
    }  
  
    // Driver code 
    public static void main(String []args) { 
          
        int lower = 10; // Lower number  
        int higher = 20; // Higher number  
        System.out.println("The most frequent factor " +  
                                    mostCommon(lower, higher)); 
    } 
} 
  
// This code is contributed by Rituraj Jain 

