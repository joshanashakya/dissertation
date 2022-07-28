

# Python3 Program for removing characters 
# from reversed string where vowels are 
# present in original string 
  
# Function for replacing the string 
def replaceOriginal(s, n): 
  
    # initialize a string of length n 
    r = [' '] * n 
  
    # Traverse through all characters of string 
    for i in range(n): 
  
        # assign the value to string r 
        # from last index of string s 
        r[i] = s[n - 1 - i] 
  
        # if s[i] is a consonant then 
        # print r[i] 
        if (s[i] != 'a' and s[i] != 'e' and 
            s[i] != 'i' and s[i] != 'o' and 
            s[i] != 'u'): 
            print(r[i], end = "") 
    print() 
  
# Driver Code 
if __name__ == "__main__": 
    s = "geeksforgeeks"
    n = len(s) 
    replaceOriginal(s, n) 
  
# This code is conributed by 
# sanjeev2552 

