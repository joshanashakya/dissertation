import mathn,m,k=input().split()n=int(n);m=int(m);k=float(k)ans=[];re=[]for i in range(n):    q=0    x,y = input().split()    q += (.99999 <= (math.modf(int(y)*k)[0]))    if int(int(y)*k)+q > 99 :        ans.append([x , int(int(y)*k)+q])        re.append(x)for j in range(m):    c=input()    if c not in re :        ans.append([c,0])ans.sort()        print(len(ans))        for s,i in ans:    print(s,i)              	   		    	  			 			
