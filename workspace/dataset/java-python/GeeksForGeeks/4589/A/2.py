

# Python3 program to demonstrate that Fibonacci numbers 
# that are divisible by their indexes have indexes 
# as either power of 5 or multiple of 12. 
  
if __name__=='__main__': 
    MAX = 100
# storing Fibonacci numbers 
    arr = [0 for i in range(MAX)] 
    arr[0] = 0
    arr[1] = 1
    for i in range(2, MAX): 
        arr[i] = arr[i - 1] + arr[i - 2] 
  
    print("Fibonacci numbers divisible by their indexes are :") 
    for i in range(1, MAX): 
        if(arr[i] % i == 0): 
            print(i,end=" ") 
  
# This code is contributed by 
# Sanjit_Prasad 

