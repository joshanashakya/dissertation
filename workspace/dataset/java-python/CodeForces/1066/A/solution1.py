t=int(input())for _ in range(0,t):    L,v,l,r=map(int,input().split())    s=l//v+L//v-r//v    if(l%v==0): s-=1    print(s) 	    	  	  	 	  	 			 	 	 	  	
