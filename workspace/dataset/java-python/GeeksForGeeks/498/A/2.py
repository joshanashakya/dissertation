

# Python3 program to count the occurrence  
# of nth term in first n terms  
# of Van Eck's sequence  
MAX = 10000
sequence = [0] * (MAX + 1);  
  
# Utility function to compute  
# Van Eck's sequence  
def vanEckSequence() : 
  
    # Loop to generate sequence  
    for i in range(MAX) :  
  
        # Check if sequence[i] has occured  
        # previously or is new to sequence  
        for j in range( i - 1, -1, -1) :  
            if (sequence[j] == sequence[i]) : 
                  
                # If occurrence found  
                # then the next term will be  
                # how far back this last term  
                # occured previously  
                sequence[i + 1] = i - j;  
                break;  
  
# Utility function to count  
# the occurrence of nth term  
# in first n terms of the sequence  
def getCount(n) :  
  
    # Initialize count as 1  
    count = 1;  
  
    i = n - 1;  
  
    while (sequence[i + 1] != 0) : 
  
        # Increment count if (i+1)th term  
        # is non-zero  
        count += 1;  
  
        # Previous occurrence of sequence[i]  
        # will be it (i - sequence[i+1])th position  
        i = i - sequence[i + 1];  
  
    # Return the count of occurrence  
    return count;  
  
# Driver code  
if __name__ == "__main__" :  
  
    # Pre-compute Van Eck's sequence  
    vanEckSequence();  
  
    n = 5;  
  
    # Print count of the occurrence of nth term  
    # in first n terms of the sequence  
    print(getCount(n));  
  
    n = 11;  
  
    # Print count of the occurrence of nth term  
    # in first n terms of the sequence  
    print(getCount(n)) ;  
  
# This code is contributed by AnkitRai01 

