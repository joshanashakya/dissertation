n,k = map(int,input().split())i=0j=nwhile(i<=j):    a = (i+j)//2    s=(n-a)*(n-a+1)//2    if(s-a==k):        print(a)        break    elif(s-a > k):        i=a    else:        j=a
