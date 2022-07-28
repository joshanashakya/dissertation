

# Naive Python program to count number 
# of pairs such that their sum is more 
# than product. 
  
# Returns the number of valid pairs 
def countPairs(arr, n): 
      
    # initializing answer 
    ans = 0
      
    # Traversing the array. For each 
    # array element, checking its  
    # predecessors that follow the 
    # condition 
    for i in range(0, n): 
        j = i-1
        while(j >= 0): 
            if (arr[i] * arr[j] >  
                     arr[i] + arr[j]): 
                ans = ans + 1
            j = j - 1
    return ans 
      
# Driver program to test above function. 
arr = [3, 4, 5] 
n = len(arr)  
k = countPairs(arr, n) 
print(k) 
      
# This code is contributed by Sam007. 

