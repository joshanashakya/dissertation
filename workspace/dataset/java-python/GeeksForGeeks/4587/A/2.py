

# Python3 program to demonstrate that sequence of last 
# digits of Fibonacci numbers repeats after 60. 
  
  
if __name__=='__main__': 
    max = 100
    arr = [0 for i in range(max)] 
    arr[0] = 0
    arr[1] = 1
  
# storing Fibonacci numbers 
    for i in range(2, max): 
        arr[i] = arr[i - 1] + arr[i - 2] 
  
    # Traversing through store numbers 
    for i in range(1, max - 1): 
          
  
    # Since first two number are 0 and 1 
    # so, if any two consecutive number encounter 0 and 1 
    # at their unit place, then it clearly means that 
    # number is repeating/ since we just have to find 
    # the sum of previous two number 
        if((arr[i] % 10 == 0) and (arr[i + 1] % 10 == 1)): 
            break
  
    print("Sequence is repeating after index", i) 
  
# This code is contributed by 
# Sanjit_Prasad 

