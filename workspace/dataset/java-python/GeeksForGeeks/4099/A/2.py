

# Python3 implementation for counting 
# maximum length palindromes 
import math as mt 
  
# factorial of a number 
def fact(n): 
    ans = 1
    for i in range(1, n + 1):  
        ans = ans * i 
    return (ans) 
  
# function to count maximum length palindromes. 
def numberOfPossiblePallindrome(string, n): 
      
    # Count number of occurrence 
    # of a charterer in the string 
    mp = dict() 
    for i in range(n): 
        if string[i] in mp.keys(): 
            mp[string[i]] += 1
        else:  
            mp[string[i]] = 1
  
    k = 0 # Count of singles 
    num = 0 # numerator of result 
    den = 1 # denominator of result 
    fi = 0
    for it in mp: 
      
        # if frequency is even  
        # fi = ci / 2 
        if (mp[it] % 2 == 0): 
            fi = mp[it] // 2
          
        # if frequency is odd  
        # fi = ci - 1 / 2. 
        else: 
          
            fi = (mp[it] - 1) // 2
            k += 1
  
        # sum of all frequencies 
        num = num + fi  
          
        # product of factorial of 
        # every frequency 
        den = den * fact(fi)  
      
    # if all character are unique  
    # so there will be no pallindrome,  
    # so if num != 0 then only we are 
    # finding the factorial 
    if (num != 0):  
        num = fact(num) 
          
    ans = num //den  
      
    if (k != 0): 
      
        # k are the single  
        # elements that can be 
        # placed in middle 
        ans = ans * k 
      
    return (ans) 
  
# Driver Code 
string = "ababab"
n = len(string) 
print(numberOfPossiblePallindrome(string, n)) 
  
# This code is contributed by  
# Mohit kumar 29 

