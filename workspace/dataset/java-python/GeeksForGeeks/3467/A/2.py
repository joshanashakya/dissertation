

# Python3 implementation of the approach 
from sys import maxsize 
  
# checks whether a string has  
# similar characters side by side 
def sameCharAdj(string): 
    n = len(string) 
    st = set() 
    st.add(string[0]) 
  
    for i in range(1, n): 
  
        # If similar chars side by side, continue 
        if string[i] == string[i - 1]: 
            continue
  
        # If we have found a char equal to current 
        # char and does not exist side to it, 
        # return false 
        if string[i] in st: 
            return False
  
        st.add(string[i]) 
    return True
  
# counts min swap operations to convert a string 
# that has similar characters side by side 
def minSwaps(string, l, r, cnt, minm): 
  
    # Base case 
    if l == r: 
        if sameCharAdj(string): 
            return cnt 
        else: 
            return maxsize 
  
    for i in range(l + 1, r + 1, 1): 
        string[i], string[l] = string[l], string[i] 
        cnt += 1
  
        # considering swapping of i and l chars 
        x = minSwaps(string, l + 1, r, cnt, minm) 
  
        # Backtrack 
        string[i], string[l] = string[l], string[i] 
        cnt -= 1
  
        # not considering swapping of i and l chars 
        y = minSwaps(string, l + 1, r, cnt, minm) 
  
        # taking min of above two 
        minm = min(minm, min(x, y)) 
  
    return minm 
  
# Driver Code 
if __name__ == "__main__": 
    string = "abbaacb"
    string = list(string) 
  
    n = len(string) 
    cnt = 0
    minm = maxsize 
    print(minSwaps(string, 0, n - 1, cnt, minm)) 
  
# This code is contributed by 
# sanjeev2552 

