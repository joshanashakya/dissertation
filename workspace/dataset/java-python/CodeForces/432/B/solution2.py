n=int(input())a=[0]*nc=[0]*100001for i in range(n):    s,a[i]=map(int,input().split())    c[s]+=1for i in range(n):    print((n-1) + c[a[i]] , (n-1) - c[a[i]])        
