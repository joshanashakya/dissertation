

# Python 3 program to find LCS 
# with permutations allowed 
  
# Function to calculate longest string 
# str1     --> first string 
# str2     --> second string 
# count1[] --> hash array to calculate frequency 
#               of characters in str1 
# count[2] --> hash array to calculate frequency 
#               of characters in str2 
# result --> resultant longest string whose 
# permutations are sub-sequence  
# of given two strings 
def longestString(str1, str2): 
  
    count1 = [0] * 26
    count2 = [0] * 26
  
    # calculate frequency of characters 
    for i in range( len(str1)): 
        count1[ord(str1[i]) - ord('a')] += 1
    for i in range(len(str2)): 
        count2[ord(str2[i]) - ord('a')] += 1
  
    # Now traverse hash array 
    result = "" 
    for i in range(26): 
  
        # append character ('a'+i) in  
        # resultant string 'result' by  
        # min(count1[i],count2i]) times 
        for j in range(1, min(count1[i], 
                              count2[i]) + 1): 
            result = result + chr(ord('a') + i) 
  
    print(result) 
  
# Driver Code 
if __name__ == "__main__": 
      
    str1 = "geeks"
    str2 = "cake"
    longestString(str1, str2) 
  
# This code is contributed by ita_c 

