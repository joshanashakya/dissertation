

# Python3 program to find the maximum element  
# whose frequency equals to it’s value  
  
# Function to find the maximum element  
# whose frequency equals to it’s value  
def find_maxm(arr, n) : 
  
    # Hash map for counting frquency  
    mpp = {} 
  
    for i in range(0,n): 
        # Counting freq of each element  
        if(arr[i] in mpp): 
            mpp.update( {arr[i] : mpp[arr[i]] + 1} ) 
        else: 
            mpp[arr[i]] = 1
  
    ans = 0
    for value,freq in mpp.items(): 
        # Check if value equls to frequency  
        # and it is the maximum element or not  
        if (value == freq): 
            ans = max(ans, value) 
  
    return ans 
  
# Driver code  
arr = [ 3, 2, 2, 3, 4, 3 ] 
      
# Size of array  
n = len(arr) 
  
# Function call  
print(find_maxm(arr, n)) 
  
# This code is contributed by Sanjit_Prasad 

