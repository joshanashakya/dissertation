

# Python 3 program to print the last occurrence 
# of every element in relative order 
  
# Function to print the last occurrence 
# of every element in an array 
def printLastOccurrence(a, n): 
      
    # used in hashing 
    mp = {i:0 for i in range(7)} 
  
    # iterate and store the last  
    # index of every element 
    for i in range(n): 
        mp[a[i]] = i 
  
    # iterate and check for the last 
    # occurrence of every element 
    for i in range(n): 
        if (mp[a[i]] == i): 
            print(a[i], end = " ") 
  
# Driver Code 
if __name__ == '__main__': 
    a = [1, 5, 5, 1, 6, 1] 
    n = len(a) 
    printLastOccurrence(a, n) 
  
# This code is contributed by 
# Surendra_Gangwar 

