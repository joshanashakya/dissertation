

//Java  implementation of above approach  
  
import java.io.*; 
  
class GFG { 
    // Function to return the number of  
// colors visible  
static int colourVisible(int height[], int colour[], int K)  
{  
    int arr[]=new int[K + 1] ; 
    int visible = 0;  
  
    int max = height[K - 1];  
    arr[colour[K - 1]] = 1;  
  
    for (int i = K - 2; i >= 0; i--) {  
        if (height[i] > max) {  
            max = height[i];  
            arr[colour[i]] = 1;  
        }  
    }  
  
    // Count the Number of 1's  
    for (int i = 1; i <= K; i++) {  
        if (arr[i] == 1)  
            visible++;  
    }  
  
    return visible;  
}  
  
// Driver code  
      
    public static void main (String[] args) { 
      
    int height[] = { 3, 5, 1, 2, 3 };  
    int colour[] = { 1, 2, 3, 4, 3 };  
    int K = colour.length;  
  
    System.out.println (colourVisible(height, colour, K)); 
    } 
} 

