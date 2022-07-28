

# Python3 program to find number of  
# digits in N that divide N.  
  
# Utility function to check  
# divisibility by digit  
def divisible(N, digit):  
   
    ans = 0;  
    for i in range(len(N)):  
        # (N[i]-'0') gives the digit  
        # value and form the number  
        ans = (ans * 10 + (ord(N[i]) - ord('0')));  
        ans %= digit;  
    return (ans == 0);  
  
# Function to count digits which  
# appears in N and divide N  
# divide[10] --> array which tells  
# that particular digit divides N or not  
# count[10] --> counts frequency of  
#                 digits which divide N  
def allDigits(N):  
   
    # We initialize all digits of N  
    # as not divisible by N.  
    divide =[False]*10;  
    divide[1] = True; # 1 divides all numbers  
  
    # start checking divisibility of  
    # N by digits 2 to 9  
    for digit in range(2,10):  
        # if digit divides N then  
        # mark it as true  
        if (divisible(N, digit)):  
            divide[digit] = True;  
  
    # Now traverse the number string to  
    # find and increment result whenever  
    # a digit divides N.  
    result = 0;  
    for i in range(len(N)):  
       
        if (divide[(ord(N[i]) - ord('0'))] == True):  
            result+=1;  
  
    return result;  
  
# Driver Code  
N = "122324";  
print(allDigits(N));  
  
# This code is contributed by mits  

