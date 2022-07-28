

# Count minimum changes to  
# make array from 1 to n 
  
def countChanges(arr, n): 
  
    # it will contain all initial  
    # elements of array for log(n) 
    # complexity searching 
    s = [] 
  
    # Inserting all elements in a list 
    for i in range(n):  
        s.append(arr[i]) 
      
    # Finding elements to be changed 
    count = 0
    for i in range(1, n + 1) : 
        if i not in s: 
            count += 1
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
    arr = [8, 55, 22, 1, 3, 22, 4, 5] 
    n = len(arr) 
    print(countChanges(arr, n)) 
  
# This code is contributed  
# by ChitraNayal 

