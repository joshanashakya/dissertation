

# Python3 implementation of the approach 
  
# Function to sort and print the array  
# according to the new alphabetical order 
def sortStringArray(s, a, n): 
      
    # Sort the array according to the new alphabetical order 
    a = sorted(a, key = lambda word: [s.index(c) for c in word]) 
    for i in a: 
        print(i, end =' ') 
  
# Driver code 
s = "fguecbdavwyxzhijklmnopqrst"
a = ["geeksforgeeks", "is", "the", "best", "place", "for", "learning"] 
n = len(a) 
sortStringArray(s, a, n) 

