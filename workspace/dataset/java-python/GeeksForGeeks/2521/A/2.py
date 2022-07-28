

# Python3 implementation of the approach 
def recamanGenerator(arr, n): 
      
    # First term of the sequence 
    # is always 0 
    arr[0] = 0
  
    # Fill remaining terms using  
    # recursive formula 
    for i in range(1, n): 
        temp = arr[i - 1] - i 
        j = 0
  
        for j in range(i): 
  
            # If arr[i-1] - i is negative or 
            # already exists 
            if ((arr[j] == temp) or temp < 0): 
                temp = arr[i - 1] + i 
                break
  
        arr[i] = temp 
  
# Function that returns minimum  
# changes required 
def recamanArray(arr, n): 
  
    # Set to store first n Recaman numbers 
    s = dict() 
  
    # Generate and store 
    # first n Recaman numbers 
    recaman = [0 for i in range(n)] 
    recamanGenerator(recaman, n) 
  
    # Insert first n Recaman numbers to set 
    for i in range(n): 
        s[recaman[i]] = s.get(recaman[i], 0) + 1
  
    for i in range(n): 
  
        # If current element of the array 
        # is present in the set 
        if arr[i] in s.keys(): 
            del s[arr[i]] 
  
    # Return the remaining number of 
    # elements in the set 
    return len(s) 
  
# Driver code 
arr = [7, 11, 20, 4, 2, 1, 8, 6 ] 
n = len(arr) 
  
print(recamanArray(arr, n)) 
  
# This code is contributed 
# by mohit kumar 

