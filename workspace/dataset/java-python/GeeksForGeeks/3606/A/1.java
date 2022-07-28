

// Java implementation of the above approach 
import java.util.*; 
  
class Geeks { 
      
// function to return maximum volume 
static float maxVol(float P, float A) 
{ 
    // calculate length 
    float l = (float)(P - Math.sqrt(P * P - 24 * A)) / 12; 
  
    // calculate volume 
    float V = (float)(l * (A / 2.0 - l * (P / 4.0 - l))); 
  
    // return result 
    return V; 
} 
  
// Driver code 
public static void main(String args[]) 
{ 
    float P = 20, A = 16; 
    System.out.println(maxVol(P, A)); 
} 
} 
  
// This code is contributed by Kirti_Mangal 

