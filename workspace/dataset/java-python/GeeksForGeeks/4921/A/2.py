

      
# Python program to count all substrings with same 
# first and last characters. 
  
# Returns true if first and last characters 
# of s are same. 
def checkEquality(s): 
    return (ord(s[0]) == ord(s[len(s) - 1])); 
  
def countSubstringWithEqualEnds(s): 
    result = 0; 
    n = len(s); 
  
    # Starting poof substring 
    for i in range(n): 
  
    # Length of substring 
        for j in range(1,n-i+1): 
  
        # Check if current substring has same 
        # starting and ending characters. 
            if (checkEquality(s[i:i+j])): 
                result+=1; 
  
    return result; 
  
# Driver code 
s = "abcab"; 
print(countSubstringWithEqualEnds(s)); 
  
# This code contributed by PrinciRaj1992 

