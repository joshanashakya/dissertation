

# Python3 program to find all the palindromic  
# divisors of a number 
from math import sqrt; 
  
# Function to check is num is palindromic  
# or not  
def isPalindrome(n) :  
  
    # Convert n to string str  
    string = str(n);  
  
    # Starting and ending index of  
    # string str  
    s = 0; e = len(string) - 1;  
    while (s < e) : 
  
        # If char at s and e are  
        # not equals then return  
        # false  
        if (string[s] != string[e]) : 
            return False;  
          
        s += 1;  
        e -= 1;  
      
    return True;  
  
# Function to find palindromic divisors  
def palindromicDivisors(n) :  
  
    # To sore the palindromic divisors of  
    # number n  
    PalindromDivisors = [];  
  
    for i in range(1, int(sqrt(n))) : 
  
        # If n is divisible by i  
        if (n % i == 0) : 
  
            # Check if number is a perfect square  
            if (n // i == i) : 
  
                # Check divisor is palindromic,  
                # then store it  
                if (isPalindrome(i)) : 
                    PalindromDivisors.append(i);  
              
            else : 
  
                # Check if divisors are palindrome  
                if (isPalindrome(i)) : 
                    PalindromDivisors.append(i);  
  
                # Check if n / divisors is palindromic  
                # or not  
                if (isPalindrome(n // i)) : 
                    PalindromDivisors.append(n // i);  
  
    # Print all palindromic divisors in sorted order  
    PalindromDivisors.sort();  
      
    for i in range(len( PalindromDivisors)) : 
        print(PalindromDivisors[i] ,end=" ");  
  
# Driver code  
if __name__ == "__main__" :  
  
    n = 66;  
  
    # Function call to find all palindromic  
    # divisors  
    palindromicDivisors(n);  
  
# This code is contributed by AnkitRai01 

