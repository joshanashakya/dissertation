n,b=map(int,input().split())l=list(map(int,input().split()))d=1a1=b1=0for x in range(n-1,-1,-1):    a1+=l[x]*d    d*=b  m,a=map(int,input().split())l=list(map(int,input().split()))d=1for x in range(m-1,-1,-1):    b1+=l[x]*d    d*=a if a1==b1:print('=')elif a1>b1:print('>')else:print('<')
