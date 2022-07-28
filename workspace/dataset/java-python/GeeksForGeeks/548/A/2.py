

# Python 3 program to print prime factors in 
# pairs. 
   
def printPFsInPairs(n):  
    for i in range(1, int(pow(n, 1 / 2))+1): 
        if n % i == 0: 
            print(str(i) +"*"+str(int(n / i)))    
   
# Driver code 
n = 24
printPFsInPairs(n) 

