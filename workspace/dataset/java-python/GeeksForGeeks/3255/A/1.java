

// Java program to find middle of three  
// distinct numbers to calculate the  
// number of equilateral triangles 
import java.util.*; 
  
class Triangle 
{    
    // fucntion to calculate number of  
    // traingles in Nth step 
    public static int numberOfTriangles(int n) 
    { 
        int[] answer = new int[n+1]; 
        answer[0] = 1; 
          
        for (int i = 1; i <= n; i++)  
            answer[i] = answer[i - 1] * 3 + 2; 
      
        return answer[n]; 
    } 
      
    // driver code 
    public static void main(String[] args) 
    { 
        int n = 2; 
        System.out.println(numberOfTriangles(n)); 
    } 
} 
  
// This code is contributed by rishabh_jain 

