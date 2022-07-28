

// Java program to find if String is a 
// perfect cube or not. 
import java.util.*; 
  
class GFG{ 
   
static boolean isPerfectCubeString(String str) 
{ 
    int sum = 0; 
   
    // Finding ASCII values of each 
    // character and finding its sum 
    for (int i = 0; i < str.length(); i++) 
        sum += (int)str.charAt(i); 
   
    // Find the cube root of sum 
    double cr = Math.round(Math.cbrt(sum)); 
   
    // Check if sum is a perfect cube 
    return (cr * cr * cr == sum); 
} 
   
// Driver code 
public static void main(String[] args) 
{ 
    String str = "ll"; 
   
    if (isPerfectCubeString(str)) 
        System.out.print("Yes"); 
    else
        System.out.print("No"); 
} 
} 
  
// This code is contributed by 29AjayKumar 

