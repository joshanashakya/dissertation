

# Python3 program to find the prime  
# numbers between a given interval 
   
if __name__ == '__main__': 
      
    # Declare the variables 
    a, b, i, j = 0, 0, 0, 0
      
    # Ask user to enter lower value of interval 
    print("Enter lower bound of the interval:",end = "") 
      
    a = int(input()) # Take input 
    print(a) 
      
    # Ask user to enter upper value of interval 
    print("Enter upper bound of the interval:",end = "") 
      
    b = int(input()) # Take input 
    print(b) 
      
    # Print display message 
    print("Prime numbers between", a, "and",b, "are:", end = "") 
      
      
    # Explicitly handling the cases when a is less than 2 
    if (a == 1): 
        print(a,end=" ") 
        a+=1
        if (b >= 2): 
            print(a,end=" ") 
            a+=1
    if (a == 2): 
        print(a,end=" ") 
      
    # MAKING SURE THAT a IS ODD BEFORE WE BEGIN  
    # THE LOOP 
    if (a % 2 == 0): 
        a+=1
    # NOTE : WE TRAVERSE THROUGH ODD NUMBERS ONLY 
    for i in range(a,b+1,2): 
          
        # flag variable to tell 
        # if i is prime or not 
        flag = 1
        # WE TRAVERSE TILL SQUARE ROOT OF j only. 
        # (LARGEST POSSIBLE VALUE OF A PRIME FACTOR) 
        j = 2 
        while(j * j <= i): 
            if (i % j == 0): 
                flag = 0
                break
            j+=1
          
        # flag = 1 means i is prime 
        # and flag = 0 means i is not prime 
        if (flag == 1): 
            print(i,end=" ") 
  
# This code is contributed by shubhamsingh10 

