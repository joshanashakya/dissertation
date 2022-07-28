

# Python3 program to count the number less  
# than N, whose all permutation is greater  
# than or equal to the number.  
  
# Return the count of the number having  
# all permutation greater than or equal  
# to the number.  
def countNumber(n): 
    result = 0
  
    # Pushing 1 to 9 because all number  
    # from 1 to 9 have this property. 
    for i in range(1, 10): 
        s = []  
        if (i <= n): 
            s.append(i)  
            result += 1
  
        # take a number from stack and add  
        # a digit smaller than last digit  
        # of it.  
        while len(s) != 0: 
            tp = s[-1]  
            s.pop() 
            for j in range(tp % 10, 10): 
                x = tp * 10 + j  
                if (x <= n): 
                    s.append(x)  
                    result += 1
  
    return result 
  
# Driver Code 
if __name__ == '__main__': 
  
    n = 15
    print(countNumber(n)) 
  
# This code is contributed by PranchalK 

