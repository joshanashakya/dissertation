from math import gcddef lcm(a,b):    return a*b//gcd(a,b)input()a=list(map(int,input().split()))t=gcd(a[0],a[1])q=lcm(a[0],a[1])for i in range(2,len(a)):    q=gcd(q,lcm(a[i],t))    t=gcd(t,a[i])print(q)					  		  	 			 			 	  	    		
