# cook your dish heredef find(s):    n=len(s)    x=0    for i in range(n):        x=x*10 + (ord(s[i])-ord('0'))            if(x<10):        return x     ans=x//10-1     ans+=9    if(s[0]<=s[n-1]):        ans+=1     return ansl,r=map(int,input().split())l=l-1l=str(l)r=str(r)res1=find(l) res2=find(r)print( res2 - res1)
