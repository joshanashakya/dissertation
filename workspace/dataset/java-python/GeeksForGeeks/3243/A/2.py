

# Python3 program to find the minimum number of  
# palindromes required to express N as a sum  
  
# A utility for creating palindrome  
def createPalindrome(_input, isOdd):  
   
    n = palin = _input  
  
    # checks if number of digits is odd or even  
    # if odd then neglect the last digit of _input in  
    # finding reverse as in case of odd number of  
    # digits middle element occur once  
    if isOdd:  
        n //= 10 
  
    # Creates palindrome by just appending revers  
    # of number to itself  
    while n > 0:   
        palin = palin * 10 + (n % 10)  
        n //= 10 
      
    return palin  
   
# Function to generate palindromes  
def generatePalindromes(N):  
   
    palindromes = []  
  
    # Run two times for odd and even  
    # length palindromes  
    for j in range(0, 2):   
  
        # Creates palindrome numbers with first half as i.  
        # Value of j decides whether we need an odd length  
        # or even length palindrome.  
        i = 1
        number = createPalindrome(i, j) 
        while number <= N:  
            palindromes.append(number) 
            i += 1
            number = createPalindrome(i, j) 
       
    return palindromes  
   
# Function to find the minimum  
# number of palindromes required  
# to express N as a sum  
def minimumNoOfPalindromes(N):  
   
    # Checking if the number is a palindrome  
    b = a = str(N)  
    b = b[::-1]  
    if a == b:  
        return 1 
  
    # Checking if the number is a  
    # sum of two palindromes  
  
    # Getting the list of all palindromes upto N  
    palindromes = generatePalindromes(N)  
  
    # Sorting the list of palindromes  
    palindromes.sort()  
  
    l, r = 0, len(palindromes) - 1 
    while l < r: 
          
        if palindromes[l] + palindromes[r] == N:  
            return 2 
        elif palindromes[l] + palindromes[r] < N:  
            l += 1 
        else: 
            r -= 1 
       
    # The answer is three if the  
    # control reaches till this point  
    return 3 
   
# Driver code  
if __name__ == "__main__":  
   
    N = 65 
    print(minimumNoOfPalindromes(N)) 
      
# This code is contributed by Rituraj Jain 

