s=input()a=input()m=len(a)n=len(s)c=0i=0while(i<=n-m):    if(s[i:i+m]==a):        c+=1        i=i+m    else:        i+=1print(c)  	  			    	   	   			 				  	
