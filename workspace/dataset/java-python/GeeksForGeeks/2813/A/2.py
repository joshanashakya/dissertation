

# Python3 implementation of find number 
# of elements x in this array 
# such x+k also present in this array. 
  
# Function to return the 
# count of element x such that 
# x+k also lies in this array 
def count_element(N, K, arr): 
      
    # Key in map will store elements 
    # and value will store the 
    # frequency of the elements 
    mp = dict() 
  
    for i in range(N): 
        mp[arr[i]] = mp.get(arr[i], 0) + 1
  
    answer = 0
  
    for i in mp: 
  
        # Find if i.first + K is 
        # present in this map or not 
        if i + K in mp: 
  
            # If we find i.first or key + K in this map 
            # then we have to increase in answer 
            # the frequency of this element 
            answer += mp[i] 
  
    return answer 
  
# Driver code 
if __name__ == '__main__': 
    # array initialisation 
    arr=[3, 6, 2, 8, 7, 6, 5, 9] 
  
    # size of array 
    N = len(arr) 
  
    # initialise k 
    K = 2
  
    print(count_element(N, K, arr)) 
      
# This code is contributed by mohit kumar 29     

