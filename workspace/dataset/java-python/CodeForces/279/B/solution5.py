n,t=map(int,input().split())a=list(map(int,input().split()))c=0h={}s=0l=0for i in range(n):    s+=a[i]    if s<=t:        c=max(c,i-l+1)     else:        s-=a[l]        l+=1print(c)
