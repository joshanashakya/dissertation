

# Program to check if 
# a number is cyclic 
# Function to generate 
# all cyclic permutations 
# of a number 
def isCyclic(N): 
  
    # Count digits and check if all 
    # digits are same 
    num = N 
    count = 0
    digit =(num % 10) 
    allSame = True
  
    while (num>0): 
        count+= 1
        if (num % 10 != digit): 
            allSame = False
        num = num // 10
      
   
    # If all digits are same, then 
    # not considered cyclic. 
    if (allSame == True): 
        return False
   
    # If counts of digits is even and 
    # two halves are same, then the 
    # number is not considered cyclic. 
    if (count % 2 == 0): 
      
        halfPower = pow(10, count//2) 
        firstHalf = N % halfPower 
        secondHalf = N / halfPower 
        if (firstHalf == firstHalf and
            isCyclic(firstHalf)): 
            return False
      
   
    num = N 
    while (True): 
   
        # Following three lines 
        # generates a 
        # circular pirmutation 
        # of a number. 
        rem = num % 10
        div = num // 10
        num = pow(10, count - 1) * rem + div 
   
        # If all the permutations 
        # are checked 
        # and we obtain original 
        # number exit 
        # from loop. 
        if (num == N): 
            break
   
        if (num % N != 0): 
            return False
      
    return True
  
# Driver code 
  
N = 142857
if (isCyclic(N)): 
    print("Yes") 
else: 
    print("No") 
  
# This code is contributed 
# by Anant Agarwal. 

