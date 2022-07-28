

// Java Program to find triplet with a minimum sum 
  
class GFG 
{ 
  
// Function to find triplet with minimum sum 
static int getMinimumSum(int arr[] , int n) 
{ 
    // fMin: First minimum 
    // sMin: Second minimum 
    // tMin: Third minimum 
    int fMin = Integer.MAX_VALUE, 
            sMin = Integer.MAX_VALUE,  
            tMin = Integer.MAX_VALUE; 
      
    for (int i = 0; i < n; i++)  
    { 
          
        // Update the first, second and third minimum 
        if (arr[i] < fMin)  
        { 
            tMin = sMin; 
            sMin = fMin; 
            fMin = arr[i]; 
        } 
          
        // update second and third minimum 
        else if (arr[i] < sMin) 
        { 
            tMin = sMin; 
            sMin = arr[i]; 
        } 
        else if (arr[i] < tMin) 
        { 
            tMin = arr[i]; 
        } 
    } 
    return (fMin + sMin + tMin); 
} 
  
// Driver Code 
public static void main(String[] args) 
{ 
    int arr[] = { 1, 2, 3, 4, 5, -1, 5, -2 }; 
    int n = arr.length; 
  
    System.out.print(getMinimumSum(arr, n) +"\n"); 
} 
} 
  
// This code is contributed by PrinciRaj1992 

