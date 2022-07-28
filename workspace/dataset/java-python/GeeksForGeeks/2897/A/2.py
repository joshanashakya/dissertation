

# Python3 to implement above function 
  
# function to count no of digits 
def dig(a): 
    count = 0; 
    while (a > 0): 
        a /= 10
        count+=1
    return count 
  
  
# function to implement above approach 
def required_number(num, n, d): 
    flag = 0
    power=0
    a=0
    for i in range(num,0,-1): 
        power = pow(10, i) 
        a = n % power 
          
        # if difference between power 
        # and n doesn't exceed d 
          
        if (d > a): 
            flag = 1
            break
    if(flag): 
        t=0
        # loop to build a number from the 
        # appropriate no of digits containg only 9 
        for j in range(0,i): 
            t += 9 * pow(10, j) 
          
        # if the build number is 
        # same as original number(n) 
        if(n % power ==t): 
            print(n,end="") 
        else: 
            # observation 
            print((n - (n % power) - 1),end="") 
    else: 
        print(n,end="") 
# Driver Code 
  
if __name__ == "__main__": 
    n = 1029
    d = 102
  
# variable that stores no of digits in n 
    num = dig(n) 
    required_number(num, n, d) 
  
# this code is contributed by mits 

