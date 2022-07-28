

# Python implementation to generate  
# an array of size N by following  
# the given rules 
  
  
# Function to search the most recent  
# location of element N 
# If not present in the array  
# it will return -1 
def search(a, k, x): 
        for j in range(k-1, -1, -1) : 
            if(a[j]== x): 
                return j 
                  
        return -1
  
# Function to generate an array  
# of size N by following the given rules 
def genArray(arr, N): 
  
    # Loop to fill the array 
    # as per the given rules 
    for i in range(0, N-1, 1): 
  
        # Check for the occurrence  
        # of arr[i - 1] 
        if(search(arr, i, arr[i])==-1): 
                arr[i + 1]= 0
  
        else: 
            arr[i + 1]=(i-search(arr, i, arr[i])) 
              
# Driver code       
if __name__ == "__main__": 
    N = 5
    size = N + 1
    a =[0]*N 
    genArray(a, N) 
      
    print(a) 

