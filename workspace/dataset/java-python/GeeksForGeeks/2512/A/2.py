

# Python3 implmentation to make  
# array elements equal with 
# minimum cost 
  
# Function to find the minimum 
# cost required to make array 
# elements equal 
def makearrayequal(arr,  n) : 
    x = 0; 
      
    # Loop to find the  
    # count of odd elements 
    for i in range(n) : 
        x += arr[i] & 1; 
  
    print(min(x, n - x)); 
  
# Driver Code 
if __name__ == "__main__" : 
  
    arr = [ 4, 3, 2, 1 ]; 
    n = len(arr); 
    makearrayequal(arr, n); 
    
# This code is contributed by Yash_R 

