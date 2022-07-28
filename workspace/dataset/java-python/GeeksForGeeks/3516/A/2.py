

# Python3 Program to print all palindromic  
# primes smaller than or equal to n.  
      
# A function that reurns true only if  
# num contains one digit  
def oneDigit(num): 
      
    # comparison operation is faster than 
    # division operation. So using following 
    # instead of "return num / 10 == 0;" 
    return (num >= 0 and num < 10);  
      
# A recursive function to find out whether  
# num is palindrome or not. Initially, dupNum  
# contains address of a copy of num. 
def isPalUtil(num, dupNum): 
      
    # Base case (needed for recursion termination):  
    # This statement/ mainly compares the first  
    # digit with the last digit  
    if (oneDigit(num)):  
        return (num == (dupNum) % 10);  
      
    # This is the key line in this method. Note  
    # that all recursive/ calls have a separate  
    # copy of num, but they all share same copy  
    # of dupNum. We divide num while moving up  
    # the recursion tree  
    if (not isPalUtil(int(num / 10), dupNum)):  
        return False;  
      
    # The following statements are executed  
    # when we move up the recursion call tree  
    dupNum =int(dupNum/10);  
      
    # At this point, if num%10 contains ith  
    # digit from beginning, then (dupNum)%10  
    # contains ith digit from end  
    return (num % 10 == (dupNum) % 10);  
      
# The main function that uses recursive  
# function isPalUtil() to find out whether  
# num is palindrome or not  
def isPal(num): 
      
    # If num is negative, make it positive  
    if (num < 0):  
        num = -num;  
      
    # Create a separate copy of num, so that  
    # modifications made to address dupNum  
    # don't change the input number.  
    dupNum = num; # dupNum = num  
      
    return isPalUtil(num, dupNum);  
      
# Function to generate all primes and checking  
# whether number is palindromic or not  
def printPalPrimesLessThanN(n): 
      
    # Create a boolean array "prime[0..n]" and  
    # initialize all entries it as true. A value  
    # in prime[i] will finally be false if i is  
    # Not a prime, else true.  
    prime = [True] * (n + 1);  
    p = 2; 
    while (p * p <= n): 
          
        # If prime[p] is not changed,  
        # then it is a prime  
        if (prime[p]):  
              
            # Update all multiples of p  
            for i in range(p * 2, n + 1, p):  
                prime[i] = False; 
        p += 1; 
          
    # Print all palindromic prime numbers  
    for p in range(2, n + 1):  
          
        # checking whether the given number  
        # is prime palindromic or not  
        if (prime[p] and isPal(p)):  
            print(p, end = " ");  
      
# Driver Code  
n = 100;  
print("Palindromic primes smaller",  
      "than or equal to", n, "are :");  
printPalPrimesLessThanN(n);  
  
# This code is contributed by chandan_jnu 

