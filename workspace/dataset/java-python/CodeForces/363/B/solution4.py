n,k=map(int,input().split())l=list(map(int,input().split()))s=0a=[]if n==1:    print(1)else:    for i in range(k):        a.append(l[i])        s+=l[i]    mn=s    ans=k-1    #print(s,a)    for i in range(k,n):        s-=l[i-k]        s+=l[i]        #print("*",s)        #print(l[i:i+k])        if s<mn:            mn=s            ans=i    print(ans-k+2)
