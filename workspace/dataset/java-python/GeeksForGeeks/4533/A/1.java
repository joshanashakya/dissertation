

// Java program to find the maximum SoP  
// of two arrays by toggling adjacent bits  
// in the second array 
class GFG 
{ 
  
// Function to return Max Sum 
static int maxSum(int arr1[],  
                  int arr2[], int n) 
{ 
    // intialParity and finalParity are 0 
    // if total no. of 1's is even else 1 
    int initialParity = 0, finalParity = 0; 
  
    // minPositive and maxNegative will store 
    // smallest positive and smallest negative 
    // integer respectively. 
    int sum = 0, 
        minPositive = Integer.MAX_VALUE, 
        maxNegative = Integer.MIN_VALUE; 
  
    for (int i = 0; i < n; i++) 
    { 
  
        // Count of Initial Parity 
        initialParity += arr2[i]; 
  
        // if arr1[i] is positive then add 1 
        // in finalParity to get 1 at arr2[i] 
        if (arr1[i] >= 0) 
        { 
  
            finalParity += 1; 
            sum += arr1[i]; 
            minPositive = Math.min(minPositive,  
                                      arr1[i]); 
        } 
        else
        { 
            maxNegative = Math.max(maxNegative,  
                                      arr1[i]); 
        } 
    } 
  
    // if both parity are odd or even 
    // then return sum 
    if (initialParity % 2 == finalParity % 2) 
    { 
        return sum; 
    } 
  
    // else add one more 1 or remove 1 
    else
    { 
  
        // if minPositive > maxNegative, 
        // put 1 at maxNegative 
        // and add it to our sum 
        if (minPositive + maxNegative >= 0) 
        { 
            return sum + maxNegative; 
        } 
  
        // else remove minPositive no. 
        else
        { 
            return sum - minPositive; 
        } 
    } 
} 
  
// Driver code 
public static void main(String []args) 
{ 
    int arr1[] = { 2, -4, 5, 3 }; 
    int arr2[] = { 0, 1, 0, 1 }; 
  
    int n = arr1.length; 
    System.out.println(maxSum(arr1, arr2, n)); 
} 
} 
  
// This code is contributed by 29AjayKumar 

