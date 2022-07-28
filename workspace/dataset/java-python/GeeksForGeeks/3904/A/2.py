

# Python3 program to count the  
# number of pairs  
MAX = 256
  
# Function to count the number  
# of equal pairs 
def countPairs(s): 
      
    # Hash table  
    cnt = [0 for i in range(0, MAX)] 
  
    # Traverse the string and count  
    # occurrence  
    for i in range(len(s)): 
        cnt[ord(s[i]) - 97] += 1
  
    # Stores the answer  
    ans = 0
  
    # Traverse and check the occurrence  
    # of every character  
    for i in range(0, MAX): 
        ans += cnt[i] * cnt[i] 
  
    return ans 
  
# Driver code  
if __name__=="__main__": 
    s = "geeksforgeeks"
    print(countPairs(s)) 
  
# This code is contributed  
# by Sairahul099          

