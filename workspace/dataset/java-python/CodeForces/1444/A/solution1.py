from math import ceilfor

ad in range(int(
    input())):  # n =int(input())    p,q=list(map(int,input().split()))    if p%q!=0:        print(p)    else:        #print(p%q,p-(p//q)*q)        x=[];y=[]        qq=q        for i in range(2,int(q**0.5)+2):            c=0            if qq%i==0:                x.append(i)            while qq%i==0:                qq//=i                c+=1            if c!=0:                y.append(c)        if qq!=1:            x.append(qq)            y.append(1)        z=[]        alpha=p        for i in range(len(x)):            c=0            while p%x[i]==0:                c+=1                p//=x[i]            z.append(x[i]**(c-y[i]+1))        #print(x,y,z,qq,q,p,alpha)        print(alpha//(min(z)))
