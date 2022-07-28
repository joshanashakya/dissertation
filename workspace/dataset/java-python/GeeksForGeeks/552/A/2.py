

# Python 3 program to count number  
# of steps required to convert an  
# integer array to array of factors. 
MAX = 1000001
  
# array to store prime factors 
factor = [0] * MAX
  
# function to generate all prime  
# factors of numbers from 1 to 10^6 
def cal_factor(): 
  
    factor[1] = 1
  
    # Initializes all the positions 
    # with their value. 
    for i in range(2, MAX): 
        factor[i] = i 
  
    # Initializes all multiples 
    # of 2 with 2 
    for i in range(4, MAX, 2): 
        factor[i] = 2
  
    # A modified version of Sieve of  
    # Eratosthenes to store the smallest  
    # prime factor that divides every number. 
    i = 3
    while i * i < MAX: 
  
        # check if it has no prime factor. 
        if (factor[i] == i) : 
  
            # Initializes of j starting 
            # from i*i 
            for j in range(i * i, MAX, i) : 
  
                # if it has no prime factor  
                # before, then stores the  
                # smallest prime divisor 
                if (factor[j] == j): 
                    factor[j] = i 
                      
        i += 1
  
# function to calculate the 
# number of representations 
def no_of_representations(a, n): 
  
    # keep an count of prime factors 
    count = 0
  
    # traverse for every element 
    for i in range(n) : 
  
        temp = a[i] 
        flag = 0
  
        # count the no of factors 
        while (factor[temp] != 1) : 
            flag = -1
            count += 1
            temp = temp // factor[temp] 
  
        # subtract 1 if Ai is not 1 as the  
        # last step wont be taken into count 
        count += flag 
  
    return count 
  
# Driver Code 
if __name__ == "__main__": 
      
    # call sieve to calculate the factors 
    cal_factor() 
  
    a = [ 4, 4, 4 ] 
    n = len(a) 
  
    print(no_of_representations(a, n)) 
  
# This code is contributed 
# by ChitraNayal 

