

# Python 3 program for sorting array  
# elements with set bits equal to K 
  
# Function to sort elements with 
# set bits equal to k 
def sortWithSetbits(arr, n, k): 
      
    # initialise two vectors 
    v1 = [] 
    v2 = [] 
  
    for i in range(0, n, 1): 
        if (bin(arr[i]).count('1') == k): 
              
            # first vector contains indices  
            # of required element 
            v1.append(i) 
  
            # second vector contains  
            # required elements 
            v2.append(arr[i]) 
  
    # sorting the elements in second vector 
    v2.sort(reverse = False) 
  
    # replacing the elements with k set  
    # bits with the sorted elements 
    for i in range(0, len(v1), 1): 
        arr[v1[i]] = v2[i] 
  
    # printing the new sorted array elements 
    for i in range(0, n, 1): 
        print(arr[i], end = " ") 
  
# Driver code 
if __name__ == '__main__': 
    arr = [14, 255, 1, 7, 13] 
    n = len(arr) 
    k = 3
  
    sortWithSetbits(arr, n, k) 
  
# This code is contributed by 
# Surendra_Gangwar 

