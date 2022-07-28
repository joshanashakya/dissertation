

# Python3 implementation of the approach 
  
# Function to print the required permutation 
def findPerm(n, differences): 
    ans = [] 
    ans.append(0) 
  
    # Take x = 0 for simplicity 
    x = 0
  
    # Calculate athe differences 
    # and store it in a vector 
    for i in range(n - 1): 
        diff = differences[i] 
        x = x + diff 
        ans.append(x) 
  
    # Preserve the original array 
    anss = ans 
    ans = sorted(ans) 
    flag = -1
  
    # Check if athe consecutive elements 
    # have difference = 1 
    for i in range(1, n): 
        res = ans[i] - ans[i - 1] 
        if (res != 1): 
            flag = 0
  
    # If consecutive elements don't have 
    # difference 1 at any position then 
    # the answer is impossible 
    if (flag == 0): 
        print("-1") 
        return
  
    # Else store the indices and values 
    # at those indices in a map 
    # and finainty print them 
    else: 
        mpp = dict() 
        j = 1
        value_at_index = [] 
        for x in ans: 
            mpp[x] = j 
            j += 1
  
        for x in anss: 
            value_at_index.append(mpp[x]) 
  
        for x in value_at_index: 
            print(x, end = " ") 
        print() 
  
# Driver code 
differences=[] 
differences.append(2) 
differences.append(-3) 
differences.append(2) 
n = len(differences) + 1
findPerm(n, differences) 
  
# This code is contributed by mohit kumar 

