

# Python3 implementation of the approach  
  
# Function to return the count  
# of good permutations  
def Permutations(n, k):  
  
    # For m = 0, ans is 1  
    ans = 1
  
    # If k is greater than 1  
    if k >= 2:  
        ans += (n) * (n - 1) // 2
  
    # If k is greater than 2  
    if k >= 3: 
        ans += ((n) * (n - 1) * 
                (n - 2) * 2 // 6) 
  
    # If k is greater than 3  
    if k >= 4: 
        ans += ((n) * (n - 1) * (n - 2) *
                      (n - 3) * 9 // 24) 
  
    return ans  
  
# Driver code  
if __name__ == "__main__": 
  
    n, k = 5, 2
    print(Permutations(n, k))  
      
# This code is contributed 
# by Rituraj Jain 

