

# Python 3 program to find the frequency of 
# minimum element in the array 
  
  
# Function to find the frequency of the 
# smallest value in the array 
def frequencyOfSmallest(n,arr): 
    mn = arr[0] 
    freq = 1
  
    for i in range(1,n): 
        # If current element is smaller 
        # than minimum 
        if (arr[i] < mn): 
            mn = arr[i] 
            freq = 1
        
        # If current element is equal 
        # to smallest 
        elif(arr[i] == mn): 
            freq += 1
  
    return freq 
  
# Driver Code 
if __name__ == '__main__': 
    N = 5
    arr = [3, 2, 3, 4, 4] 
  
    print(frequencyOfSmallest(N, arr)) 
  
# This code is contributed by 
# Surendra_Gangwar 

