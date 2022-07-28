

# C# Code to Count pairs in an 
# array that hold i*arr[i] > j*arr[j] 
  
# Return count of pair in given array 
# such that i*arr[i] > j*arr[j] 
def CountPair(arr , n ): 
      
    # Initialize result 
    result = 0; 
      
    for i in range (0, n): 
          
        # Generate all pair and increment 
        # counter if the hold given condition 
        j = i + 1
        while(j < n): 
            if (i * arr[i] > j * arr[j] ): 
                result = result +1
            j = j + 1
    return result; 
      
# Driver program to test above function */ 
      
arr = [5, 0, 10, 2, 4, 1, 6] 
n = len(arr) 
print("Count of Pairs : " , CountPair(arr, n)) 
  
# This code is contributed by Sam007. 

