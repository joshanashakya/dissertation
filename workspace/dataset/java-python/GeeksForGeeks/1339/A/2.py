

# Python3 program to count the  
# different possible string  
# form by replacing two same  
# characters with one  
  
# Array to find the fibonacci  
# sequence  
fib = [0]*100005;  
  
# Function to find the  
# fibonacci sequence  
def computeFibonacci() : 
  
    fib[0] = 1;  
    fib[1] = 1;  
    for i in range(2, 100005) : 
        fib[i] = fib[i - 1] + fib[i - 2];  
  
# Function to count all  
# possible strings  
def countString(string) : 
  
    # Initialize ans = 1  
    ans = 1;  
    cnt = 1;  
  
    for i in range(1, len(string)) : 
  
        # If two consecutive  
        # char are same  
        # increase cnt  
        if (string[i] == string[i - 1]) :  
            cnt += 1;  
  
        # Else multiply the  
        # fib[cnt] to ans  
        # and initialize ans  
        # to 1  
        else : 
            ans = ans * fib[cnt];  
            cnt = 1;  
              
    # If str = abcdeeee, then  
    # for last "eeee" the  
    # count munst be updated  
    ans = ans * fib[cnt];  
  
    # Return the total count  
    return ans;  
  
# Driver's Code  
if __name__ == "__main__" :  
  
    string = "abdllldefkkkk";  
  
    # Function to precompute  
    # all the fibonacci number  
    computeFibonacci();  
  
    # Function call to find  
    # the count  
    print(countString(string));  
      
# This code is contributed by Yash_R 

