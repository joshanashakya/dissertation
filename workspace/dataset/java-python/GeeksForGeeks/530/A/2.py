

# Python3 implementation of the approach  
  
# Function to return the number of  
# positive integers less than or equal  
# to N that have odd number of digits  
def odd_digits(n) : 
  
    if (n < 10) : 
        return n;  
    elif (n / 10 < 10) : 
        return 9;  
    elif (n / 100 < 10) : 
        return 9 + n - 99;  
    elif (n / 1000 < 10) : 
        return 9 + 900;  
    elif (n / 10000 < 10) :  
        return 909 + n - 9999;  
    else : 
        return 90909;  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 893;  
  
    print(odd_digits(n));  
  
# This code is contributed by AnkitRai01 

