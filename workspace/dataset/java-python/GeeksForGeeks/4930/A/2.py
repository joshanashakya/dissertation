

# Python program to print all 
# distinct circular strings 
# of length M in lexicographical order 
  
# Function to print all the distinct substrings 
# in lexicographical order 
def printStrings(s, l, m): 
  
    # stores all the distinct substrings 
    c = set() 
  
    # Append the string to self 
    s = s+s 
  
    # Iterate over the length to generate 
    # all substrings of length m 
    for i in range(l): 
  
        # insert the substring of length m 
        # in the set 
        c.add(s[i:i+m]) 
  
    # prints all the distinct circular 
    # substrings of length m 
    for i in c: 
  
        # Prints the substring 
        print(i, end=" ") 
  
  
# Driver code 
if __name__ == "__main__": 
  
    string = "saurav"
    N = len(string) 
    M = 4
  
    printStrings(string, N, M) 
  
# This code is contributed by 
# sanjeev2552 

