n=int(input())pos = (list(map(int, input().split())))last=-1for i in range(n-1):    if(pos[i]>pos[i+1]):        last=iprint(last+1)	 	     		   	          		  	 	
