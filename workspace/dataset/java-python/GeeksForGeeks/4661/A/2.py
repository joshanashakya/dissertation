

# Python3 implementation of the approach  
# Function to find string score  
def strScore(str, s, n):  
    score = 0
    index = 0
    for i in range(n):  
        if (str[i] == s): 
            for j in range(len(s)): 
                score += (ord(s[j]) - 
                          ord('a') + 1) 
            index = i + 1
            break
    score = score * index 
    return score 
  
# Driver code  
str = ["sahil", "shashanak", "sanjit",  
                  "abhinav", "mohit" ]  
s = "abhinav"
n = len(str) 
score = strScore(str, s, n);  
print(score) 
  
# This code is contributed  
# by sahishelangia 

