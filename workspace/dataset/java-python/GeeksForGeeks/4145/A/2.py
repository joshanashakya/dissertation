

# Python3 implementation of the approach  
  
# Function to return the sum  
# of the digits of n  
def sumDigits(n) :  
  
    sum = 0;  
    while (n > 0) : 
        digit = n % 10;  
        sum += digit;  
        n //= 10;  
  
    return sum;  
  
# Function that return true if the  
# decoded string is divisible by 6  
def isDivBySix(string , n) :  
  
    # To store the sum of the digits  
    sum = 0;  
  
    # For each character, get the  
    # sum of the digits  
    for i in range(n) : 
        sum += (ord(string[i]) - 
                ord('a') + 1);  
      
    # If the sum of digits is  
    # not divisible by 3  
    if (sum % 3 != 0) : 
        return False;  
  
    # Get the last digit of  
    # the number formed  
    lastDigit = (ord(string[n - 1]) - 
                 ord('a') + 1) % 10;  
  
    # If the last digit is  
    # not divisible by 2  
    if (lastDigit % 2 != 0) : 
        return False;  
    return True;  
  
# Driver code  
if __name__ == "__main__" :  
  
    string = "ab";  
    n = len(string);  
  
    if (isDivBySix(string, n)) : 
        print("Yes");  
    else : 
        print("No");  
  
# This code is contributed by AnkitRai01 

