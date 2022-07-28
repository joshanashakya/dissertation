

// Java program to find the  
// X, Y and Z intercepts of a plane 
class GFG  
{ 
      
    static float[] XandYandZintercept(float A,  
                    float B, float C, float D) 
    { 
        float rslt[] = new float[3]; 
          
        // For finding the x-intercept  
        // put y = 0 and z = 0  
        float x = -D / A ; 
      
        // For finding the y-intercept  
        // put x = 0 and z = 0  
        float y = -D / B ; 
      
        // For finding the z-intercept  
        // put x = 0 and y = 0  
        float z = -D / C ; 
          
        rslt[0] = x; 
        rslt[1] = y; 
        rslt[2] = z; 
          
        return rslt;  
    } 
      
    // Driver code  
    public static void main (String[] args)  
    { 
        int A = 2 ; 
        int B = 5 ; 
        int C = 7; 
        int D = 8 ; 
          
        float rslt[] = XandYandZintercept(A, B, C, D); 
          
        for(int i = 0; i < 3 ; i++) 
        { 
            System.out.print(rslt[i] + " "); 
        } 
    } 
} 
  
// This code is contributed by AnkitRai01 

