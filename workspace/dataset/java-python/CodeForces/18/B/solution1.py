n,d,m,l=list(map(int,input().split()))a=0x=0for i in range(n):    x+=((l-a)//d+1)*d    if x%m>l:        break    a=x%mprint(x)
