

# Python3 implementation of the approach  
  
# Function to return the count  
# of set bits in n  
def countSetBits(n) : 
  
    count = 0;  
    while (n) : 
          
        n &= (n - 1);  
        count += 1
          
    return count; 
  
  
# Function to return the count  
# of required pairs  
def pairs(arr, n, k) : 
  
    # To store the count  
    count = 0;  
    for i in range(n) :  
        for j in range(i + 1, n) : 
  
            # Sum of set bits in both the integers  
            sum = countSetBits(arr[i]) + countSetBits(arr[j]);  
  
            # If current pair satisfies  
            # the given condition  
            if (sum == k) : 
                count += 1 ;  
                  
    return count;  
  
  
# Driver code  
if __name__ == "__main__" :  
  
    arr = [ 1, 2, 3, 4, 5 ];  
      
    n = len(arr);  
    k = 4;  
      
    print(pairs(arr, n, k)); 
      
# This code is contributed by AnkitRai01 

