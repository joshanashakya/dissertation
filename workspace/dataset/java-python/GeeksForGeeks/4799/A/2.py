

# Python 3 program for sorting array 
# elements whose modulo with K yields P 
  
# Function to sort elements whose modulo 
# with K yields P 
def sortWithRemainderP(arr, n, k, p): 
      
    # initialise two vectors 
    v1 = [] 
    v2 = [] 
  
    for i in range(0, n, 1): 
        if (arr[i] % k == p): 
              
            # first vector contains indices  
            # of required element 
            v1.append(i) 
  
            # second vector contains 
            # required elements 
            v2.append(arr[i]) 
  
    # sorting the elements in second vector 
    v2.sort(reverse = False) 
  
    # replacing the elements whose modulo  
    # with K yields P with the sorted elements 
    for i in range(0, len(v1), 1): 
        arr[v1[i]] = v2[i] 
  
    # printing the new sorted array elements 
    for i in range(0, n, 1): 
        print(arr[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [8, 255, 16, 2, 4, 0] 
    n = len(arr) 
    k = 2
    p = 0
  
    sortWithRemainderP(arr, n, k, p) 
      
# This code is contributed by 
# Sahil_Shelangia 

