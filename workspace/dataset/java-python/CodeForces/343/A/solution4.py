def resistors(a,b):    ans=0    while b:        ans+=a//b        a,b=b,a%b    return ansa,b=map(int,input().strip().split())print(resistors(a,b))
