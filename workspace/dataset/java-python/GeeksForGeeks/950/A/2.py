

# Python3 program to count Subarrays with  
# Consecutive elements differing by 1  
  
# Function to count Subarrays with  
# Consecutive elements differing by 1  
def subarrayCount(arr, n) : 
      
    # Variable to store count of subarrays  
    # whose consecutive elements differ by 1  
    result = 0
  
    # Take two pointers for maintaining a  
    # window of consecutive elements  
    fast, slow = 0, 0
  
    # Traverse the array  
    for i in range(1, n) :  
  
        # If elements differ by 1  
        # increment only the fast pointer  
        if (arr[i] - arr[i - 1] == 1) :  
            fast += 1
          
        else :  
  
            # Calculate length of subarray  
            length = fast - slow + 1
  
            # Calculate total subarrays except  
            # Subarrays with single element  
            result += length * (length - 1) // 2;  
  
            # Update fast and slow  
            fast = i 
            slow = i  
  
    # For last iteration. That is if array is  
    # traversed and fast > slow  
    if (fast != slow) :  
        length = fast - slow + 1
        result += length * (length - 1) // 2;  
      
    return result 
  
# Driver Code  
if __name__ == "__main__" : 
  
    arr = [ 1, 2, 3, 5, 6, 7 ] 
    n = len(arr) 
  
    print(subarrayCount(arr, n)) 
  
# This code is contributed by Ryuga 

