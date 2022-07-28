

# Python3 implementation of above approach  
from collections import defaultdict 
  
# Function to return frequent  
# word from S1 that isn't  
# present in S2  
def smallestFreq(S1, S2):  
  
    banned = defaultdict(lambda:0) 
      
    i = 0
      
    # create map of banned words  
    while i < len(S2):  
  
        s = ""  
        while i < len(S2) and S2[i] != ' ':  
            s += S2[i] 
            i += 1
              
        i += 1
        banned[s] += 1
  
    result = defaultdict(lambda:0)  
    ans = "" 
    freq = 0
    i = 0
      
    # find smallest and most frequent word  
    while i < len(S1):  
  
        s = ""  
        while i < len(S1) and S1[i] != ' ':  
            s += S1[i] 
            i += 1
          
        i += 1
          
        # check if word is not banned  
        if banned[s] == 0: 
            result[s] += 1
              
            if (result[s] > freq or 
               (result[s] == freq and s < ans)): 
                ans = s  
                freq = result[s]  
              
    # return answer  
    return ans  
  
# Driver Code 
if __name__ == "__main__":  
  
    S1 = "geeks for geeks is best place to learn"
    S2 = "bad place"
  
    print(smallestFreq(S1, S2))  
  
# This code is contributed  
# by Rituraj Jain 

