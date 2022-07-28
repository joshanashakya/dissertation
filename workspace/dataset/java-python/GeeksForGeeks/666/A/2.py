

# Python3 implementation of the approach  
   
# Function to return the count  
# of unique pairs in the array  
def getPairs(arr, n) : 
       
    # Set to store unique pairs  
    h = set()  
    for i in range(n - 1) : 
        for j in range(i + 1, n) : 
              
            # Create pair of (a[i], a[j])  
            # and add it to the hashset  
            h.add((arr[i], arr[j]));  
               
    # Return the size of the HashSet  
    return len(h);  
   
# Driver code  
if __name__ == "__main__" : 
        
    arr = [ 1, 2, 2, 4, 2, 5, 3, 5 ]  
    n = len(arr)  
       
    print(getPairs(arr, n)) 
       
# This code is contributed by Ryuga 

