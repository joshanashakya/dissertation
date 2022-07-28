

# Python3 implementation of 
# the approach  
MAX = 100000;  
  
# To store first N Catalan numbers  
catalan = [0] * MAX;  
  
# Function to find first n  
# Catalan numbers  
def catalanDP(n) :  
  
    # Initialize first two values  
    # in table  
    catalan[0] = catalan[1] = 1;  
  
    # Fill entries in catalan[]  
    # using recursive formula  
    for i in range(2, n + 1) : 
        catalan[i] = 0;  
        for j in range(i) : 
            catalan[i] += (catalan[j] * 
                           catalan[i - j - 1]);  
  
# Function to return the minimum  
# changes required  
def CatalanSequence(arr, n) : 
      
    # Find first n Catalan Numbers  
    catalanDP(n);  
  
    s = set();  
  
    # a and b are first two  
    # Catalan Sequence numbers  
    a = 1 ; b = 1;  
  
    # Insert first n catalan  
    # elements to set  
    s.add(a);  
    if (n >= 2) : 
        s.add(b);  
  
    for i in range(2, n) : 
        s.add(catalan[i]);  
      
    temp = set() 
    for i in range(n) : 
  
        # If catalan element is present  
        # in the array then remove it  
        # from set  
        if arr[i] in s : 
            temp.add(arr[i]) 
      
    s = s - temp ; 
      
    # Return the remaining number  
    # of elements in the set  
    return len(s);  
  
# Driver code  
if __name__ == "__main__" : 
  
    arr = [1, 1, 2, 5, 41];  
    n = len(arr) 
  
    print(CatalanSequence(arr, n));  
  
# This code is contributed by Ryuga 

