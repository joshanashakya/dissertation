

# Python3 program to count number  
# of visible boxes. 
  
import collections 
  
# return the minimum number of visible boxes 
def minimumBox(arr, n): 
  
    q = collections.deque([]) 
  
    # sorting the array 
    arr.sort() 
  
    q.append(arr[0]) 
  
    # traversing the array 
    for i in range(1, n): 
  
        now = q[0] 
  
        # checking if current element 
        # is greater than or equal to 
        # twice of front element 
        if(arr[i] >= 2 * now): 
            q.popleft() 
  
        # Pushing each element of array 
        q.append(arr[i]) 
  
    return len(q) 
  
# driver Program 
if __name__=='__main__': 
    arr = [4, 1, 2, 8 ] 
    n = len(arr) 
    print(minimumBox(arr, n)) 
  
# This code is contributed by 
# Sanjit_Prasad 

