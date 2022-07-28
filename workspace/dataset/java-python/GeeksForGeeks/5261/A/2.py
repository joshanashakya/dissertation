

# Python 3 program to find lexicographically  
# largest and smallest substrings of size k. 
def getSmallestAndLargest(s, k): 
      
    # Initialize min and max as  
    # first substring of size k 
    currStr = s[:k] 
    lexMin = currStr 
    lexMax = currStr 
  
    # Consider all remaining substrings.  
    # We consider every substring ending  
    # with index i. 
    for i in range(k, len(s)): 
        currStr = currStr[1 : k] + s[i] 
        if (lexMax < currStr): 
            lexMax = currStr 
        if (lexMin >currStr): 
            lexMin = currStr 
  
    # Print result. 
    print(lexMin) 
    print(lexMax) 
  
# Driver Code 
if __name__ == '__main__': 
    str1 = "GeeksForGeeks"
    k = 3
    getSmallestAndLargest(str1, k) 
  
# This code is contributed by 
# Surendra_Gangwar 

