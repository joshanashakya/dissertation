

# Python3 implementation of the approach 
  
# Function to generate the array that 
# satisfies the given condition 
def generateArr(arr, n): 
      
    # If there is only a single element 
    # in the array 
    if (n == 1): 
        print(arr[0]); 
        return; 
  
    # To store the generated array 
    barr = [0] * n; 
  
    # First element 
    barr[0] = arr[0] & arr[1]; 
  
    # Last element 
    barr[n - 1] = arr[n - 1] & arr[n - 2]; 
  
    # Rest of the elements 
    for i in range(1, n - 1): 
        barr[i] = arr[i - 1] & arr[i + 1]; 
  
    # Prthe generated array 
    for i in range(n): 
        print(barr[i], end = " "); 
  
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 4, 5, 6]; 
    n = len(arr); 
  
    generateArr(arr, n); 
  
# This code is contributed by 29AjayKumar 

