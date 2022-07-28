

# Python 3 program to Find the lexicographically 
# smallest substring in a given string with 
# maximum frequency and contains a's and b's only 
  
# Function to Find the lexicographically 
# smallest substring in a given string with 
# maximum frequency and contains a's and b's only. 
def maxFreq(s, a, b): 
    # To store frequency of digits 
    fre = [0 for i in range(10)] 
  
    # size of string 
    n = len(s) 
  
    # Take lexicographically larger digit in b 
    if (a > b): 
        swap(a, b) 
  
    # get frequency of each character 
    for i in range(0,n,1): 
        a = ord(s[i]) - ord('0') 
        fre[a] += 1
  
    # If no such string exits 
    if (fre[a] == 0 and fre[b] == 0): 
        return -1
  
    # Maximum frequency 
    elif (fre[a] >= fre[b]): 
        return a 
    else: 
        return b 
  
# Driver program 
if __name__ == '__main__': 
    a = 4
    b = 7
  
    s = "47744"
  
    print(maxFreq(s, a, b)) 
  
# This code is contributed by 
# Surendra_Gangwar 

