

// Java program remove two consecutive integers  
// from 1 to N to make sum equal to S  
  
class GFG  
{ 
      
    // Function to find the numbers  
    // to be removed  
    static float findNumber(int N, int S)  
    {  
      
        // typecast appropriately  
        // so that answer is float  
        float i = (((float)(N) * (float)(N + 1)) / 4)  
                - ((float)(S + 1) / 2);  
      
        // return the obtained result  
        return i;  
    }  
      
    static void check(int N, int S)  
    {  
      
        float i = findNumber(N, S);  
      
        // Convert i to integer  
        int integerI = (int)i;  
      
        // If i is an integer is 0  
        // then answer is Yes  
        if (i - integerI == 0)  
            System.out.println("Yes: " + integerI +  
                                ", " + (integerI + 1)) ; 
        else
            System.out.println("No"); 
    }  
      
    // Driver code  
    public static void main (String[] args) 
    {  
      
        int N = 4, S = 3;  
        check(N, S);  
      
        N = 5; S = 3;  
        check(N, S);  
  
    }  
} 
  
// This code is contributed by AnkitRai01 

