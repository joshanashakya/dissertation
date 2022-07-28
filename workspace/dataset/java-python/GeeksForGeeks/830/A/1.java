

// Java implementation to count the  
// number of times the graph  
// crosses the x-axis.  
class GFG  
{ 
      
    // Function to to count the  
    // number of times the graph  
    // crosses the x-axis.  
    static int times(int []steps, int n)  
    {  
        int current_level = 0;  
        int previous_level = 0;  
        int count = 0;  
      
        // Iterate over the steps array  
        for (int i = 0; i < n; i++) 
        {  
      
            // Update the previous level and  
            // current level by value given  
            // in the steps array  
            previous_level = current_level;  
            current_level = current_level + steps[i];  
      
            // Condition to check that the  
            // graph crosses the origin.  
            if ((previous_level < 0 &&  
                current_level >= 0)  
                || (previous_level > 0
                && current_level <= 0))  
            {  
                count++;  
            }  
        }  
        return count;  
    }  
      
    // Driver Code  
    public static void main (String[] args) 
    {  
        int steps[] = { 1, -1, 0, 0, 1, 1, -3, 2 };  
        int n = steps.length;  
      
        System.out.println(times(steps, n));  
    }  
} 
  
// This code is contributed by AnkitRai01 

