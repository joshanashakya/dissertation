

# Most efficient Python program to count all  
# substrings with same first and last characters. 
  
MAX_CHAR = 26; # assuming lower case only 
  
def countSubstringWithEqualEnds(s): 
    result = 0; 
    n = len(s); 
  
    # Calculating frequency of each character 
    # in the string. 
    count = [0]*MAX_CHAR; 
    for i in range(n): 
        count[ord(s[i])-ord('a')]+=1; 
  
    # Computing result using counts 
    for i in range(MAX_CHAR): 
        result += (count[i]*(count[i]+1)/2); 
  
    return result; 
  
# Driver code 
s = "abcab"; 
print(countSubstringWithEqualEnds(s)); 
  
  
# This code is contributed by 29AjayKumar 

