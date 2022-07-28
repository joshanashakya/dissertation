n=int(input())a=list(map(int,input().split()))print(('Yes','No')[any([(a[i]-(-1)**i*a[0])%n!=i for i in range(n)])])  		  	  	 	      	  					
