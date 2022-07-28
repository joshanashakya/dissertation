

# Python3 program to count all  
# rotations divisible by 8 
  
# function to count of all  
# rotations divisible by 8 
def countRotationsDivBy8(n): 
    l = len(n) 
    count = 0
  
    # For single digit number 
    if (l == 1): 
        oneDigit = int(n[0]) 
        if (oneDigit % 8 == 0): 
            return 1
        return 0
  
    # For two-digit numbers  
    # (considering all pairs) 
    if (l == 2):  
  
        # first pair 
        first = int(n[0]) * 10 + int(n[1]) 
  
        # second pair 
        second = int(n[1]) * 10 + int(n[0]) 
  
        if (first % 8 == 0): 
            count+=1
        if (second % 8 == 0): 
            count+=1
        return count 
  
    # considering all  
    # three-digit sequences 
    threeDigit=0
    for i in range(0,(l - 2)):  
        threeDigit = (int(n[i]) * 100 + 
                     int(n[i + 1]) * 10 +
                     int(n[i + 2])) 
        if (threeDigit % 8 == 0): 
            count+=1
  
    # Considering the number  
    # formed by the last digit 
    # and the first two digits 
    threeDigit = (int(n[l - 1]) * 100 +
                 int(n[0]) * 10 + 
                 int(n[1])) 
  
    if (threeDigit % 8 == 0): 
        count+=1
  
    # Considering the number  
    # formed by the last two 
    # digits and the first digit 
    threeDigit = (int(n[l - 2]) * 100 + 
                 int(n[l - 1]) * 10 +
                 int(n[0])) 
    if (threeDigit % 8 == 0): 
        count+=1
  
    # required count  
    # of rotations 
    return count 
  
  
# Driver Code 
if __name__=='__main__': 
    n = "43262488612"
    print("Rotations:",countRotationsDivBy8(n)) 
  
# This code is contributed by mits. 

