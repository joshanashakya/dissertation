n = int(input())ip = list(map(int, input().split()))m = max(ip);ans  = 0x =[0]*(m+1); p =[]p.append(1)for i in ip:    x[i]+=1for k in range(2,m+1,1):    l = k    z  = 0    while l<=m:        z+=x[l]        l+=k    if ans < z:        p.append(z)print(max(p))		   		   		  	  						 			  	