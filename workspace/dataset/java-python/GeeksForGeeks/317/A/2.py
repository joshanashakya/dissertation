

# Python3 Program to find the Length of the  
# largest Subarray with only even elements  
  
# Function to find the Length of the 
# largest Subarray with only even elements 
def maxEvenSubarray(array,N): 
    ans = 0
    count = 0
  
    # Iterate the loop 
    for i in range(0,N): 
          
        # Check whether the element is 
        # even in continuous fashion 
        if array[i]%2==0: 
            count +=1
            ans = max(ans,count) 
  
        else: 
  
            # If element are not even in continuous 
            # fashion, Reinitialize the count 
            count = 0
              
    # Check for the last element in the array 
    ans = max(ans,count) 
    return ans 
  
# Driver code 
if __name__=='__main__': 
    arr = [9, 8, 5, 4, 4, 4, 2, 4, 1] 
    N = len(arr) 
    print(maxEvenSubarray(arr,N)) 
  
# This article is contributed by Shrikant13 

