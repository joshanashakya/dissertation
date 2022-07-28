

# Python 3 implementation of the approach 
  
# Function to return count of required pairs 
def count_pairs(a,b,n,m): 
      
    # Count of odd and even numbers 
    # from both the arrays 
      
    odd1 = 0
    even1 = 0
    odd2 = 0
    even2 = 0
      
    # Find the count of odd and 
    # even elements in a[] 
    for i in range(n): 
        if (a[i] % 2 == 1): 
            odd1 += 1
        else: 
            even1 += 1
  
    # Find the count of odd and 
    # even elements in b[] 
      
    for i in range(m): 
        if (b[i] % 2 == 1): 
            odd2 += 1
        else: 
            even2 += 1
              
    # Count the number of pairs 
    pairs = min(odd1, odd2) + min(even1, even2) 
      
    # Return the number of pairs 
    return pairs 
  
# Driver code 
if __name__ == '__main__': 
    a = [9, 14, 6, 2, 11] 
    b = [8, 4, 7, 20] 
    n = len(a) 
    m = len(b) 
    print(count_pairs(a, b, n, m)) 
  
# This code is contributed by 
# Surendra_Gangwar 

