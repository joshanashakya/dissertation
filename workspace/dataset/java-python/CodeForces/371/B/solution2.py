import math def gcd(a,b):    if a<b:a,b=b,a    while a%b!=0:        a,b=b,a%b    return b a,b=map(int,input().split()) res=0 for i in [2,3,5]:    r=0    while a%i==0:        a//=i        r+=1    while b%i==0:        b//=i        r-=1    res+=abs(r) if gcd(a, b) == 1 and a!=b:    print(-1)else:    print(res)   
