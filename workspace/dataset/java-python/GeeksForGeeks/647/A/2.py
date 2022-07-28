

# Python 3 program to minimize the  
# difference between minimum and 
# maximum elements  
  
# Function to minimize the difference  
# between minimum and maximum elements  
def minimizeDiff(arr, n, k) : 
  
    # Find max and min elements  
    # of the array  
    max_element = max(arr) 
    min_element = min(arr) 
  
    # Check whether the difference between  
    # the max and min element is less than  
    # or equal to k or not  
    if ((max_element - min_element) <= k) :  
        return (max_element - min_element)  
      
    # Calculate average of max and min  
    avg = (max_element + min_element) // 2
  
    for i in range(n):  
          
        # If the array element is greater than  
        # the average then decrease it by k  
        if (arr[i] > avg) : 
            arr[i] -= k  
              
        # If the array element is smaller than   
        # the average then increase it by k  
        else : 
            arr[i] += k  
  
    # Find max and min of the  
    # modified array  
    max_element = max(arr)  
    min_element = min(arr)  
  
    # return the new difference  
    return (max_element - min_element);  
  
# Driver code  
if __name__ == "__main__" : 
      
    arr = [ 3, 16, 12, 9, 20 ] 
    n = 5
    k = 3
      
    print("Max height difference =",  
            minimizeDiff(arr, n, k)) 
  
# This code is contributed by Ryuga 

