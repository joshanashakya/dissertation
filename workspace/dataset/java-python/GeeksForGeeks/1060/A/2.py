

# Python3 implementation of the approach  
  
# Function to return the number  
# of unique pairs in the array  
def countUnique(arr, n) : 
      
    s = set();  
    for i in range(n) : 
        s.add(arr[i]);  
  
    count = pow(len(s), 2);  
  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 2, 4, 2, 5, 3, 5 ];  
    n = len(arr); 
  
    print(countUnique(arr, n)); 
      
# This code is contributed by Ryuga 

