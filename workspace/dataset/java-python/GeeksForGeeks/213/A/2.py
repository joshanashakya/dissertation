

# Python3 implementation of the approach  
  
# Function to generate sequence  
# from the given string  
def makeSeq(s, a) :  
  
    # Initialize vector to  
    # store sequence  
    seq = [];  
  
    # First add all the digits  
    # of group A from left to right  
    for i in range(len(s)) : 
        if (s[i] == 'A') : 
            seq.append(a[i]);  
  
    # Then add all the digits  
    # of group B from left to right  
    for i in range(len(s)) : 
        if (s[i] == 'B') : 
            seq.append(a[i]);  
  
    # Return the sequence  
    return seq;  
  
# Function that returns true if  
# the sequence is non-decreasing  
def checkSeq(v) :  
  
    # Initialize result  
    check = True;  
  
    for i in range(1, len(v)) : 
        if (v[i] < v[i - 1]) : 
            check = False;  
  
    return check;  
  
# Function to partition the digits  
# of an integer such that it satisfies  
# the given conditions  
def digitPartition(X) :  
      
    # Convert the integer to string  
    num = str(X);  
  
    # Length of the string  
    l = len(num);  
  
    # Array to store the digits  
    a = [0]*l;  
  
    # Storing the digits of X in array  
    for i in range(l) :  
        a[i] = (ord(num[i]) - ord('0'));  
  
    for D in range(10) : 
  
        # Initialize the result  
        res = "";  
  
        # Loop through the digits  
        for i in range(l) :  
  
            # Put into group A if  
            # digit less than D  
            if (a[i] < D) : 
                res += 'A';  
  
            # Put into group B if  
            # digit greater than D  
            elif (a[i] > D) : 
                res += 'B';  
  
            # Put into group C if  
            # digit equal to D  
            else : 
                res += 'C';  
  
        flag = False;  
  
        # Loop through the digits  
        # to decide for group C digits  
        for i in range(l) : 
  
            # Set flag equal to true  
            # if group B digit present  
            if (res[i] == 'B') : 
                flag = True;  
  
            # If flag is true put in  
            # group A or else put in B  
            res = list(res); 
              
            if (res[i] == 'C') : 
                res[i] = 'A' if flag else 'B';  
  
        # Generate the sequence from partition  
        seq = makeSeq(res, a);  
  
        # Check if the sequence is  
        # non decreasing  
        if (checkSeq(seq)) : 
            return "".join(res);  
  
    # Return -1 if no such  
    # partition is possible  
    return "-1";  
  
# Driver code  
if __name__ == "__main__" :  
  
    X = 777147777;  
  
    print(digitPartition(X));  
  
# This code is contributed by AnkitRai01 

