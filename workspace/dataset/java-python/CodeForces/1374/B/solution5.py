t = int(input())for _ in range(t):    n = int(input())    c2 =0     c1 =0    while(n%2==0):        n = n//2        c2 += 1    while(n%3==0):        n = n//3        c1 +=1    if(n==1 and c1>=c2):        print((c1-c2)+c1)    else:        print(-1)
