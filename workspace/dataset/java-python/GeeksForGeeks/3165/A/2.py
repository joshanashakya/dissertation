

# Python implementation of above approach 
# Function to return the required minimum sum  
def minSum(arr, n): 
    # Array to store the  
    # frequency of each digit  
    MAX = 10
    freq = [0]*MAX
      
    for i in range(n): 
        # Store count of every digit  
        freq[arr[i]] += 1
  
    # Update arr[] such that it is  
    # sorted in ascending  
    k = 0
    for i in range(MAX): 
        # Adding elements in arr[]  
        # in sorted order  
        for j in range(0,freq[i]):  
            arr[k] = i 
            k += 1
  
    num1 = 0
    num2 = 0
  
    # Generating numbers alternatively  
    for i in range(n): 
        if i % 2 == 0: 
            num1 = num1 * MAX + arr[i] 
        else: 
            num2 = num2 * MAX + arr[i]  
  
    # Return the minimum possible sum  
    return num1 + num2  
  
  
# Driver code  
arr = [ 6, 8, 4, 5, 2, 3 ] 
n = len(arr);  
print(minSum(arr, n)) 
  
#This code is contributed by ankush_953 

