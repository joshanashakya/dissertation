

# Python3 implementation of the approach 
  
MAX_INT=1000000
  
# Function to return the minimum length 
# of a sub-array which contains 
# 0, 1, 2, 3, 4 as a sub-sequence 
def solve(Array, N): 
  
    # To store the indices where 0, 1, 2, 
    # 3 and 4 are present 
    pos=[[] for i in range(5)] 
  
    # To store if there exist a valid prefix 
    # of sequence in array 
    pref=[0 for i in range(5)]  
  
    # Base Case 
    if (Array[0] == 0):  
        pref[0] = 1
        pos[0].append(0) 
      
  
    ans = MAX_INT 
  
    for i in range(N):  
  
        # If current element is 0 
        if (Array[i] == 0):  
  
            # Update the count of 0s till now 
            pref[0]+=1
  
            # Push the index of the new 0 
            pos[0].append(i) 
          
        else : 
  
            # To check if previous element of the 
            # given sequence is found till now 
            if (pref[Array[i] - 1] > 0):  
                pref[Array[i]]+=1
                pos[Array[i]].append(i) 
  
                # If it is the end of sequence 
                if (Array[i] == 4) : 
                    end = i 
                    start = i 
  
                    # Iterate for other elements of the sequence 
                    for j in range(3,-1,-1):  
                        s = 0
                        e = len(pos[j]) - 1
                        temp = -1
  
                        # Binary Search to find closest occurrence 
                        # less than equal to starting point 
                        while (s <= e):  
                            m = (s + e) // 2
                            if (pos[j][m] <= start) : 
                                temp = pos[j][m] 
                                s = m + 1
                              
                            else : 
                                e = m - 1
                              
                          
  
                        # Update the starting point 
                        start = temp 
                      
  
                    ans = min(ans, end - start + 1) 
                  
              
          
      
  
    return ans 
  
# Driver code 
  
Array = [ 0, 1, 2, 3, 4, 2, 0, 3, 4]  
N = len(Array) 
  
print(solve(Array, N)) 
  
# This code is contributed by mohit kumar 29 

