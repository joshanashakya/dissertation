

# Python 3 program to implement 
# the above approach 
  
# Function that returns  
# the number of pairs 
def count_pairs(a, b, n, m): 
      
    # Count of odd and even numbers 
    odd1 = 0
    even1 = 0
    odd2 = 0
    even2 = 0
  
    # Traverse in the first array 
    # and count the number of odd 
    # and evene numbers in them 
    for i in range(n): 
        if (a[i] % 2): 
            odd1 += 1
        else: 
            even1 += 1
  
    # Traverse in the second array 
    # and count the number of odd 
    # and evene numbers in them 
    for i in range(m): 
        if (b[i] % 2): 
            odd2 += 1
        else: 
            even2 += 1
  
    # Count the number of pairs 
    pairs = (min(odd1, even2) + 
             min(odd2, even1)) 
  
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

