

# Python3 implementation to find the 
# element whose frequency is equal  
# to the sum of frequencies of  
# other elements of the array 
  
# Function to check that any element  
# have frequency equal to the sum of  
# frequency of other elements of the array 
def isFrequencyEqual(arr, length) : 
  
    # Check that if the array length 
    # is odd, Then no solution possible 
    if (length % 2 == 1) : 
        print("No Such Element"); 
        return False; 
  
    # Hash-map to store the frequency 
    # of elements of array 
    freq = dict.fromkeys(arr, 0); 
      
    # Loop to find the frequency  
    # of elements of array 
    for i in range(length) : 
        freq[arr[i]] += 1; 
          
    # Loop to check if any element  
    # of the array have frequency  
    # equal to the half length 
    for i in range(length) : 
        if (freq[arr[i]] == length / 2) : 
            print(arr[i]); 
            return True; 
          
    print("No such element",end=""); 
    return False; 
  
# Driver Code 
if __name__ == "__main__" : 
  
    arr = [ 1, 2, 2, 3, 3, 3 ]; 
    n = 6; 
      
    # Function Call 
    isFrequencyEqual(arr, n); 
      
# This code is contributed by Yash_R 

