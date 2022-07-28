

''' Python3 program to prall distinct elements  
of a given array '''
  
# This function prints all distinct elements  
def countDistinct(arr, n): 
  
    # Creates an empty hashset  
    s = set() 
      
    # Traverse the input array  
    res = 0
    for i in range(n): 
      
        # If not present, then put it in  
        # hashtable and increment result  
        if (arr[i] not in s): 
            s.add(arr[i]) 
            res += 1
      
    return res  
  
# Driver code 
arr = [6, 10, 5, 4, 9, 120, 4, 6, 10] 
n = len(arr) 
print(countDistinct(arr, n)) 
  
# This code is contributed by SHUBHAMSINGH10 

