

# Python3 program to print all the numbers 
# that divides maximum of array elements 
  
# Function that prints all the numbers 
# which divides maximum of array elements 
def printNumbers(a, n): 
  
    # hash to store the number of times 
    # a factor is there 
    mpp = dict() 
  
    for i in range(n): 
        num = a[i] 
  
        # find all the factors 
        for j in range(1, num + 1): 
  
            if j * j > num: 
                break
  
            # if j is factor of num 
            if (num % j == 0): 
                if (j != 1): 
                    mpp[j]=mpp.get(j, 0) + 1
  
                if ((num // j) != j): 
                    mpp[num // j]=mpp.get(num//j, 0) + 1
              
    # find the maximum times 
    # it can divide 
    maxi = 0
    for it in mpp: 
        maxi = max(mpp[it], maxi) 
  
    # print all the factors of 
    # numbers which divides the 
    # maximum array elements 
    for it in mpp: 
        if (mpp[it] == maxi): 
            print(it,end=" ") 
      
# Driver Code 
a = [12, 15, 27, 20, 40 ] 
n = len(a) 
printNumbers(a, n) 
  
# This code is contributed by mohit kumar 

