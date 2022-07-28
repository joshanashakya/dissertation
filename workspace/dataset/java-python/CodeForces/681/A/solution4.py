x=int(input())f=0for i in range(x):    s,n,m=input().split()    n=int(n)    m=int(m)    if( m>n and m>=2400 and n>=2400):        f=1if f==1:print('YES')else:print('NO')         
