

# Python 3 program to Count the no of subarray 
# which do not contain any subarray 
# whose sum of elements is equal to zero 
  
# Function that print the number of 
# subarrays which do not contain any subarray 
# whose elements sum is equal to 0 
def numberOfSubarrays(arr, n): 
  
    v = [0]*(n + 1) 
  
    # Storing each element as sum 
    # of its previous element 
    for i in range( n): 
        v[i + 1] = v[i] + arr[i] 
  
    mp = {} 
  
    begin, end, answer = 0 , 0 , 0
  
    mp[0] = 1
  
    while (begin < n): 
  
        while (end < n 
            and (v[end + 1]) not in mp): 
            end += 1
            mp[v[end]] = 1
  
        # Check if another same element found 
        # this means a subarray exist between 
        # end and begin whose sum 
        # of elements is equal to 0 
        answer = answer + end - begin 
  
        # Erase begining element from map 
        del mp[v[begin]] 
  
        # Increase begin 
        begin += 1
  
    # Print the result 
    print(answer) 
  
# Driver Code 
if __name__ == "__main__": 
      
    arr = [ 2, 4, -6 ] 
    size = len(arr) 
    numberOfSubarrays(arr, size) 
  
# This code is contributed by chitranayal  

