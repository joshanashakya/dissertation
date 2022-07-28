t = int(input())for i in range(t):	s = input()	zeros = s.count('0')	ones = s.count('1')	m = min(zeros,ones)	if(m%2==0):	    print("NET")	else:	    print("DA")	  
