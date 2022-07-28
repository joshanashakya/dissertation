

# Python program to prindividual words without if and 
# without switch 
  
# To store digit to word mapping 
word= ["zero", "one", "two", "three","four","five",  
                "six", "seven", "eight", "nine"] 
  
def printWordsWithoutIfSwitch(n): 
  
    # Store individual digits 
    digits = [0 for i in range(10)] # a 32 bit has at-most 10 digits 
  
    dc = 0 # Initialize digit count for given number 'n' 
  
    # The below loop stores individual digits of n in 
    # reverse order. do-while is used to handle "0" input 
    while True: 
        digits[dc] = n%10
        n = n//10
        dc += 1
        if(n==0): 
            break
  
    # Traverse individual digits and prwords using 
    # word[][] 
    for i in range(dc-1,-1,-1): 
        print(word[digits[i]],end=" ") 
  
# Driver program 
n = 350
printWordsWithoutIfSwitch(n) 
  
# This code is contributed by mohit kumar 29 

