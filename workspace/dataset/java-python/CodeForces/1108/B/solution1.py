n=int(input())s=list(map(int,input().split()))b=max(s)for i in range(1,b+1):    if(b%i==0):        s.pop(s.index(i))a=max(s)print(a,b) 		 				 	      		     	  				
