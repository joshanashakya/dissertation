

# Python3 program to count the set  
# bits after taking XOR with a  
# number K  
  
# Function to store EVEN and odd variable  
def countEvenOdd(arr, n, K) :  
  
    even = 0; odd = 0;  
  
    # Store the count of even and  
    # odd set bit  
    for i in range(n) : 
  
        # Count the set bit using  
        # in built function  
        x = bin(arr[i]).count('1');  
        if (x % 2 == 0) : 
            even += 1;  
        else : 
            odd += 1;  
  
    # Count of set-bit of K  
    y = bin(K).count('1');  
  
    # If y is odd then, count of  
    # even and odd set bit will  
    # be interchanged  
    if (y & 1) : 
        print("Even =",odd ,", Odd =", even);  
  
    # Else it will remain same as  
    # the original array  
    else : 
        print("Even =" , even ,", Odd =", odd);  
  
  
# Driver's Code  
if __name__ == "__main__" : 
      
    arr = [ 4, 2, 15, 9, 8, 8 ];  
    K = 3;  
    n = len(arr);  
  
    # Function call to count even  
    # and odd  
    countEvenOdd(arr, n, K);  
      
# This code is contributed by Yash_R 

