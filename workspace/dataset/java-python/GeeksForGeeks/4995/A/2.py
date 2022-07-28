

# Python 3 program to remove the elements  
# whose frequency appears in the range [l, r] 
  
def removeElements(arr, n, l, r): 
      
    # Hash map which will store the 
    # frequency of the elements of the array. 
    mp = {i:0 for i in range(len(arr))} 
  
    for i in range(n): 
          
        # Incrementing the frequency 
        # of the element by 1. 
        mp[arr[i]] += 1
  
    for i in range(n): 
          
        # Print the element whose frequency 
        # is not in the range [l, r] 
        if (mp[arr[i]] < l or mp[arr[i] > r]): 
            print(arr[i], end = " ") 
      
# Driver Code 
if __name__ == '__main__': 
    arr = [1, 2, 3, 3, 2, 2, 5] 
    n = len(arr) 
    l = 2
    r = 3
    removeElements(arr, n, l, r); 
      
# This code is contributed by 
# Sahil_Shelangia 

