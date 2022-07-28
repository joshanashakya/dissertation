n,m=map(int,input().split())z=m/n#print(z)cnt=0while(z!=1):	if z%2==0:		z=z//2		cnt=cnt+1		elif z%3==0:		z=z//3 		cnt=cnt+1 		else:		cnt=-1;		break; print(cnt)   	  			 			 	 	 	    	 		  	
