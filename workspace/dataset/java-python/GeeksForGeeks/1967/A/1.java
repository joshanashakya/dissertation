

// Java program to find the  
// Maximum distance between two 1's  
// in Binary representation of N  
class GFG 
{ 
    static int longest_gap(int N)  
    {  
        int distance = 0, count = 0,  
            first_1 = -1, last_1 = -1;  
      
        // Compute the binary representation  
        while (N != 0)  
        {  
            count++;  
      
            int r = N & 1;  
      
            if (r == 1)  
            {  
                first_1 = first_1 == -1 ?  
                                  count : first_1;  
                last_1 = count;  
            }  
            N = N / 2;  
        }  
      
        // if N is a power of 2  
        // then return -1  
        if (last_1 <= first_1)  
        {  
            return -1;  
        }  
          
        // else find the distance  
        // between the first position of 1  
        // and last position of 1  
        else
        {  
            distance = (last_1 - first_1 - 1);  
            return distance;  
        }  
    }  
      
    // Driver code  
    public static void main (String[] args)  
    {  
        int N = 131;  
        System.out.println(longest_gap(N));  
      
        N = 8;  
        System.out.println(longest_gap(N));  
      
        N = 17;  
        System.out.println(longest_gap(N));  
      
        N = 33;  
        System.out.println(longest_gap(N));  
    }  
} 
  
// This code is contributed by AnkitRai01 

