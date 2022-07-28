

// Java program to find the smallest positive  
// number which can not be represented by given digits 
import java.util.*; 
  
class GFG  
{ 
  
// Function to find the smallest positive  
// number which can not be represented by given digits 
static void expressDigit(int arr[], int n) 
{ 
    int min = 9, index = 0, temp = 0; 
      
    // Storing the count of 0 digit 
    // or store the value at 0th index 
    temp = arr[0]; 
      
    // Calculates the min value in the array starting  
    // from 1st index and also store it index. 
    for(int i = 1; i < 10; i++) 
    { 
        if(arr[i] < min) 
        { 
            min = arr[i]; 
            index = i; 
        } 
    } 
      
    // Now compare the min value with the  
    // value at 0th index. 
      
    // If its value at 0th index is less than min value 
    // than either 10, 100, 1000 ... can't be expressed 
    if(temp < min) 
    { 
        System.out.print(1); 
        for(int i = 1; i <= temp + 1; i++) 
            System.out.print(0); 
    } 
      
    // If it value is greater than min value than 
    // iterate the loop upto first min value index  
    // and simply print it index value.  
    else
    { 
        for(int i = 0; i < min; i++) 
            System.out.print(index); 
          
        System.out.print(index); 
    } 
} 
  
// Driver code 
public static void main(String[] args)  
{ 
    int arr[] = {2, 2, 1, 2, 1, 1, 3, 1, 1, 1}; 
      
    // Value of N is always 10  
    // as we take digit from 0 to 9 
    int N = 10; 
      
    // Calling function 
    expressDigit(arr, N); 
} 
} 
  
// This code is contributed by 29AjayKumar 

