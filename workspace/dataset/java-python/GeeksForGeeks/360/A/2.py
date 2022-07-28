

# Python3 implementation of the approach 
import sys 
  
# Function to return the minimum number  
# of moves required to make n divisible  
# by 25 
def minMoves(n): 
  
    # Convert number into string 
    s = str(n); 
  
    # To store required answer 
    ans = sys.maxsize; 
  
    # Length of the string 
    len1 = len(s); 
  
    # To check all possible pairs 
    for i in range(len1):  
        for j in range(len1):  
            if (i == j): 
                continue; 
  
            # Make a duplicate string 
            t = s; 
            cur = 0; 
  
            # Number of swaps required to place 
            # ith digit in last position 
            list1 = list(t); 
            for k in range(i,len1 - 1): 
                e = list1[k]; 
                list1[k] = list1[k + 1]; 
                list1[k + 1] = e; 
                cur += 1; 
            t = ''.join(list1); 
  
            # Number of swaps required to place 
            # jth digit in 2nd last position 
            list1 = list(t); 
            for k in range(j - (j > i),len1 - 2):  
                e = list1[k]; 
                list1[k] = list1[k + 1]; 
                list1[k + 1] = e; 
                cur += 1; 
            t = ''.join(list1); 
  
            # Find first non zero digit 
            pos = -1; 
            for k in range(len1):  
                if (t[k] != '0'):  
                    pos = k; 
                    break; 
  
            # Place first non zero digit 
            # in the first position 
            for k in range(pos,0,-1): 
                e = list1[k]; 
                list1[k] = list1[k + 1]; 
                list1[k + 1] = e; 
                cur += 1; 
            t = ''.join(list1); 
  
  
            # Convert string to number 
            nn = int(t); 
  
            # If this number is divisible by 25 
            # then cur is one of the possible answer 
            if (nn % 25 == 0): 
                ans = min(ans, cur); 
  
    # If not possible 
    if (ans == sys.maxsize): 
        return -1; 
  
    return ans; 
  
# Driver code 
n = 509201; 
print(minMoves(n)); 
  
# This code is contributed 
# by chandan_jnu 

