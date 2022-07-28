

# Python3 implementation of the approach  
  
# Function to return the kth element  
# of the Odd-Even sequence  
# of length n  
def findK(n, k) : 
      
    # Finding the index from where the  
    # even numbers will be stored  
    if (n % 2 == 0) : 
        pos = n // 2;  
    else : 
        pos = (n // 2) + 1;  
  
    # Return the kth element  
    if (k <= pos) : 
        return (k * 2 - 1);  
    else : 
        return ((k - pos) * 2);  
  
# Function to return the count of  
# set bits in the kth number of the  
# odd even sequence of length n  
def countSetBits( n, k) : 
      
    # Required kth number  
    kth = findK(n, k); 
      
    # Return the count of set bits 
    return bin(kth).count('1');  
  
# Driver code  
if __name__ == "__main__" : 
    n = 18; k = 12; 
    print(countSetBits(n, k));  
  
# This code is contributed by kanugargng 

