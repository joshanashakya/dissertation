

# Python implementation of the approach  
# Function to return the count  
# of unique pairs in the array  
def getPairs(a, n): 
      
    visited1 = set()  
      
    # un[i] stores number of unique elements  
    # from un[i + 1] to un[n - 1]  
    un = [0] * n 
      
    # Last element will have no unique elements  
    # after it  
    un[n - 1] = 0
      
    # To count unique elements after every a[i]  
    count = 0
    for i in range(n - 1, -1, -1): 
          
        # If current element has already been used  
        # i.e. not unique  
        if (a[i] in visited1): 
            un[i - 1] = count  
        else: 
            count += 1
            un[i - 1] = count  
          
        # Set to true if a[i] is visited  
        visited1.add(a[i])  
      
    visited2 = set() 
      
    # To know which a[i] is already visited  
    answer = 0
    for i in range(n - 1): 
          
        # If visited, then the pair would  
        # not be unique  
        if (a[i] in visited2): 
            continue
              
        # Calculating total unqiue pairs  
        answer += un[i]  
          
        # Set to true if a[i] is visited  
        visited2.add(a[i])  
      
    return answer  
  
# Driver code  
  
a = [1, 2, 2, 4, 2, 5, 3, 5] 
n = len(a) 
  
# Prthe count of unique pairs  
print(getPairs(a, n))  
  
# This code is contributed by SHUBHAMSINGH10 

